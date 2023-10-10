package model;

public class Serie {

	private int id;
	private String titolo;
	private String genere;
	private double rating;
	
	public Serie() {
	
	}
	
	
	public Serie(int id, String titolo, String genere, double rating) {
		this.id = id;
		this.titolo = titolo;
		this.genere = genere;
		this.rating = rating;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public String getGenere() {
		return genere;
	}


	public void setGenere(String genere) {
		this.genere = genere;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	@Override
	public String toString() {
		return "id-serie = " + id + ", titolo=" + titolo + ", genere=" + genere + ", rating=" + rating;
	}
	
	
	
}
