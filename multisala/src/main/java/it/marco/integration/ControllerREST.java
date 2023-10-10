package it.marco.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.marco.entities.Cinema;
import it.marco.entities.Film;
import it.marco.entities.FilmInSala;
import it.marco.entities.Prenotazione;
import it.marco.services.CinemaService;
import it.marco.services.FilmInSalaService;
import it.marco.services.FilmService;
import it.marco.services.PrenotazioneService;

@RestController
@RequestMapping("api")
public class ControllerREST {

	@Autowired
	private CinemaService serviceCinemaService;
	
	@Autowired
	private FilmService filmService;
	
	@Autowired
	private FilmInSalaService filmInSalaService;
	
	@Autowired
	private PrenotazioneService prenotazioneService;
	
	@GetMapping("cinema")
	List<Cinema> getCinema(){
		return serviceCinemaService.getAll();
	}
	
	@GetMapping("film")
	List<Film> getFilm(){
		return filmService.getAll();
	}
	
	@GetMapping("programmazione")
	List<FilmInSala> getFilmInSala(){
		return filmInSalaService.getAll();
	}
	
	@GetMapping("prenotazione")
	List<Prenotazione> getPrenotazione(){
		return prenotazioneService.getAll();
	}
	
	@CrossOrigin
	@PostMapping("programmazione")
	FilmInSala addProgrammazione(@RequestBody FilmInSala fis) {
		return filmInSalaService.addFilmInSala(fis);
	}
	
	
}