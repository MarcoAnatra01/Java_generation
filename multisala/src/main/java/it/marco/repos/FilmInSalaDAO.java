package it.marco.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.marco.entities.FilmInSala;

@Repository
public interface FilmInSalaDAO extends JpaRepository<FilmInSala, Integer>{

}
