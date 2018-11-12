package negocio;

import java.util.Collection;
import java.util.Date;

public class Partida {
 
	private Date fechaIncio;
	private Date fechaFin;
	private Jugador jugadorTurno;
	private Collection<Pareja> parejas;
	private Collection<TipoEnvite> envites;
	
	
	public Date getFechaIncio() {
		return fechaIncio;
	}
	public void setFechaIncio(Date fechaincio) {
		fechaIncio = fechaincio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Jugador getJugadorTurno() {
		return jugadorTurno;
	}
	public void setJugadorTurno(Jugador jugadorTurno) {
		this.jugadorTurno = jugadorTurno;
	}
	public Collection<Pareja> getParejas() {
		return parejas;
	}
	public void setParejas(Collection<Pareja> parejas) {
		this.parejas = parejas;
	}
	public Collection<TipoEnvite> getEnvites() {
		return envites;
	}
	public void setEnvites(Collection<TipoEnvite> envites) {
		this.envites = envites;
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
