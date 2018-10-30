package entities;

import java.util.List;

public class Mazo {

	private List<Carta> cartasPendientes;
	private List<Carta> cartasRepartidas;

	public List<Carta> getCartasPendientes() {
		return cartasPendientes;
	}

	public void setCartasPendientes(List<Carta> cartasPendientes) {
		this.cartasPendientes = cartasPendientes;
	}

	public List<Carta> getCartasRepartidas() {
		return cartasRepartidas;
	}

	public void setCartasRepartidas(List<Carta> cartasRepartidas) {
		this.cartasRepartidas = cartasRepartidas;
	}

}
