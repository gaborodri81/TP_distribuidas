package negocio;

public class Categoria {

	private String tipo;
	private String nombre;
	private int puntajeMin;
	private int partidasMin;
	private Integer order;

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
	public void guardarCategoria(){
		// @TODO !
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}
}
