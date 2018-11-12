package negocio;

import java.util.Collection;

public class Pareja {
	
	private int id_pareja;
	private Collection<Jugador> jugadores;
	private Categoria categoria;
	private boolean mano;
	private int puntosPartidaActual;
	private int puntosHistorico;
	public int getId_pareja() {
		return id_pareja;
	}
	public void setId_pareja(int id_pareja) {
		this.id_pareja = id_pareja;
	}
	public Collection<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(Collection<Jugador> jugadores) {
		this.jugadores = jugadores;
		Categoria categoria = null;
		for (Jugador jugador : jugadores){
			if (categoria == null || categoria.getOrder()<jugador.getCategoria().getOrder()){
				categoria = jugador.getCategoria();
			}
		}
		this.categoria = categoria;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
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
	

	public void guardarPareja(){
		// @TODO 
	}
	
	
	

}
