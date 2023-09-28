package repos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Libro;

public class LibroDAOImpl implements LibroDAO{
	
	Collegamento db = new Collegamento(); // oggetto per il collegamento al db
	PreparedStatement ps;
	ResultSet rs;
	
	// sovrascrivo il metodo datiDB() dell'INTERFACCIA LibroDAO

	@Override
	public List<Libro> datiDB() {

		List<Libro> libri = new ArrayList<>();
		
		try {
			
			// esecuzione query
			
			this.ps = this.db.getConnessione().prepareStatement(FIND_ALL);
			this.rs = this.ps.executeQuery();
			
			while(this.rs.next()) {
				
				// per ogni record del result set:
				// creo un oggetto tipo Libro, i valori delle proprietà sono presi dai record della tabella
				// aggiungo l'oggetto creato all'AL libri
				
				
				int id = rs.getInt("id");
				String titolo = rs.getString("titolo");
				double prezzo = rs.getDouble("prezzo");
				int pagine = rs.getInt("pagine");
				
				libri.add(new Libro(id, titolo, prezzo, pagine));
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return libri;
	}
	
}
