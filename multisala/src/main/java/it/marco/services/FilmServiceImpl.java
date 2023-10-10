package it.marco.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.marco.entities.Film;
import it.marco.repos.FilmDAO;

@Service
public class FilmServiceImpl implements FilmService{
	
	@Autowired
	FilmDAO dao; 
	
	@Override
	public Film addFilm(Film f) {
		// TODO Auto-generated method stub
		return dao.save(f);
	}

	@Override
	public Film getFilm(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public List<Film> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Film update(Film f) {
		// TODO Auto-generated method stub
		return dao.save(f);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

}
