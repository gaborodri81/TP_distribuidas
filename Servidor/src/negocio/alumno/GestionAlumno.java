package negocio.alumno;

public class GestionAlumno {
	private static GestionAlumno instancia;
	
	private GestionAlumno(){}
	
	public static GestionAlumno getInstancia(){
		if(instancia == null)
			instancia = new GestionAlumno();
		return instancia;
	}
	
	public void altaAlumno(int numero, int legajo){
		
	}
	
}
