package view;

import javax.swing.JOptionPane;

import delegado.BusinessDelegate;
import dto.JugadorDTO;
import excepciones.ComunicacionException;

public class Jugador {

	public static void main(String[] args) {

		try {
			System.out.println("Dando de alta un jugador :");
			
			// DTO
			JugadorDTO dto = new JugadorDTO();
			dto.setId_jugador(236);
			dto.setNickname("gaborodri");
			BusinessDelegate business = new BusinessDelegate(); 
			business.altaJugador(dto);
		} catch (ComunicacionException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}


	}

}
