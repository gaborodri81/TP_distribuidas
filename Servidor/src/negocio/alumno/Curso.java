package negocio.alumno;

import java.util.Collection;

public class Curso {
	private int numerador;
	private int numero;
	private Profesor profesor;
	private Materia materia;
	private String dia;
	private String turno;
	private Collection<Alumno> alumnos;
	private int maximo;
	
	
	public Curso(int numerador, int numero, Profesor profesor, Materia materia, String dia, String turno,
			Collection<Alumno> alumnos, int maximo) {
		super();
		this.numerador = numerador;
		this.numero = numero;
		this.profesor = profesor;
		this.materia = materia;
		this.dia = dia;
		this.turno = turno;
		this.alumnos = alumnos;
		this.maximo = maximo;
	}
	
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public Collection<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(Collection<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	public int getMaximo() {
		return maximo;
	}
	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}

}
