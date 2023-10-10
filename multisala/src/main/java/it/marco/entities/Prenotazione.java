package it.marco.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "prenotazione")
public class Prenotazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private FilmInSala filmInSala;
	
	private String nome;  // chi ha fatto la prenotazione
	
	private int posti; // numero posti prenotazione

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public FilmInSala getFilmInSala() {
		return filmInSala;
	}

	public void setFilmInSala(FilmInSala filmInSala) {
		this.filmInSala = filmInSala;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPosti() {
		return posti;
	}

	public void setPosti(int posti) {
		this.posti = posti;
	}
	
	
}
