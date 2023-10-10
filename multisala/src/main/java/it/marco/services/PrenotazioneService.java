package it.marco.services;

import java.util.List;

import it.marco.entities.Prenotazione;

public interface PrenotazioneService {

	// CRUD
	
	Prenotazione addPrenotazione(Prenotazione p);
	
	Prenotazione getPrenotazione(int id);  // get by id
	
	List<Prenotazione> getAll();  
	
	Prenotazione update(Prenotazione p);
	
	void delete(int id);  // delete by id
	
}
