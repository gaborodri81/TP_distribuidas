package remoto;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import controlador.JuegoControlador;
import dto.JugadorDTO;
import dto.PartidaDTO;
import exceptions.JugadorException;
import interfaces.InterfaceRemota;
import negocio.Juego;


public class ObjetoRemoto extends UnicastRemoteObject implements InterfaceRemota {

//	private static final long serialVersionUID = 7432516509801597745L;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ObjetoRemoto() throws RemoteException {}

	@Override
	public void altaJugador(JugadorDTO dto) throws RemoteException {
		JuegoControlador contr = new JuegoControlador();
		contr.altaJugador(dto);
	}

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
	
	public PartidaDTO gestionarLibreIndividual (JugadorDTO jug) throws RemoteException{
		Juego juego = JuegoControlador.getInstancia().gestionarLibreIndividual(jug);
		PartidaDTO partidaDTO = null;
		if (juego != null){
			return partidaDTO = new PartidaDTO(juego.getPartidaActual();
		}
		return null;
	}


}
