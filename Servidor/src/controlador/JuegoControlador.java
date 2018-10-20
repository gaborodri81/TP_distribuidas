package controlador;

import java.util.ArrayList;
import java.util.Collection;

import dao.JugadorDAO;
import dto.JugadorDTO;
import exceptions.JugadorException;
import negocio.*;

public class JuegoControlador {

	private Collection<Jugador> jugadores;
	private static JuegoControlador instancia;
	
	public static JuegoControlador getInstancia(){
		if (instancia == null){
			instancia = new JuegoControlador();
		}
		return instancia;
	} 
	
	public JuegoControlador() {

		jugadores = new ArrayList<>();
	}

	public Collection<Jugador> getJugadores() {
		return jugadores;
	}

	
	public void altaJugador(JugadorDTO dto) {
		Jugador jugador = new Jugador();
		jugador.setId_jugador(dto.getId_jugador());

		jugadores.add(jugador);
		jugador.save(dto);

		System.out.println("Nuevo jugador:" + dto.getNickname());
		
	}

	public Jugador obtenerJugador(int idJugador) {
		Jugador jugador = null;
		for (Jugador jugadorIdx : jugadores) {
			if (jugadorIdx.getId_jugador() == idJugador) {
				jugador = jugadorIdx;
				break;
			}
		}
		return jugador;
	}
	
	public boolean login(JugadorDTO jug) throws JugadorException{		
		boolean logued = false;
		Jugador jugador = JugadorDAO.getInstance().buscarPorNickname(jug.getNickname());
		if (jugador == null) {
			throw new JugadorException("Jugador inexistente  " + jug.getNickname());
		} else if (jug.getPassword().equals(jugador.getPassword())){
			
			throw new JugadorException("Usuario o password incorrectos.");

		} else {
			logued = true;
		}
		return logued;
	}
	
}
