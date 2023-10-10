package it.marco.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.marco.entities.FilmInSala;
import it.marco.repos.FilmInSalaDAO;

@Service
public class FilmInSalaServiceImpl implements FilmInSalaService{
	
	@Autowired
	FilmInSalaDAO dao; 
	
	@Override
	public FilmInSala addFilmInSala(FilmInSala f) {

		return dao.save(f);
	}

	@Override
	public FilmInSala getFilmInSala(int id) {

		return dao.findById(id).get();
	}

	@Override
	public List<FilmInSala> getAll() {

		return dao.findAll();
	}

	@Override
	public FilmInSala update(FilmInSala f) {

		return dao.save(f);
	}

	@Override
	public void delete(int id) {

		dao.deleteById(id);
	}

}
