package model;

public class Bevanda {
	
	public String nome;
	public double prezzo;
	
	public String getMessaggio() {
		String s = "";
		
		s += "Scontrino : \n";
		s += "prodotto selezionato \n";
		s += nome + "\n";
		s += "prezzo \n";
		s += prezzo + "\n";
		
		return s;
	}
}
