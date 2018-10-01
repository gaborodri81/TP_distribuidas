package negocio;

import java.util.Collection;

public class Pareja {
	
	private int id_pareja;
	private Collection<Jugador> Jugadores;
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
	
	
	
	
	

}
