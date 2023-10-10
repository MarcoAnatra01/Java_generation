package it.marco.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.marco.entities.PopolazioneRegione;

@Repository
public interface PopRegioneDAO extends JpaRepository<PopolazioneRegione, Integer>{

}
