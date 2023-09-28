package view;

import model.*;

public class ViewRegistro {   // INTERFACCIA

	public String stampaStudente(Studente s) {
		
		return "\n***********************\n" + 
			   "nome: " + s.getNome() + 
			   "\n***********************\n";
	}
}
