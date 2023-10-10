package service;

import java.util.List;

import model.Serie;

public interface SerieService {

	void addSerie(Serie s);
	void addSerie(String titolo, String genere, double rating);
	
	List<Serie> getSerie();  // ritorna un AL con tutte le serie
	
	Serie getSerieById(int id);  // ritorna un oggetto Serie con uno specifico id
	
	List<Serie> getSerieByGenere(String genere);  // ritorna un AL con le serie di uno specifico genere

	
}
