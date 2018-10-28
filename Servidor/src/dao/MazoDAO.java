package dao;

import hbt.HibernateUtil;


import org.hibernate.Session;
import org.hibernate.SessionFactory;




public class MazoDAO {

	private static MazoDAO instancia;
	
	private MazoDAO() {}
	
	public static MazoDAO getInstance() {
		if(instancia == null)
			instancia = new MazoDAO();
		return instancia;
	}

//	public ClubEntity findByID(Integer idClub) throws ClubException {
//		SessionFactory sf = HibernateUtil.getSessionFactory();
//		Session session = sf.openSession();
//		ClubEntity ce = (ClubEntity) session.createQuery("from ClubEntity where id = ?")
//					.setParameter(0, idClub)
//					.uniqueResult();
//		if(ce != null){
//			return ce;
//		}
//		else 
//			throw new ClubException("El club solicitado no existe");
//	}
	
//	public Club toNegocio (ClubEntity club){
	//	Club c = new Club(club.getIdClub(), club.getNombre(), club.getZona() );
	//	return c;
//	}
	
}
