package it.marco.entities;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

// generico componente
@Component
@Getter
@Setter
public class Regione {

	private String nome;
	private int popolazione;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
