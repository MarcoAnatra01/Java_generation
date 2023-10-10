package it.marco.integration;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.marco.entities.Provincia;
import it.marco.services.PopolazioneService;

@RestController
@RequestMapping("api")
public class RestCtrl {

	@Autowired
	private PopolazioneService service;
	
	public Collection<Provincia> getProvince() {
		
		return service.getProvinceMap().values();
	}
}
