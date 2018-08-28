package delegado.alumno;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import dto.AlumnoDto;
import excepciones.ComunicacionException;
import interfaces.alumno.InterfaceRemota;

public class BusinessDelegate {

	private InterfaceRemota ir;
	
	public BusinessDelegate() throws ComunicacionException{
		try {
			ir = (InterfaceRemota) Naming.lookup("//127.0.0.1/altaAlumno");
		} catch (MalformedURLException e) {
			throw new ComunicacionException("La direccion especificada no es correcta");
		} catch (RemoteException e) {
			throw new ComunicacionException("Error en las comunicaciones");
		} catch (NotBoundException e) {
			throw new ComunicacionException("El servidor no esta disponible");		
		}
	}
	
	public void altaAlumno(AlumnoDto dto) throws ComunicacionException{
		try {
			ir.altaAlumno(dto);
		} catch (RemoteException e) {
			throw new ComunicacionException("Error en las comunicaciones");	
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
