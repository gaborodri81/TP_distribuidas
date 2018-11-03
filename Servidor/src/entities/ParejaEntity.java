package entities;

import java.util.List;

import negocio.Jugador;

public class ParejaEntity {

	private Long idPareja;
	private List<Jugador> jugadores;
	private CategoriaEntity categoriaPareja;
	private Boolean mano;
	private Long puntosPartidaActual;
	private Long puntosHistorico;

	public Long getIdPareja() {
		return idPareja;
	}

	public void setIdPareja(Long idPareja) {
		this.idPareja = idPareja;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public CategoriaEntity getCategoriaPareja() {
		return categoriaPareja;
	}

	public void setCategoriaPareja(CategoriaEntity categoriaPareja) {
		this.categoriaPareja = categoriaPareja;
	}

	public Boolean getMano() {
		return mano;
	}

	public void setMano(Boolean mano) {
		this.mano = mano;
	}

	public Long getPuntosPartidaActual() {
		return puntosPartidaActual;
	}

	public void setPuntosPartidaActual(Long puntosPartidaActual) {
		this.puntosPartidaActual = puntosPartidaActual;
	}

	public Long getPuntosHistorico() {
		return puntosHistorico;
	}

	public void setPuntosHistorico(Long puntosHistorico) {
		this.puntosHistorico = puntosHistorico;
	}

	
}
