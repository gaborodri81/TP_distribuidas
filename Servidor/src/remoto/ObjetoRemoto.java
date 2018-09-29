package remoto;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import controlador.alumno.Controlador;
import dto.AlumnoDto;
import interfaces.alumno.*;
import interfaces.alumno.InterfaceRemota;


public class ObjetoRemoto extends UnicastRemoteObject implements InterfaceRemota {

	private static final long serialVersionUID = 7432516509801597745L;

	public ObjetoRemoto() throws RemoteException {}


	public void altaAlumno(AlumnoDto dto) throws RemoteException {
	
		// new Objeto Negocio Alumno
		new Controlador().altaAlumno(123, 1234);;
	}

	/*@Override
	public Alumno obtener(int legajo) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}*/

}
