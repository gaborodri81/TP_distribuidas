package dao;

import org.hibernate.Query;

import entities.GrupoEntity;

public class GrupoDAO extends GenericDAOImpl<GrupoEntity, Integer> {

	private static GrupoDAO instancia = null;
	
	public static GrupoDAO getDAO() {
		if (instancia == null) {
			instancia = new GrupoDAO();
		}
		return instancia;
	}
	
	private GrupoDAO() {
		super();
	}

	public GrupoEntity getPorNombreGrupo(String nombreGrupo) {
		Query q = getSession().createQuery("from Grupo where nombre = :nombre");
		q.setParameter("nombre", nombreGrupo);
		return getUnico(q);
	}
}
