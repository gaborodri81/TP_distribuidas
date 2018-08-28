package dto;

public class AlumnoDto {
	private int numerador;
	private int legajo;
	private String nombre;
	//private Collection<Curso> cursos;
	
	public AlumnoDto(int numerador, int legajo, String nombre //, Collection<Curso> cursos
			) {
		super();
		this.numerador = numerador;
		this.legajo = legajo;
		this.nombre = nombre;
		//this.cursos = cursos;
	}

	public AlumnoDto(int numero, int legajo2) {
		this.numerador = numero;
		this.legajo = legajo2;
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
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

	/*public Collection<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(Collection<Curso> cursos) {
		this.cursos = cursos;
	}*/
	
	
}
