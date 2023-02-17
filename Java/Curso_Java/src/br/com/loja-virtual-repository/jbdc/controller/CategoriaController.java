package jbdc.controller;



import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jbdc.ConnectionFactory;
import jbdc.dao.CategoriaDAO;
import jbdc.modelo.Categoria;

public class CategoriaController {
	private CategoriaDAO categoriaDAO;
	
	public CategoriaController() throws SQLException
	{
		Connection connection = new ConnectionFactory().recuperarConexao();
		
		this.categoriaDAO = new CategoriaDAO(connection);
	}
	
	public List<Categoria> listar() {

		return this.categoriaDAO.lista();
	}
}
