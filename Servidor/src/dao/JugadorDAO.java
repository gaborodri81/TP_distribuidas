package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entities.JugadorEntity;
import exceptions.JugadorException;
import hbt.HibernateUtil;
import negocio.Jugador;

public class JugadorDAO {

	/** Yo soy un DAO, asi que no tengo estado, mas que las variable que necesito para instanciarme.
	 *  Nunca voy a tener un método de negocio dentro mio
	 * */
	private static JugadorDAO instancia;
	
	private JugadorDAO() {}
	
	public static JugadorDAO getInstance() {
		if(instancia == null)
			instancia = new JugadorDAO();
		return instancia;
	}

	public Jugador getJugadorById(String tipo, Integer numero) throws JugadorException {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		JugadorEntity je = (JugadorEntity) session.createQuery("from JugadorEntity where id.tipo = ? and id.numero = ?")
					.setParameter(0, tipo)
					.setParameter(1, numero)
					.uniqueResult();
		if(je != null)
			return this.toNegocio(je);
		else 
			throw new JugadorException("El jugador solicitado no existe");
	}
	
	public void grabar(Jugador jugador){
		JugadorEntity je = new JugadorEntity();
	//	je.setCategoria(jugador.getCategoria());
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.saveOrUpdate(je);
		session.getTransaction().commit();
		session.close();
	}
	
	public Jugador toNegocio(JugadorEntity jugador) {
		Jugador j = new Jugador();
//		j.setCategoria(jugador.getCategoria());
		j.setId_jugador(jugador.getId_jugador());
		j.setMail(jugador.getMail());
		j.setNickname(jugador.getNickname());
		j.setPassword(jugador.getClave());
		
		return j;
	}
	
	public Jugador buscarPorNickname(String nickname)  {

		Jugador resultado = null;
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		JugadorEntity aux;
		try {
			aux = (JugadorEntity) s
					.createQuery("from JugadorEntity je where je.nickname = ?")
					.setString(0, nickname).uniqueResult();
			
			s.getTransaction().commit();
			s.close();
			
			if (aux != null) {
				resultado = this.toNegocio(aux);
			} 
		} catch (HibernateException e) {
			e.printStackTrace();
			throw e;
		}

		return resultado;
	}

}
