package IssueProvider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	private static Connection con;
	
	public static Connection getConnection() throws SQLException {
		con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","sairam@9");
		return con;
	}
}