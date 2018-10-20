package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

import dto.JugadorDTO;

public interface InterfaceRemota extends Remote {

	public void altaJugador(JugadorDTO dto) throws RemoteException;
	
	// public Alumno obtener(int legajo) throws RemoteException;
	
	public boolean login(JugadorDTO jugador) throws RemoteException;
	
}
