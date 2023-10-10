package it.marco.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class FilmInSala {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	// possono esserci molti cinema
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Cinema cinema;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Film film;
	
	private double prezzo;
	
	private int posti;  // posti rimanenti
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getPosti() {
		return posti;
	}

	public void setPosti(int posti) {
		this.posti = posti;
	}
	
	
}
