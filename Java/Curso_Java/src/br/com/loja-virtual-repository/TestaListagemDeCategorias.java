import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import jbdc.ConnectionFactory;
import jbdc.dao.CategoriaDAO;
import jbdc.modelo.Categoria;
import jbdc.modelo.Produto;

public class TestaListagemDeCategorias {

	public static void main(String[] args) throws SQLException {
		
		
		try(Connection connection = new ConnectionFactory().recuperarConexao())
		{
			CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
			List<Categoria> listaDeCategorias = categoriaDAO.listarComProdutos();
			
			listaDeCategorias.stream().forEach(ct -> {System.out.println(ct.getNome());
				for(Produto produto: ct.getProdutos())
				{
					System.out.println(ct.getNome() + "-" + produto.getNome());
				}
			});
		}
	}

}
