package main;

import java.util.ArrayList;
import java.util.Iterator;

import controller.GestoreEsami;
import controller.LeggiFile;
import model.*;

public class Main {

	public static void main(String[] args) {

		//Studente s = new Studente("Oscar");
		//Materia m = new Materia("db-SQL");
		
		//ArrayList<Studente> studentiLetti = LeggiFile.leggiFileStudenti("src/files/studenti.txt");
		
		GestoreEsami gestionale1 = new GestoreEsami();
		
		gestionale1.addMateria("Filosofia Java");
		
		gestionale1.modificaMateria("C++", 2); // update materie
		
		Materia m = gestionale1.getInsegnamenti().get(0);
		Studente s = gestionale1.getStudenti().get(0);
		int voto = 30;
		
		Esame e = new Esame(s,m,voto);
		gestionale1.addEsame(e);
		
		//caricaStudenti(studentiLetti, gestionale1);
		//gestionale1.inizializzaDalDatabase();
		
		/*
		for (Studente studente : gestionale1.getStudenti()) {
			
			// getStudenti() ci ritorna l'ArrayList<Studente> del gestionale1
			
			System.out.println(gestionale1.stampaStudente(studente));
		}
		
		
		for (Materia m : gestionale1.getInsegnamenti()) {
			System.out.println(m);
		}
		*/
		
		
	}  // chiusura main 
	
	
	private static void caricaStudenti(ArrayList<Studente> studentiLetti, GestoreEsami gestionale1) {
		
		for (Studente studente : studentiLetti) {
			
			gestionale1.addStudente(studente);
		}
	}

}
