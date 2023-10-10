package it.marco.services;

import java.util.List;

import it.marco.entities.Film;

public interface FilmService {

	// CRUD
	
	Film addFilm(Film f);
	
	Film getFilm(int id);  // get by id
	
	List<Film> getAll();  // get all films
	
	Film update(Film f);
	
	void delete(int id);  // delete by id
	
}
