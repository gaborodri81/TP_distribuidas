package entities;

public class Carta {

	private Long idCarta;
	private Long valor;
	private Long jerarquia;
	private Boolean jugada;

	public Long getIdCarta() {
		return idCarta;
	}

	public void setIdCarta(Long idCarta) {
		this.idCarta = idCarta;
	}

	public Long getValor() {
		return valor;
	}

	public void setValor(Long valor) {
		this.valor = valor;
	}

	public Long getJerarquia() {
		return jerarquia;
	}

	public void setJerarquia(Long jerarquia) {
		this.jerarquia = jerarquia;
	}

	public Boolean getJugada() {
		return jugada;
	}

	public void setJugada(Boolean jugada) {
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
