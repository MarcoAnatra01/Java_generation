package it.marco.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.marco.entities.Film;

@Repository
public interface FilmDAO extends JpaRepository<Film, Integer>{

}
