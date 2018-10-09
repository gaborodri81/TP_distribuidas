package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entities.ClubEntity;
import entities.JugadorEntity;
import entities._JugadorEntity;
import exceptions.ClubException;
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
		_JugadorEntity je = (_JugadorEntity) session.createQuery("from JugadorEntity where id.tipo = ? and id.numero = ?")
					.setParameter(0, tipo)
					.setParameter(1, numero)
					.uniqueResult();
		if(je != null)
			return this.toNegocio(je);
		else 
			throw new JugadorException("El jugador solicitado no existe");
	}
	
	public void grabar(Jugador jugador){
		_JugadorEntity je = new _JugadorEntity(jugador.getTipo(), jugador.getNumero(), jugador.getNombre());
		ClubEntity club = null;
		try {
			club = MazoDAO.getInstance().findByID(jugador.getClub().getIdClub());
		} catch (ClubException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
		je.setClub(club);
		je.setCategoria(jugador.getCategoria());
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.saveOrUpdate(je);
		session.getTransaction().commit();
		session.close();
	}


	
	public Jugador toNegocio(JugadorEntity jugador) {
		Jugador j = new Jugador();
		j.setCategoria(jugador.getCategoria());
		j.setId_jugador(jugador.getIdJugador());
		j.setMail(jugador.getMail());
		j.setNickname(jugador.getNickName());
		j.setPassword(jugador.getPassword());
		
		Club c = MazoDAO.getInstance().toNegocio(jugador.getClub());
		j.setClub(c);
		return j;
	}

}
