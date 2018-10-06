package negocio;

import java.sql.Date;
import java.util.Collection;

public class Partida {
 
	private Date Fechaincio;
	private Date FechaFin;
	private Jugador JugadorTurno;
	private Collection<Pareja> Parejas;
	private Collection<Envite> Envites;
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
	public Jugador getJugadorTurno() {
		return JugadorTurno;
	}
	public void setJugadorTurno(Jugador jugadorTurno) {
		JugadorTurno = jugadorTurno;
	}
	public Collection<Pareja> getParejas() {
		return Parejas;
	}
	public void setParejas(Collection<Pareja> parejas) {
		Parejas = parejas;
	}
	public Collection<Envite> getEnvites() {
		return Envites;
	}
	public void setEnvites(Collection<Envite> envites) {
		Envites = envites;
	}
	
	
	
	
	
	
	
}
