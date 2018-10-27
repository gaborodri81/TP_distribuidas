package servidor;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import remoto.ObjetoRemoto;

public class Server {

	public Server() throws RemoteException{
		inicializar();
	}

	private void inicializar() throws RemoteException {
		
		interfaces.InterfaceRemota or = new ObjetoRemoto();

		
		try {
			LocateRegistry.createRegistry(11099);
		//	System.setProperty("java.rmi.server.hostname", "192.168.43.230");
			Naming.rebind("//127.0.0.1/altaJugador", or);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
