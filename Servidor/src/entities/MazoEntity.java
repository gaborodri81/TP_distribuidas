package entities;

import java.util.List;

public class MazoEntity {

	private List<CartaEntity> cartasPendientes;
	private List<CartaEntity> cartasRepartidas;

	public List<CartaEntity> getCartasPendientes() {
		return cartasPendientes;
	}

	public void setCartasPendientes(List<CartaEntity> cartasPendientes) {
		this.cartasPendientes = cartasPendientes;
	}

	public List<CartaEntity> getCartasRepartidas() {
		return cartasRepartidas;
	}

	public void setCartasRepartidas(List<CartaEntity> cartasRepartidas) {
		this.cartasRepartidas = cartasRepartidas;
	}

}
