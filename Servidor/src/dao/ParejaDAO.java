package dao;

import org.hibernate.Query;

import entities.ParejaEntity;

public class ParejaDAO extends GenericDAOImpl<ParejaEntity, Integer>  {

	private static ParejaDAO instancia = null;
	
	public static ParejaDAO getDAO() {
		if (instancia == null) {
			instancia = new ParejaDAO();
		}
		return instancia;
	}
	
	private ParejaDAO() {
		super();
	}

	public ParejaEntity getParejaNoGrupo(int idJugador1, int idJugador2) {
		Query q = getSession().createQuery("from Pareja p where "
				+ "								((p.jugador1.idJugador = :idJugador1 and p.jugador2.idJugador = :idJugador2)"
				+ "								or (p.jugador1.idJugador = :idJugador2 and p.jugador2.idJugador = :idJugador1))"
				+ "								and p.idPareja not in (select distinct pk.pareja.idPareja from GrupoDetalle)");
		q.setParameter("idJugador1", idJugador1);
		q.setParameter("idJugador2", idJugador2);
		return getUnico(q);
	}
}
