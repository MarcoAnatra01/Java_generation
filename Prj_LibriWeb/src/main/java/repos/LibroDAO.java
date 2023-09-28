package repos;

import java.util.List;
import model.Libro;


public interface LibroDAO {
	
	// INTERFACCIA CHE COLLEGA LA CLASSE Libro CON LA TABELLA generation.libri3 
	
	String FIND_ALL = "SELECT * FROM libri3";
	String FIND_BY_ID = "SELECT * FROM libri3 WHERE id = ?";

	List<Libro> datiDB();
}
