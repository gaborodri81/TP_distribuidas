package remoto;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import controlador.JuegoControlador;
import dto.JugadorDTO;
import exceptions.JugadorException;
import interfaces.InterfaceRemota;


public class ObjetoRemoto extends UnicastRemoteObject implements InterfaceRemota {

//	private static final long serialVersionUID = 7432516509801597745L;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ObjetoRemoto() throws RemoteException {}

	@Override
	public void altaJugador(JugadorDTO dto) throws RemoteException {
		// TODO Auto-generated method stub
		JuegoControlador contr = new JuegoControlador();
		contr.altaJugador(dto);
	}

	/*@Override
	public Alumno obtener(int legajo) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}*/
	
	@Override
	public boolean login(JugadorDTO jugador) throws RemoteException {
		boolean inicioBien = false;
		try {
			inicioBien = JuegoControlador.getInstancia().login(jugador);
		} catch (JugadorException e) {
			e.printStackTrace();
		}
		return inicioBien;
	}


}
