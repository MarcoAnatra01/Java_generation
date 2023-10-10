package it.marco.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="poolazione_italiana_regione")
public class PopolazioneRegione {

	private int id;
	private String regione;
	private String comune;
	private int maschi;
	private int femmine;
	private int totale;
	
	public PopolazioneRegione(int id, String regione, String comune, int maschi, int femmine, int totale) {
		this.id = id;
		this.regione = regione;
		this.comune = comune;
		this.maschi = maschi;
		this.femmine = femmine;
		this.totale = totale;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public int getMaschi() {
		return maschi;
	}

	public void setMaschi(int maschi) {
		this.maschi = maschi;
	}

	public int getFemmine() {
		return femmine;
	}

	public void setFemmine(int femmine) {
		this.femmine = femmine;
	}

	public int getTotale() {
		return totale;
	}

	public void setTotale(int totale) {
		this.totale = totale;
	}
	
	
	
	
	
}
