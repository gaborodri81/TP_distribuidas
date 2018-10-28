package entities;

import java.util.Collection;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import dto.JugadorDTO;
import negocio.Categoria;
@Entity
@Table(name="Jugador")
public class JugadorEntity {

	@Id
	private int id_jugador;
	private String nickname;
	private String mail;
	private String clave;
	private int id_categoria; //cambiar por la clase
	//private boolean mano;
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


//	public int getCategoria() {
//		return id_categoria;
//	}
//
//	public void setCategoria(Categoria categoria) {
//		this.id_categoria = categoria;
//	}

//	public boolean isMano() {
//		return mano;
//	}

//	public void setMano(boolean mano) {
//		this.mano = mano;
//	}

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

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

}
