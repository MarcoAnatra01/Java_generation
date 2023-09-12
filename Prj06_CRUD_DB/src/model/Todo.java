package model;

import java.time.LocalDate;

public class Todo {

	private LocalDate data;
	private String descrizione;
	private boolean fatto;
	
	/**
	 * @param descrizione: la cosa fare/comprare
	 */
	public Todo(String descrizione) {
		
		this.data = LocalDate.now();  // data di oggi
		this.descrizione = descrizione;
		this.fatto = false;
	}
	
	
	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public boolean isFatto() {
		return fatto;
	}

	public void setFatto(boolean fatto) {
		this.fatto = fatto;
	}

	public void completa() {
		this.fatto = true;
	}

	@Override
	public String toString() {
		return "data: " + data + " - descrizione: " + descrizione + " -  fatto = " + fatto;
	}
	
	
}
