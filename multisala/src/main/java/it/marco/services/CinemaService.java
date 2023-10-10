package it.marco.services;

import java.util.List;

import it.marco.entities.Cinema;

public interface CinemaService {

	// CRUD
	
	Cinema addCinema(Cinema c);
	
	Cinema getCinema(int id);  // get by id
	
	List<Cinema> getAll();  // get all cinema
	
	Cinema update(Cinema c);
	
	void delete(int id);  // delete by id
	
}
