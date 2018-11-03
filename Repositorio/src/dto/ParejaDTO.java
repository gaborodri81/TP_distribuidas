package dto;

import java.util.Collection;

public class ParejaDTO {
	
	private int id_pareja;
	private Collection<JugadorDTO> jugadores;
	private CategoriaDTO categoria;
	private Boolean mano;
	private int puntosPartidaActual;
	private int puntosHistorico;
	public int getId_pareja() {
		return id_pareja;
	}
	public void setId_pareja(int id_pareja) {
		this.id_pareja = id_pareja;
	}
	public Collection<JugadorDTO> getJugadores() {
		return jugadores;
	}
	public void setJugadores(Collection<JugadorDTO> jugadores) {
		this.jugadores = jugadores;
	}
	public CategoriaDTO getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaDTO categoria) {
		this.categoria = categoria;
	}
	public boolean isMano() {
		return mano;
	}
	public void setMano(boolean mano) {
		this.mano = mano;
	}
	public int getPuntosPartidaActual() {
		return puntosPartidaActual;
	}
	public void setPuntosPartidaActual(int puntosPartidaActual) {
		this.puntosPartidaActual = puntosPartidaActual;
	}
	public int getPuntosHistorico() {
		return puntosHistorico;
	}
	public void setPuntosHistorico(int puntosHistorico) {
		this.puntosHistorico = puntosHistorico;
	}
	

}
