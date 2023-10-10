package it.marco.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.marco.entities.Prodotto;

@Repository
public interface ProdottoDAO  extends JpaRepository<Prodotto, Integer> {

}
