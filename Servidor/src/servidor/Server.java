package servidor;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.net.*;

import remoto.ObjetoRemoto;

public class Server {

	public Server() throws RemoteException{
		inicializar();
	}

	private void inicializar() throws RemoteException {
		
		interfaces.InterfaceRemota or = new ObjetoRemoto();

		
		try {
			LocateRegistry.createRegistry(1099);
		//	System.setProperty("java.rmi.server.hostname", "192.168.43.230");
			Naming.rebind("//localhost/altaJugador", or);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
