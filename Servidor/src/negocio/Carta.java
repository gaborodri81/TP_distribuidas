package negocio;

public class Carta {
	private int id_carta;
	private int valor;
	private String tipo;
	private int jerarquia;
	private boolean jugada;

	// Juargar la carta
	// elminar la carta
	// Jugar carta esto no creo que vaya aca la carta se juega en la partida.

	public int getId_carta() {
		return id_carta;
	}

	public void setId_carta(int id_carta) {
		this.id_carta = id_carta;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getJerarquia() {
		return jerarquia;
	}

	public void setJerarquia(int jerarquia) {
		this.jerarquia = jerarquia;
	}

	public boolean isJugada() {
		return jugada;
	}

	public void setJugada(boolean jugada) {
		this.jugada = jugada;
	}
	
	
	public void guardarCarta(){
		// @TODO 
	}
	
	public void eliminarCarta(){
		// @TODO
	}
	
	public void jugarCarta(){
		// @TODO
	}

}
