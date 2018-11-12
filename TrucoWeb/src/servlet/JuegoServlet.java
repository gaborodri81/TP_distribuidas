package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import delegado.BusinessDelegate;
import dto.JugadorDTO;
import dto.PartidaDTO;

public class JuegoServlet extends HttpServlet {

	
	private BusinessDelegate delegado;


	public void nuevaPartidaAbiertaParejas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String idParejaStr = request.getParameter("idPareja");
//		if (idParejaStr == null || idParejaStr.length() == 0) {
//			error("idPareja es requerido", request, response);
//		} else {
//			int idPareja = Integer.parseInt(idParejaStr);
//			HttpSession session = request.getSession();
//			if (session == null) {
//				error("No hay sesion", request, response);
//			} else {
//				JugadorDTO user = (JugadorDTO) session.getAttribute("user");
//				if (user == null) {
//					error("No hay jugador activo", request, response);
//				} else {
//					try {
//						PartidaDTO partida = delegado.crearNuevaPartidaAbiertaPareja(user, idPareja);
//						if (partida==null()) {
//							request.setAttribute("mensaje", "Agregado a cola de espera partida abierta en pareja");
//							request.getRequestDispatcher("/main.jsp").forward(request, response);
//						} else {
//							agregarPartidaSesion(session, partida);
//							response.sendRedirect("/trucoweb/juegoMain.jsp?idPartida=" + partida.getIdPartida());
//						}
//					} catch (JuegoException e) {
//						error("Ocurrio un error iniciando la partida: " + e.getMessage(), request, response);
//						e.printStackTrace();
//					}
//				}
//			}
//			
//		}
	}

	public void nuevaPartidaCerrada(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		//Necesito conocer el grupo con el que usuario quiere crear una partida cerrada
//		String idGrupo = request.getParameter("idGrupo");
//		if (idGrupo == null || idGrupo.length() == 0) {
//			error("", request, response);
//		} else {
//			int idGrupoInt = Integer.parseInt(idGrupo);
//			//Verifico que el grupo efectivamente pertenece al usuario
//			HttpSession session = request.getSession();
//			String errorMsg = null;
//			if (session == null) {
//				errorMsg ="No hay sesion";
//			} else {
//				JugadorDTO user = (JugadorDTO) session.getAttribute("user");
//				if (user == null) {
//					error("No hay jugador activo", request, response);
//				} else {
//					if (user.tieneGrupo(idGrupoInt)) {
//						GrupoDTO grupo = user.getGrupo(idGrupoInt);
//						try {
//							PartidaDTO partida = delegate.crearNuevaPartidaCerrada(user, grupo);
//							if (partida.esNull()) {
//								error("No fue posible crear la partida en grupo. Contacte admin", request, response); 
//							} else {
//								agregarPartidaSesion(session, partida);
//								response.sendRedirect("/trucoweb/juegoMain.jsp?idPartida=" + partida.getIdPartida());
//							}
//						} catch (JuegoException e) {
//							error("Ocurrio un error al crear la partida cerrada: " + e.getMessage(), request, response);
//							e.printStackTrace();
//						}
//					} else {
//						error("El grupo no pertenece al usuario", request, response);
//					}
//				}
//			}
//		}
	}
	

	public void nuevaPartidaAbierta(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Le pasamos al delegate que el usuario quiere participar en nueva panuevaPartidaAbiertaParejasrtida abierta y forward a vista de juego principal con data de la partida
		HttpSession session = request.getSession();
		if (session == null) {
			error("No hay sesion", request, response);
		} else {
			if (session.getAttribute("user") == null) {
				error("No hay usuario logueado", request, response);
			} else {
				JugadorDTO jugador = (JugadorDTO) session.getAttribute("user");
				try {
					PartidaDTO dto = delegado.crearNuevaPartidaAbierta(jugador);
					if (dto== null) {
						request.setAttribute("mensaje", "Agregado a cola de partida abierta");
						request.getRequestDispatcher("/main.jsp").forward(request, response);
					} else {
						agregarPartidaSesion(session, dto);
						response.sendRedirect("/trucoweb/juegoMain.jsp?idPartida=" + dto.getIdPartida());
					}
				} catch (JuegoException e) {
					error("Ocurrio un problema en la creacion de partida: " + e.getMessage(), request, response);
				}
			}
		}
	}


	
	
}
