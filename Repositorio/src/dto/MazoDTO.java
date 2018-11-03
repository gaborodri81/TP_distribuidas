package dto;

import java.util.Collection;

public class MazoDTO {
	
	private Collection<CartaDTO> cartasPendientas;
	private Collection<CartaDTO> cartasRepartidas;
	
	public Collection<CartaDTO> getCartasPendientas() {
		return cartasPendientas;
	}
	public void setCartasPendientas(Collection<CartaDTO> cartasPendientas) {
		this.cartasPendientas = cartasPendientas;
	}
	public Collection<CartaDTO> getCartasRepartidas() {
		return cartasRepartidas;
	}
	public void setCartasRepartidas(Collection<CartaDTO> cartasRepartidas) {
		this.cartasRepartidas = cartasRepartidas;
	}
	
	

}
