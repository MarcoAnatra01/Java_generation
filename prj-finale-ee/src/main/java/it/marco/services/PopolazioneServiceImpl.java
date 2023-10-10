package it.marco.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.marco.entities.Provincia;
import it.marco.entities.Regione;
import it.marco.repos.ProvinciaDAO;

@Service
public class PopolazioneServiceImpl implements PopolazioneService{

	@Autowired
	private ProvinciaDAO dao;
	
	
	private Map<Integer, Provincia> mappaProvince;
	
	
	public PopolazioneServiceImpl(ProvinciaDAO dao) {
		
		this.mappaProvince = new TreeMap<>();
	}
	
	
	private void inizializza() {
		
		// attraverso il DAO riempio la Mappa
		
		for (Provincia p : this.getProvince()) {
			this.mappaProvince.put(p.getId(), p);
		}
	}
	
	
	
	@Override
	public List<String> getRegioni() {

		/*
		Set<String> regioniSet = new TreeSet<String>();
		
		for (Provincia p : getProvinceMap().values()) {
			regioniSet.add(p.getRegione());
		}
		
		List<String> regioni = new ArrayList<String>(regioniSet);
		
		return regioni;
		*/
		
		
		return getProvinceMap()
				.values() // Collection di province
				
				.stream() // trasformo in stream
				
				.map(p -> p.getRegione())  // uso un getter dell'oggetto Provincia
				                           // prendo solo la proprietà regione
				
				.distinct() // evita duplicati
				.sorted()   // ordino 
				.toList();  // trasformo in List
	}

	@Override
	public List<Provincia> getProvince() {

		return dao.findAll();
	}
	
	
	
	@Override
	public List<Provincia> getProvinceByRegione(Regione r) {  // parametro Oggetto
		
		return null;
	}

	@Override
	public List<Provincia> getProvinceByRegione(String regione) {  // parametro Stringa

		return null;
	}
	
	

	@Override
	public Map<Integer, Provincia> getProvinceMap() {

		// prima chiamo inizializza()
		// ciclo l'AL con tutte le province
		// per ogni Obj Provincia, inserisco nella Mappa(id, Oggetto Pronvincia) 

		// poi posso ritornare la Mappa
		
		return this.mappaProvince;
	}

	@Override
	public Provincia getProvinciaById(int id) {

		return this.mappaProvince.get((Integer) id);
	}

}
