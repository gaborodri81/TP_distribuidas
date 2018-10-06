package controlador;

import java.util.ArrayList;
import java.util.Collection;

import dto.JugadorDTO;
import negocio.*;

public class Controlador {

	private Collection<Jugador> jugadores;

	public Controlador() {

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
}
