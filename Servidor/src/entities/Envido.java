package entities;

import java.util.List;

public class Envido extends TipoEnvite {

	private Long puntosEnvido;

	public Long getPuntosEnvido() {
		return puntosEnvido;
	}

	public void setPuntosEnvido(Long puntosFaltaEnvido) {
		this.puntosEnvido = puntosFaltaEnvido;
	}
	
	public Long calcularEnvido( List<Pareja> parejasPartida){
		// @TODO
		return null;
	}
}
