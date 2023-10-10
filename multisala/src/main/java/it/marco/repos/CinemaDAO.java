package it.marco.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.marco.entities.Cinema;

@Repository
public interface CinemaDAO extends JpaRepository<Cinema, Integer>{

}
