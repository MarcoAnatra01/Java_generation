package it.marco.services;

import java.util.List;

import org.springframework.stereotype.Service;

import it.marco.entities.Prodotto;


public interface ProdottoService {

	List<Prodotto> getProdotti();
	Prodotto addProdotto(Prodotto p);
}
