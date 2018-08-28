package negocio.alumno;

import java.util.Collection;

public class Profesor {
	private int legajo;
	private String nombre;
	private Direccion direccion;
	private Collection<Materia> materias;
	
	public Profesor(int legajo, String nombre, Direccion direccion, Collection<Materia> materias) {
		super();
		this.legajo = legajo;
		this.nombre = nombre;
		this.direccion = direccion;
		this.materias = materias;
	}
	
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public Collection<Materia> getMaterias() {
		return materias;
	}
	public void setMaterias(Collection<Materia> materias) {
		this.materias = materias;
	}
	

}
