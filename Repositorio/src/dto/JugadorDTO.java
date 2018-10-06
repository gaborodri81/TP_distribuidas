package dto;

import java.io.Serializable;
import java.util.Collection;

public class JugadorDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id_jugador;
	private String nickname;
	private String mail;
	private String password;
	private CategoriaDTO categoria;
	private boolean mano;
	private boolean estado;
	private int puntos;
	private int partidasJugadas;
	private int partidasGanadas;
	private Collection<CartaDTO> cartas;
	private Collection<CartaDTO> cartasjugadas;
	private CartaDTO cartaActual;

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

	public CategoriaDTO getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaDTO categoria) {
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

	public Collection<CartaDTO> getCartas() {
		return cartas;
	}

	public void setCartas(Collection<CartaDTO> cartas) {
		this.cartas = cartas;
	}

	public Collection<CartaDTO> getCartasjugadas() {
		return cartasjugadas;
	}

	public void setCartasjugadas(Collection<CartaDTO> cartasjugadas) {
		this.cartasjugadas = cartasjugadas;
	}

	public CartaDTO getCartaActual() {
		return cartaActual;
	}

	public void setCartaActual(CartaDTO cartaActual) {
		this.cartaActual = cartaActual;
	}

}
