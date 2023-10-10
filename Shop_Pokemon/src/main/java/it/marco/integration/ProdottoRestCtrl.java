package it.marco.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import it.marco.entities.Prodotto;
import it.marco.services.ProdottoService;

@RestController
@RequestMapping("api")
@CrossOrigin
public class ProdottoRestCtrl {

	@Autowired
	ProdottoService service;
	
	@GetMapping("/prodotti")
	public List<Prodotto> getProdotti(){
		return service.getProdotti();
	}
	
	@PostMapping("/prodotti")
	public String addProdotto(@RequestBody  Prodotto p) {
		service.addProdotto(p);
		return "redirect:prodotti";
	}
}
