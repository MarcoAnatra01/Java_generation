package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.*;

public class EsameDAO {
	
	Collegamento collegamento;
	
	ArrayList<Esame> esami;   
	
	Statement statement; 
	PreparedStatement ps;  // modulo per richieste al db specializzato
	
	ResultSet rs;
	
	
	public EsameDAO() {
		this.collegamento = new Collegamento();
	}
	
	public void addEsame(Studente s, Materia m, int voto) {
				
		try {
			String query = "insert into esami (studente_id, materia_id, voto) values (?,?,?)";
			this.ps = this.collegamento.getConnessione().prepareStatement(query);
		
			this.ps.setInt(1, s.getId());
			this.ps.setInt(2, m.getId());
			this.ps.setInt(3, voto);
			
			this.ps.execute();
			
			System.out.println("record inserito");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
