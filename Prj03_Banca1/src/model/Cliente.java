package model;

public class Cliente {

	public String nome;
	
	// COSTRUTTORE :
	// - deve chiamarsi come la classe
	// - unico metodo che INIZIA CON LA MAIUSCOLA
	// - non ritorna nessun valore ma NON bisogna inserire "void" prima del nome 
	
	public Cliente(String nome) {  // parametro (String nome) corrisponde al nome inserito nella creazione dell'ISTANZA ---> new Cliente("Luca")
		
		this.nome = nome;
	}
}
