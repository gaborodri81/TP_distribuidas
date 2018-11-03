package dto;

import java.util.Collection;

public abstract class JuegoDTO {
	
	private MazoDTO mazo;
	private Collection<PartidaDTO> Partidas;
	private PartidaDTO partidaActual;
	
	public MazoDTO getMazo() {
		return mazo;
	}
	public void setMazo(MazoDTO mazo) {
		this.mazo = mazo;
	}
	public Collection<PartidaDTO> getPartidas() {
		return Partidas;
	}
	public void setPartidas(Collection<PartidaDTO> partidas) {
		Partidas = partidas;
	}
	public PartidaDTO getPartidaActual() {
		return partidaActual;
	}
	public void setPartidaActual(PartidaDTO partidaActual) {
		this.partidaActual = partidaActual;
	}

	
	
}
