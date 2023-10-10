package it.marco.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.marco.entities.Provincia;

@Repository
public interface ProvinciaDAO extends JpaRepository<Provincia, Integer>{

}
