package servlet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import delegado.BusinessDelegate;
import dto.JugadorDTO;
import excepciones.ComunicacionException;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")

public class LoginServlet extends HttpServlet {
		private static final long serialVersionUID = 2481325140950452392L;
		private static JugadorDTO currentuser;
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			doPost(request, response);
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			
			String jspPage = "/layout.jsp";
			String nickname = request.getParameter("usuario");
			String password = request.getParameter("password");
			JugadorDTO jug = validarUsuario(nickname, password);
			if(jug !=null){
				request.getSession().setAttribute("unJugador", jug);
				dispatch(jspPage, request, response);
			}
			else{
				jspPage = "/login.jsp?error=LoginInvalido";
				dispatch(jspPage, request, response);
			}
		}

		private JugadorDTO validarUsuario(String apodo, String password){
			JugadorDTO jug = new JugadorDTO();
			jug.setNickname(apodo);
			jug.setPassword(password);
			try {
				boolean usuarioValido = BusinessDelegate.getInstance().validarUsuario(jug);  
				if (usuarioValido) {
					setCurrentuser(jug);
					return jug;
				} else {
					return null;
				}
			} catch (ComunicacionException e) {
				e.printStackTrace();
			}
			return null;
		}
		
		protected void dispatch(String jsp, HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			if (jsp != null) {
				RequestDispatcher rd = request.getRequestDispatcher(jsp);
				response.setContentType("application/json");
				response.setCharacterEncoding("UTF-8");
				rd.forward(request, response);
			}
		}

		public static JugadorDTO getCurrentuser() {
			return currentuser;
		}

		public static void setCurrentuser(JugadorDTO currentuser) {
			LoginServlet.currentuser = currentuser;
		}

		
	}



