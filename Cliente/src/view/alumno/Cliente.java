package view.alumno;

import javax.swing.JOptionPane;

import delegado.alumno.BusinessDelegate;
import excepciones.ComunicacionException;

public class Cliente {

	public static void main(String[] args) {

		try {
			System.out.println("Dando de alta un alumno :");
			
			// DTO
			new BusinessDelegate().altaAlumno(10, 20);
		} catch (ComunicacionException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}


	}

}
