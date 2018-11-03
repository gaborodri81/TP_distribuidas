package entities;

import java.util.Date;
import java.util.List;

public class PartidaEntity {

	private Date fechaInicio;
	private Date fechaFin;
	private List<ParejaEntity> parejasPartida;
	private List<TipoEnviteEntity> envitesPartida;
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public List<ParejaEntity> getParejasPartida() {
		return parejasPartida;
	}
	public void setParejasPartida(List<ParejaEntity> parejasPartida) {
		this.parejasPartida = parejasPartida;
	}
	public List<TipoEnviteEntity> getEnvitesPartida() {
		return envitesPartida;
	}
	public void setEnvitesPartida(List<TipoEnviteEntity> envitesPartida) {
		this.envitesPartida = envitesPartida;
	}
	
	
}
