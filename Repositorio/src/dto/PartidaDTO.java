package dto;

import java.sql.Date;
import java.util.Collection;

public class PartidaDTO {
 
	private Date Fechaincio;
	private Date FechaFin;
	private JugadorDTO JugadorTurno;
	private Collection<ParejaDTO> Parejas;
	private Collection<TipoEnviteDTO> Envites;
	public Date getFechaincio() {
		return Fechaincio;
	}
	public void setFechaincio(Date fechaincio) {
		Fechaincio = fechaincio;
	}
	public Date getFechaFin() {
		return FechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		FechaFin = fechaFin;
	}
	public JugadorDTO getJugadorTurno() {
		return JugadorTurno;
	}
	public void setJugadorTurno(JugadorDTO jugadorTurno) {
		JugadorTurno = jugadorTurno;
	}
	public Collection<ParejaDTO> getParejas() {
		return Parejas;
	}
	public void setParejas(Collection<ParejaDTO> parejas) {
		Parejas = parejas;
	}
	public Collection<TipoEnviteDTO> getEnvites() {
		return Envites;
	}
	public void setEnvites(Collection<TipoEnviteDTO> envites) {
		Envites = envites;
	}
	
}
