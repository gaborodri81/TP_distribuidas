package entities;

public abstract class TipoEnvite {

	private Long idEnvite;
	private String estado;
	private String nombre;
	public Long getIdEnvite() {
		return idEnvite;
	}
	public void setIdEnvite(Long idEnvite) {
		this.idEnvite = idEnvite;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
