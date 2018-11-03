package entities;

import java.util.Collection;

public class GrupoEntity {

	private Long id;
	private JugadorEntity jugadorAdmin;
	private String nombre;
	private Collection<JugadorEntity> jugadores;
	private Collection<ParejaEntity> parejas;
	private Collection<ParejaEntity> partidas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public JugadorEntity getJugadorAdmin() {
		return jugadorAdmin;
	}

	public void setJugadorAdmin(JugadorEntity jugadorAdmin) {
		this.jugadorAdmin = jugadorAdmin;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Collection<JugadorEntity> getJugadores() {
		return jugadores;
	}

	public void setJugadores(Collection<JugadorEntity> jugadores) {
		this.jugadores = jugadores;
	}

	public Collection<ParejaEntity> getParejas() {
		return parejas;
	}

	public void setParejas(Collection<ParejaEntity> parejas) {
		this.parejas = parejas;
	}

	public Collection<ParejaEntity> getPartidas() {
		return partidas;
	}

	public void setPartidas(Collection<ParejaEntity> partidas) {
		this.partidas = partidas;
	}


}
