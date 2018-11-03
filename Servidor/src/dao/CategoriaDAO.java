package dao;

import negocio.Categoria;

public class CategoriaDAO extends GenericDAOImpl<Categoria, Integer> {

	private static CategoriaDAO instancia = null;
	
	public static CategoriaDAO getDAO() {
		if (instancia == null) {
			instancia = new CategoriaDAO();
		}
		return instancia;
	}
	
	private CategoriaDAO() {
		super();
	}

}
