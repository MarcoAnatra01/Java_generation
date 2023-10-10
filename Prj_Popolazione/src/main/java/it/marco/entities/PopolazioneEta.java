package it.marco.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="popolazione_italiana_eta")
public class PopolazioneEta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	private int eta;
	
	private int maschi;
	private int femmine;
	private int totale;
	
	
	public PopolazioneEta(int eta, int maschi, int femmine, int totale) {
		this.eta = eta;
		this.maschi = maschi;
		this.femmine = femmine;
		this.totale = totale;
	}


	public int getEta() {
		return eta;
	}


	public void setEta(int eta) {
		this.eta = eta;
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
