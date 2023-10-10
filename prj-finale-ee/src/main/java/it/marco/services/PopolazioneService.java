package it.marco.services;

import java.util.List;
import java.util.Map;

import it.marco.entities.Provincia;
import it.marco.entities.Regione;

public interface PopolazioneService {

	List<String> getRegioni();   // tutte le regioni
	
	List<Provincia> getProvince();  // tutte le province
	
	List<Provincia> getProvinceByRegione(Regione r); 
	List<Provincia> getProvinceByRegione(String regione);
	
	Map<Integer, Provincia> getProvinceMap();
	
	Provincia getProvinciaById(int id);
}
