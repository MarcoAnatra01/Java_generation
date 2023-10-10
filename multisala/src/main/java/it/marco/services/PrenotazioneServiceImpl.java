package it.marco.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.marco.entities.Prenotazione;
import it.marco.repos.PrenotazioneDAO;

@Service
public class PrenotazioneServiceImpl implements PrenotazioneService{
	
	@Autowired
	PrenotazioneDAO dao; 
	
	@Override
	public Prenotazione addPrenotazione(Prenotazione p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public Prenotazione getPrenotazione(int id) {

		return dao.findById(id).get();
	}

	@Override
	public List<Prenotazione> getAll() {

		return dao.findAll();
	}

	@Override
	public Prenotazione update(Prenotazione p) {

		return dao.save(p);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

}
