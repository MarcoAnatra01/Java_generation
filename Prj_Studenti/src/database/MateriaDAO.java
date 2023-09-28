package database;

import model.Materia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;

public class MateriaDAO {  // tabella materie
	
	// DAO - Data Access Object (classe che rappresenta una tabella di un RDBMS)
	
	//---------------------------------------------------------------
	// CLASSE SI COLLEGA ALLA TABELLA materie DEL DB jaita93
	
	// CON I VALORI DEI CAMPI DELLA TABELLA CREA OGGETTI Materia
	//---------------------------------------------------------------
	
	Collegamento db;
	
	ArrayList<Materia> materie;  // contiene tutte le materie che pesco dal db 
	
	Statement statement; // oggetto che porta le istruzioni SQL da java al db
	
	ResultSet rs; // oggetto che memorizza il risultato della query
	
	
	public MateriaDAO() {  // COSTRUTTORE
		
		this.db = new Collegamento();
		this.materie = new ArrayList<Materia>();
	}
	
	

	public Materia addMateria(String nome) {  // INSERT INTO MATERIE
		
		Materia m = new Materia(0, nome); // obj che rappresenta un record della tabella materie
		
		try {
			this.statement = db.getConnessione().createStatement();
			this.statement.execute("INSERT INTO materie (nome) VALUES ('" + m.getNome() + "')");
			
			if(this.statement.getUpdateCount() == 1) {
				
				System.out.println("record inserito");
			}else {
				System.out.println("record non inserito");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return m;
	}
	
	

	// GETTER AL materie
	// getAll getMateriaById
	public ArrayList<Materia> getMaterie() throws SQLException {  // READ   
		
		// throws SQLException, sostituisce il try-catch
		
		// la gestione dell'eccezione viene fatta dall'oggetto che richiama getMaterie()
		
		// il try-catch invece è la gestione diretta dell'eccezione 
		
		extracted();  // svuota l'AL e gli inserisce oggetti Materia con i valori dei record del db
		
		return materie;
	}
	
	
	
	private void extracted() throws SQLException {
		
		//svuoto l'ArrayList per evitare di inserire oggetti già presenti
		
		this.materie.clear(); 
				
		// non creo un nuovo statement, lo ottengo tramite l'oggetto Collegamento db
		
		this.statement = db.getConnessione().createStatement();
		
		this.rs = this.statement.executeQuery("select * from materie");
		
		while(this.rs.next()) {
			int id = this.rs.getInt(1);
			String nome = this.rs.getString("nome");
			
			this.materie.add(new Materia(id, nome));  // aggiungo all'AL la materia con i valori del record della tabella
		}
	}
	
	
	
	public void updateMateria(String altroNome, int idRecord) {   // UPDATE MATERIE
		try {
			this.statement = db.getConnessione().createStatement();
			this.statement.execute("UPDATE materie set nome = '" + altroNome + "' WHERE id = " + idRecord);
			
			if(this.statement.getUpdateCount() == 1) {
				System.out.println("record aggiornato");
			}else {
				System.out.println("record non aggiornato");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteMateria(int id) {  // DELETE FROM MATERIE
		try {
			this.statement = db.getConnessione().createStatement();
			this.statement.execute("DELETE FROM materie WHERE id = '" + id + "' ");
			
			if(this.statement.getUpdateCount() == 1) {
				System.out.println("record eliminato");
			}else {
				System.out.println("record non eliminato");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	
	
	
	

}
