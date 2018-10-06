package negocio;

import java.util.Collection;

public abstract class Juego {
	
	private Mazo mazo;
	private Collection<Partida> Partidas;
	private Partida partidaActual;
	
	public Mazo getMazo() {
		return mazo;
	}
	public void setMazo(Mazo mazo) {
		this.mazo = mazo;
	}
	public Collection<Partida> getPartidas() {
		return Partidas;
	}
	public void setPartidas(Collection<Partida> partidas) {
		Partidas = partidas;
	}
	public Partida getPartidaActual() {
		return partidaActual;
	}
	public void setPartidaActual(Partida partidaActual) {
		this.partidaActual = partidaActual;
	}

	
	
}
