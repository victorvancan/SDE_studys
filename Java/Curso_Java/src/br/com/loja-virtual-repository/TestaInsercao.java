import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaInsercao {
	
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory();	
		Connection connection = factory.recuperarConexao();
		
		
		
		java.sql.Statement stm = connection.createStatement();
		stm.execute("INSERT INTO PRODUTO (nome, descricao) VALUES ('Mouse', 'Mouse sem fio')", java.sql.Statement.RETURN_GENERATED_KEYS);
		
		
		ResultSet rst = stm.getGeneratedKeys();
		while(rst.next())
		{
			Integer id = rst.getInt(1);
			System.out.println("O id criado foi: " + id);
		}
	}
}
