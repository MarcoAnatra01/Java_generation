package model;

public class Studente implements Comparable<Studente>{
	
	// implemento l'interfaccia Comparable<>, 
	// devo quindi obbligatoriamente sovrascrivere tutti i suoi metodi 
	// questa interfaccia ha solo un metodo, cioè compareTo()

	private int id;
	private String nome;
	
	
	// COSTRUTTORI
	
	public Studente() { // 1
	
	}

	public Studente(String nome) { // 2
		this.nome = nome;
	}

	public Studente(int id, String nome) { // 3
		this.id = id;
		this.nome = nome;
	}
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String toString() {
		return "nome: " + nome + " - id = " + id;
	}


	@Override
	public int compareTo(Studente altro) {
		
		// ORDINA UNO STUDENTE RISPETTO AD UN ALTRO STUDENTE
		
		return altro.nome.compareTo(this.nome);
	}
	
	
	
}
