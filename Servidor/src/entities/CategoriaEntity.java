package entities;

public class CategoriaEntity {

	private String tipo;
	private String nombre;
	private Long puntajeMinimo;
	private Long partidasMinimo;

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

	public Long getPuntajeMinimo() {
		return puntajeMinimo;
	}

	public void setPuntajeMinimo(Long puntajeMinimo) {
		this.puntajeMinimo = puntajeMinimo;
	}

	public Long getPartidasMinimo() {
		return partidasMinimo;
	}

	public void setPartidasMinimo(Long partidasMinimo) {
		this.partidasMinimo = partidasMinimo;
	}

	
}
