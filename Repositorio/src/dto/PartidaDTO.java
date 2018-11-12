package dto;

import java.sql.Date;
import java.util.Collection;

public class PartidaDTO {
 
	private Date fechaIncio;
	private Date fechaFin;
	private JugadorDTO jugadorTurno;
	private Collection<ParejaDTO> parejas;
	private Collection<TipoEnviteDTO> envites;
	public Date getFechaIncio() {
		return fechaIncio;
	}
	public void setFechaIncio(Date fechaIncio) {
		this.fechaIncio = fechaIncio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public JugadorDTO getJugadorTurno() {
		return jugadorTurno;
	}
	public void setJugadorTurno(JugadorDTO jugadorTurno) {
		this.jugadorTurno = jugadorTurno;
	}
	public Collection<ParejaDTO> getParejas() {
		return parejas;
	}
	public void setParejas(Collection<ParejaDTO> parejas) {
		this.parejas = parejas;
	}
	public Collection<TipoEnviteDTO> getEnvites() {
		return envites;
	}
	public void setEnvites(Collection<TipoEnviteDTO> envites) {
		this.envites = envites;
	}
	
	
	
}
