import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import jbdc.ConnectionFactory;
import jbdc.dao.ProdutoDAO;
import jbdc.modelo.Produto;

public class TestaInsercaoEListagemComProduto {
	public static void main(String[] args) throws SQLException {
		
		Produto comoda = new Produto("Comoda", "Comoda vertical");
		
		try(Connection connection = new ConnectionFactory().recuperarConexao())
		{	
			ProdutoDAO produtoDAO = new ProdutoDAO(connection);
			
			produtoDAO.salvar(comoda);
			List<Produto> listaProduto =  produtoDAO.listar();
			listaProduto.stream().forEach(lp -> System.out.println(lp));
		}
	}
}
