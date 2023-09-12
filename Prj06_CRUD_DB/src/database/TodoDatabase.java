package database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import model.Todo;

public class TodoDatabase {

	// inizializzo le variabili per la connessione al db 
	
	private final String HOST = "jdbc:mysql://localhost:3306/generation";
	private final String USER = "root";
	private final String PASSWORD = "Anatra";
	
	private Connection conn;
	
	public void connetti() {
		try {
			this.conn = DriverManager.getConnection(HOST, USER, PASSWORD);

			System.out.println("Connessione al db stabilita");
			
		} catch (SQLException e) {
			
			System.err.println("Si è verificato un errore durante la connessione al db " + e.getMessage());
			
			// e.printStackTrace();
		}
	}
		
	public void addTodo(String descrizione) {
		
		try {
			Todo t = new Todo(descrizione);
			
			Statement stat = conn.createStatement();
			
			String querySql = "insert into todo (data, descrizione, fatto) values('"+ t.getData() +"','"+ t.getDescrizione() +"' ,0)";
			
			stat.execute(querySql);
			
		} catch (SQLException e) {
			
			System.err.println("errore durante la query");
		}
		
	}
	
}
