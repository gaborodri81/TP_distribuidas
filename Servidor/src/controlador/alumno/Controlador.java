package controlador.alumno;

import java.util.ArrayList;
import java.util.Collection;

import dto.AlumnoDto;
import negocio.alumno.*;

public class Controlador {
	
	private Collection<Alumno> alumnos;
	private Collection<Profesor> profesor;
	private Collection<Materia> materias;
	private Collection<Curso> cursos;

	public Controlador (){
		
		alumnos = new ArrayList<>();
		profesor = new ArrayList<>();
		materias = new ArrayList<>();
		cursos = new ArrayList<>();
//		alumno= new ArrayList<>();
	}
	public Collection<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Collection<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public Collection<Profesor> getProfesor() {
		return profesor;
	}

	public void setProfesor(Collection<Profesor> profesor) {
		this.profesor = profesor;
	}

	public Collection<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(Collection<Materia> materias) {
		this.materias = materias;
	}

	public Collection<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(Collection<Curso> cursos) {
		this.cursos = cursos;
	}

	public void altaAlumno (AlumnoDto dto){
		
		new Alumno().save();
					
System.out.println("Nuevo alumno:" + dto.getLegajo());
	}
	
	public Alumno obtener (int legajo){
		Alumno alumno = null;
		for (Alumno o : alumnos){
			if (o.getLegajo() == legajo){
				alumno = o;
				break;
			}
		}
		return alumno;
	}
}
