package it.marco.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.marco.entities.PopolazioneEta;

@Repository
public interface PopEtaDAO extends JpaRepository<PopolazioneEta, Integer>{

}
