package it.marco.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "film")
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String titolo;
	private String regista;
	private String genere;
	
	public Film(int id, String titolo, String regista, String genere) {
		this.id = id;
		this.titolo = titolo;
		this.regista = regista;
		this.genere = genere;
	}
	
	
}
