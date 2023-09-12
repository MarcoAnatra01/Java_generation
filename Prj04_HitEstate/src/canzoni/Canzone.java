package canzoni;

public class Canzone {

	String cantante;
	String titolo;

	// creare il costruttore - scorciatoia 
	// alt + shift + s  ---> generate constructor using fields
	
	public Canzone(String cantante, String titolo) {
		super();
		this.cantante = cantante;
		this.titolo = titolo;
	}

	// toString() :
	// CONVERSIONE DEGLI ATTRIBUTI DELL'OGGETTO IN UN'UNICA STRINGA
	
	@Override  // il metodo toString() viene ridefinito
	public String toString() {
		return "cantante = " + cantante + " , titolo = " + titolo;
	}
	
	
	
}
