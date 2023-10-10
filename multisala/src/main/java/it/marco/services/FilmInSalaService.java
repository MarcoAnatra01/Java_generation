package it.marco.services;

import java.util.List;

import it.marco.entities.FilmInSala;

public interface FilmInSalaService {

	// CRUD
	
	FilmInSala addFilmInSala(FilmInSala f);
	
	FilmInSala getFilmInSala(int id);  // get by id
	
	List<FilmInSala> getAll();  
	
	FilmInSala update(FilmInSala f);
	
	void delete(int id);  // delete by id
	
}
