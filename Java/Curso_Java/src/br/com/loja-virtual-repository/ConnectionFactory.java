import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
		
	public Connection recuperarConexao() throws SQLException
	{			
		
		return DriverManager.getConnection("jdbc:mysql://Localhost/loja_virtual?useTimezone=ture&serverTimezone=UTC", "root", "212724");
	}


}
