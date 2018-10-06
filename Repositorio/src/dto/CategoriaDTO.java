package dto;

public class CategoriaDTO {

	private String tipo;
	private String nombre;
	private int puntajeMin;
	private int partidasMin;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntajeMin() {
		return puntajeMin;
	}

	public void setPuntajeMin(int puntajeMin) {
		this.puntajeMin = puntajeMin;
	}

	public int getPartidasMin() {
		return partidasMin;
	}

	public void setPartidasMin(int partidasMin) {
		this.partidasMin = partidasMin;
	}

}
