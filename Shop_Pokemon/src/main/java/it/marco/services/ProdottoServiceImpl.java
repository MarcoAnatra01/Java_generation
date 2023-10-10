package it.marco.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.marco.entities.Prodotto;
import it.marco.repos.ProdottoDAO;

@Service
public class ProdottoServiceImpl implements ProdottoService{

	@Autowired
	ProdottoDAO dao;
	
	@Override
	public List<Prodotto> getProdotti() {

		return dao.findAll();
	}

	@Override
	public Prodotto addProdotto(Prodotto p) {

		return dao.save(p);
	}

	
}
