package database;

import java.util.ArrayList;
import model.Studente;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentiDB {  // tabella studenti
	
	// il nome corretto sarebbe StudentiDAO
	
	// DAO - Data Access Object (classe che rappresenta una tabella di un RDBMS)
	
	//---------------------------------------------------------------
	// CLASSE CHE SI COLLEGA ALLA TABELLA studenti DEL DB jaita93
	
	// CON I VALORI DEI RECORD DELLA TABELLA CREA OGGETTI Studente
	//---------------------------------------------------------------
	
	
	Collegamento db = new Collegamento();  
	
	ArrayList<Studente> studenti = new ArrayList<>();
	

	// GETTER AL studenti
	public ArrayList<Studente> getStudenti() {  
		
		studenti.clear();
		
		estrai();
		
		return studenti;
	}
	
	
	public void estrai() {
		
		try {
			Statement stat = db.getConnessione().createStatement();
			
			// l'oggetto ResultSet contiene le righe ritornate dalla query
			
			// si può scorrere il ResultSet con un FOR
			
			ResultSet rs = stat.executeQuery("select * from studenti");
			
			while(rs.next()) {  // ciclo finchè ci sono righe nel ResultSet
				
				int id = rs.getInt(1);  // campo id 
				
				String nome = rs.getString("nome");  // campo nome
				
				// creo un oggetto Studente con la variabile nome e lo aggiungo all'ArrayList  
				
				this.studenti.add(new Studente(id,nome));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
