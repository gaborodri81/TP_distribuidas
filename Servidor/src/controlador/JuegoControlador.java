package controlador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Transaction;

import dao.JugadorDAO;
import dto.JugadorDTO;
import exceptions.JugadorException;
import negocio.*;

public class JuegoControlador {

	private static JuegoControlador instancia;

	private Collection<Jugador> jugadoresLogueados;
	private static Collection<Jugador> jugadoresLibresDisponibles;
	private static Collection<Pareja> parejasLibresDisponibles;
	private static Collection<Juego> juegosEnCurso;

	public static JuegoControlador getInstancia() {
		if (instancia == null) {
			instancia = new JuegoControlador();
		}
		return instancia;
	}

	public JuegoControlador() {
		jugadoresLogueados = new ArrayList();
		jugadoresLibresDisponibles = new ArrayList();
		parejasLibresDisponibles = new ArrayList();
		juegosEnCurso = new ArrayList();
	}

	public void altaJugador(JugadorDTO dto) {
		Jugador jugador = new Jugador();
		jugador.setId_jugador(dto.getId_jugador());

		jugador.save(dto);

		System.out.println("Nuevo jugador:" + dto.getNickname());

	}

	public Partida gestionarLibreIndividual(JugadorDTO jug, Context juegoContext) throws JuegoException {

		Jugador jugador = JugadorDAO.getInstance().buscarPorNickname(jug.getNickname());
		Partida partida = armarPartidaIndividual(jugador);
		if (partida != null) {

			Chico primerChico = new Chico(sortOrden(partida.getParejas()));
			partida.agregarChico(primerChico);
			guardarPartida(partida);
			for (Pareja p : partida.getParejas()) {
				// Agrega para notificar a jugadores de inclusion en la partida
				// nueva
				if (!p.getJugador1().equals(jugador)) {
					juegoContext.agregarInvitacion(partida, p.getJugador1());
				}
				if (!p.getJugador2().equals(jugador)) {
					juegoContext.agregarInvitacion(partida, p.getJugador2());
				}
			}
			tr.commit();
			System.out.println("Primer chico partida abierta individual con id " + primerChico.getIdChico());
			primerChico.agregarObserver((ChicoTerminadoObserver) partida);
			primerChico.agregarObserver((ManoTerminadaObserver) partida);
			partida.agregarObserver((ChicoTerminadoObserver) this);
			partida.agregarObserver((ManoTerminadaObserver) this);
			juegoContext.agregarJuego(partida);
			juegoContext.agregarNotificaciones(new String[] {
					"Parejas: " + Arrays.toString(partida.getParejas().get(0).getJugadores().toArray()) + " VS "
							+ Arrays.toString(partida.getParejas().get(1).getJugadores().toArray()),
					"Turno de " + partida.getTurnoActual().getApodo() }, partida.getIdPartida());
			return partida;
		}

	}

	private void guardarPartida(Partida partida) {
		if (!(partida instanceof PartidaCerrada)) {
			// Si es una partida cerrada las parejas y grupo ya existen
			List<Pareja> parejas = partida.getParejas();
			Pareja parejaDb = null;
			for (Pareja pareja : parejas) {
				parejaDb = parejaDao.getParejaNoGrupo(pareja.getJugador1().getIdJugador(),
						pareja.getJugador2().getIdJugador());
				if (parejaDb == null) {
					parejaDao.guardar(pareja);
				} else {
					pareja.setIdPareja(parejaDb.getIdPareja());
				}
			}
		}
		pDao.guardar(partida);
	}

	/*
	 * verifica si el jugador esta logueado
	 */
	public Jugador obtenerJugador(int idJugador) {
		Jugador jugador = null;
		for (Jugador jugadorIdx : jugadoresLogueados) {
			if (jugadorIdx.getId_jugador() == idJugador) {
				jugador = jugadorIdx;
				break;
			}
		}
		return jugador;
	}

	public boolean login(JugadorDTO jug) throws JugadorException {
		boolean logued = false;
		Jugador jugador = JugadorDAO.getInstance().buscarPorNickname(jug.getNickname());
		if (jugador == null) {
			throw new JugadorException("Jugador inexistente  " + jug.getNickname());
		} else if (!jug.getPassword().equals(jugador.getPassword())) {

			throw new JugadorException("Usuario o password incorrectos.");

		} else {
			logued = true;
		}
		return logued;
	}

	/*
	 * Private methods
	 */
	private Partida armarPartidaIndividual(Jugador jugador) {
		Pareja[] parejas = combinarJugadoresDisponibles(jugador);
		Partida partida = null;
		if (parejas != null) {
			partida = new Partida();
			partida.setFechaIncio(Calendar.getInstance().getTime());
			partida.setParejas(Arrays.asList(parejas));
			return partida;
		}

		return partida;
	}

	private Pareja[] combinarJugadoresDisponibles(Jugador jugador) {
		Pareja[] parejas = null;
		Map<Integer, List<Jugador>> combinaciones = new HashMap<Integer, List<Jugador>>();
		Integer categoriaOrder = jugador.getCategoria().getOrder();
		Integer categoriaCompleta = null;
		combinaciones.put(categoriaOrder, new ArrayList<Jugador>());
		combinaciones.put(categoriaOrder - 1, new ArrayList<Jugador>());
		combinaciones.put(categoriaOrder + 1, new ArrayList<Jugador>());
		for (Jugador partner : jugadoresLibresDisponibles) {

			if (partner.getCategoria().getOrder().equals(categoriaOrder)) {
				combinaciones.get(partner.getCategoria().getOrder()).add(partner);
				if (combinaciones.get(categoriaOrder).size() == 3) {
					categoriaCompleta = categoriaOrder;
					break;
				}
			}
			if (categoriaOrder - 1 > 0 && partner.getCategoria().getOrder().equals(categoriaOrder - 1)) {
				combinaciones.get(partner.getCategoria().getOrder()).add(partner);
				if (combinaciones.get(categoriaOrder - 1).size() == 3) {
					categoriaCompleta = categoriaOrder - 1;
					break;
				}
			}
			if (partner.getCategoria().getOrder().equals(categoriaOrder + 1)) {
				combinaciones.get(partner.getCategoria().getOrder()).add(partner);
				if (combinaciones.get(categoriaOrder - 1).size() == 3) {
					categoriaCompleta = categoriaOrder - 1;
					break;
				}
			}
		}

		if (categoriaCompleta != null) {
			parejas = new Pareja[2];
			ArrayList<Jugador> completo = (ArrayList<Jugador>) combinaciones.get(categoriaCompleta);
			completo.add(jugador);
			Pareja pareja = new Pareja();
			pareja.setJugadores(completo.subList(0, 2));
			parejas[0] = pareja;

			pareja = new Pareja();
			pareja.setJugadores(completo.subList(0, 2));
			parejas[1] = pareja;
			jugadoresLibresDisponibles.removeAll(completo);
		}
		return parejas;

	}
}
