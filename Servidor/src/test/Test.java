package test;

import java.io.IOException;
import java.io.InputStream;
import java.rmi.RemoteException;
import java.util.Properties;

import javax.swing.JOptionPane;

import delegado.BusinessDelegate;
import servidor.Server;

public class Test {
//	private static Properties p = null;
//	static {
//		InputStream is = null;
//		try {
//			is = BusinessDelegate.class.getClassLoader().getResourceAsStream("hibernate.properties");
//			p = new Properties();
//			p.load(is);
//		} catch (IOException e) {
//			throw new RuntimeException(e);
//		} finally {
//			try {
//				is.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new Server();
			System.out.println("Servidor levantado");
		} catch (RemoteException e) {
			System.out.println("Mensaje Error : " + e.getMessage());
			JOptionPane.showMessageDialog(null, "No pude arrancar el servidor");
		}
	}

}
