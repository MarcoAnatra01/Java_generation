package repos;

import java.util.List;

import model.Serie;

public interface SerieDAO {

	String ADD = "INSERT INTO serie(titlo, genere, rating) VALUES(?,?,?)";
	String FIND_ALL = "SELECT * FROM serie";
	String FIND_BY_ID = "select * from serie where id = ?";
	String FIND_BY_GENERE = "select * from serie where genere = ?";
	
	void addSerie(Serie s);
	void addSerie(String titolo, String genere, double rating);
	
	List<Serie> getSerie();  // ritorna un AL con tutte le serie
	
	Serie getSerieById(int id);  // ritorna un oggetto Serie con uno specifico id
	
	List<Serie> getSerieByGenere(String genere);  // ritorna un AL con le serie di uno specifico genere
}
