package entities;

import java.util.Collection;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import dto.JugadorDTO;
import negocio.Categoria;
@Entity
@Table(name="jugadores")
public class JugadorEntity {

	@EmbeddedId
	private int id_jugador;
	private String nickname;
	private String mail;
	private String password;
	@ManyToOne()
	@JoinColumn(name="id_club")
	private Categoria categoria;
	private boolean mano;
	private boolean estado;
	private int puntos;
	private int partidasJugadas;
	private int partidasGanadas;

	public int getId_jugador() {
		return id_jugador;
	}

	public void setId_jugador(int id_jugador) {
		this.id_jugador = id_jugador;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public boolean isMano() {
		return mano;
	}

	public void setMano(boolean mano) {
		this.mano = mano;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getPartidasJugadas() {
		return partidasJugadas;
	}

	public void setPartidasJugadas(int partidasJugadas) {
		this.partidasJugadas = partidasJugadas;
	}

	public int getPartidasGanadas() {
		return partidasGanadas;
	}

	public void setPartidasGanadas(int partidasGanadas) {
		this.partidasGanadas = partidasGanadas;
	}


	
	public JugadorEntity save(JugadorDTO jugadorDTO){
		System.out.println("Jugador nuevo :" + jugadorDTO.getNickname());
		JugadorEntity jugador = new JugadorEntity();
		jugador.setNickname(jugadorDTO.getNickname());
		jugador.setId_jugador(jugador.getId_jugador());
		return jugador;
	}

}
