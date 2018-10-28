package delegado;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import dto.JugadorDTO;
import excepciones.ComunicacionException;
import interfaces.InterfaceRemota;

public class BusinessDelegate {

	private static BusinessDelegate instance = null;
	private static InterfaceRemota ir;

	protected BusinessDelegate() {
		// Exists only to defeat instantiation.
	}

	public static BusinessDelegate getInstance() throws ComunicacionException {
		if (instance == null) {
			instance = new BusinessDelegate();
	
		}
		return instance;
	}

	

	
	public boolean validarUsuario(JugadorDTO jugador) throws ComunicacionException {
		
		boolean inicioBien = false;
		try {
			if (ir == null){
				try {
					ir = (InterfaceRemota) Naming.lookup("//127.0.0.1/altaJugador");
				} catch (MalformedURLException e) {
					throw new ComunicacionException("La direccion especificada no es correcta");
				} catch (RemoteException e) {
					throw new ComunicacionException("Error en las comunicaciones");
				} catch (NotBoundException e) {
					throw new ComunicacionException("El servidor no esta disponible");
				}			
			}
			inicioBien = ir.login(jugador);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return inicioBien;
	}
	
	public void altaJugador(JugadorDTO dto) throws ComunicacionException {
		try {
			ir.altaJugador(dto);
		} catch (RemoteException e) {
			throw new ComunicacionException("Error en las comunicaciones");
		}
	}

}
