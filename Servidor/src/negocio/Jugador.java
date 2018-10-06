package negocio;

import java.util.Collection;

import dto.JugadorDTO;

public class Jugador {

	private int id_jugador;
	private String nickname;
	private String mail;
	private String password;
	private Categoria categoria;
	private boolean mano;
	private boolean estado;
	private int puntos;
	private int partidasJugadas;
	private int partidasGanadas;
	private Collection<Carta> cartas;
	private Collection<Carta> cartasjugadas;
	private Carta cartaActual;

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

	public Collection<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(Collection<Carta> cartas) {
		this.cartas = cartas;
	}

	public Collection<Carta> getCartasjugadas() {
		return cartasjugadas;
	}

	public void setCartasjugadas(Collection<Carta> cartasjugadas) {
		this.cartasjugadas = cartasjugadas;
	}

	public Carta getCartaActual() {
		return cartaActual;
	}

	public void setCartaActual(Carta cartaActual) {
		this.cartaActual = cartaActual;
	}
	
	public Jugador save(JugadorDTO jugadorDTO){
		System.out.println("Jugador nuevo :" + jugadorDTO.getNickname());
		Jugador jugador = new Jugador();
		jugador.setNickname(jugadorDTO.getNickname());
		jugador.setId_jugador(jugador.getId_jugador());
		return jugador;
	}

}
