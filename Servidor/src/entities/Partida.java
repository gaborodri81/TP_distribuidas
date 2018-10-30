package entities;

import java.util.Date;
import java.util.List;

public class Partida {

	private Date fechaInicio;
	private Date fechaFin;
	private List<Pareja> parejasPartida;
	private List<TipoEnvite> envitesPartida;
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
	public List<Pareja> getParejasPartida() {
		return parejasPartida;
	}
	public void setParejasPartida(List<Pareja> parejasPartida) {
		this.parejasPartida = parejasPartida;
	}
	public List<TipoEnvite> getEnvitesPartida() {
		return envitesPartida;
	}
	public void setEnvitesPartida(List<TipoEnvite> envitesPartida) {
		this.envitesPartida = envitesPartida;
	}
	
	public Long controlarEnvites(String tipoEnvite) {
		
		// @ TODO
		
		return null;
	}
	
	public Boolean controlarBaza(){
		// @TODO 
		
		return null;
	}
	
	
}
