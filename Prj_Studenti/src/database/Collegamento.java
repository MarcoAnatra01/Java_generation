package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Collegamento {
		//---------------------------------------------------------------
		// classe usata da StudentiDB e MateriaDAO per accedere al db
		//---------------------------------------------------------------
	
		
		private final String HOST = "jdbc:mysql://localhost:3306/jaita93";
		private final String USER = "app_java";
		private final String PASS = "java_2023!";

		private Connection connessione = null;
		
		Connection getConnessione() {
			
			if(this.connessione == null) {
		
				// se non sono connesso al db, chiamo connetti()
				
				connetti();
			}
			return this.connessione;
		}
		
		
		private void connetti() {
			
			try {
				//l'oggetto DriverManager permette la connessione al db tramite getConnection()
				
				// il codice del metodo è inserito tutto dentro un try-catch perchè il db potrebbe non essere raggiungibile 
				
				this.connessione = DriverManager.getConnection(HOST, USER, PASS);
				
				System.out.println("CONNESSIONE AL DB EFFETTUATA");
				
			} catch (SQLException e) {
				
				System.err.println("ERRORE DI CONNESSIONE AL DB " + e.getMessage());
			}
	}

}
