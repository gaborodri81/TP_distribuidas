package interfaces.alumno;

import java.rmi.Remote;
import java.rmi.RemoteException;

import dto.AlumnoDto;

public interface InterfaceRemota extends Remote {

	public void altaAlumno(AlumnoDto dto) throws RemoteException;
	
	// public Alumno obtener(int legajo) throws RemoteException;
	
}
