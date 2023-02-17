package jbdc;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		
		Connection con = connectionFactory.recuperarConexao();
		
		con.close();
	}

}
