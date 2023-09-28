package model;

public class Materia {

	private String nome;

	private int id;

	public Materia(int id, String nome) {
		this.nome = nome;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "nome: " + nome + " - id = " + id;
	}
	
	
	
	
}
