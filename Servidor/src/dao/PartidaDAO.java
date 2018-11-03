package dao;

import entities.PartidaEntity;

public class PartidaDAO extends GenericDAOImpl<PartidaEntity, Integer> {

	private static PartidaDAO instancia = null;
	
	public static PartidaDAO getDAO() {
		if (instancia == null) {
			instancia = new PartidaDAO();
		}
		return instancia;
	}
	
	private PartidaDAO() {
		super();
	}
}
