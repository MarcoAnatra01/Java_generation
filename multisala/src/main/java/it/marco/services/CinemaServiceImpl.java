package it.marco.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.marco.entities.Cinema;
import it.marco.repos.CinemaDAO;


@Service
public class CinemaServiceImpl implements CinemaService{
	
	@Autowired
	CinemaDAO dao; 
	
	@Override
	public Cinema addCinema(Cinema c) {

		return dao.save(c);
	}

	@Override
	public Cinema getCinema(int id) {

		return dao.findById(id).get();
	}

	@Override
	public List<Cinema> getAll() {

		return dao.findAll();
	}

	@Override
	public Cinema update(Cinema c) {

		return dao.save(c);
	}

	@Override
	public void delete(int id) {

		dao.deleteById(id);
	}

}
