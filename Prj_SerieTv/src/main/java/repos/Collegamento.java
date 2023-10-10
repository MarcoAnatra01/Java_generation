package repos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Collegamento {

	private final String HOST = "jdbc:mysql://localhost:3306/generation";
	private final String USER = "app_java";
	private final String PASS = "java_2023!";
	
	private Connection conn = null;
	
	public Connection getConnessione() {
		if (this.conn == null) connetti();
		
		return this.conn;
	}
	
	private void connetti() {
		
		try {
			this.conn = DriverManager.getConnection(HOST, USER, PASS);
			System.out.println("SEI CONNESSO!!!");
			
		} catch (SQLException e) {

			System.err.println("ERRORE DI CONNESSIONE AL DB " + e.getMessage());
		}
		
	}
	
}