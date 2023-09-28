package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import database.StudentiDB;
import model.*;
import view.ViewRegistro;
import database.*;

public class GestoreEsami {   
	
	// CLASSE CHE GESTISCE TUTTO IL PROGRAMMA
	
	// CONTIENE TUTTI I METODI UTILIZZATI DALLE CLASSI DEL CONTROLLER

	// dichiarazione ArrayList
	
	private ArrayList<Studente> studenti;
	private ArrayList<Materia> insegnamenti;
	private ArrayList<Esame> esami;
	
	private StudentiDB db;
	private MateriaDAO dao;
	private EsameDAO daoEsame;
	
	
	public GestoreEsami() {  // COSTRUTTORE 
		
		// inizializzo gli ArrayList nel costruttore
		
		this.studenti = new ArrayList<>();
		this.insegnamenti= new ArrayList<>();
		this.esami = new ArrayList<>();
		
		this.db = new StudentiDB();  // oggetto che rappresenta la tabella studenti del db jaita93
		
		this.dao = new MateriaDAO(); // oggetto che rappresenta la tabella materie del db jaita93
		
		this.daoEsame = new EsameDAO();
	}
	
	
	
	public void modificaMateria(String nuovoNome, int id) {
		this.dao.updateMateria(nuovoNome.toUpperCase(), id);
	}
	
	public void eliminaMateria(int id) {
		this.dao.deleteMateria(id);
	}
	
	public void inizializzaDalDatabase() {
		
		this.db.estrai(); 
		// fa la query alla tabella studenti
		// crea un oggetto Studente tramite i dati del record 
		// aggiunge l'oggetto all'ArrayList
		
		System.out.println(this.db.getStudenti());  // stampo l'ArrayList
	}
	
	
	public ArrayList<Studente> getStudenti() {
		
		// sort() ordina gli oggetti Studente dell'ArrayList tramite id
		
		// Collections.sort(studenti); 
		
		return this.db.getStudenti();	
	}


	public ArrayList<Materia> getInsegnamenti() {
		
		try {
			// GETTER ArrayList materie con gli oggetti creati tramite i record 
			
			this.insegnamenti = this.dao.getMaterie();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return insegnamenti;
	}

	
	public ArrayList<Esame> getEsami() {
		return esami;
	}

	public void addStudente(Studente s) {
		// aggiunge uno studente alla collection
		
		this.studenti.add(s);
	}
	
	public void addMateria(String nomeMateria) {
		// uso il metodo addMateria() della classe MateriaDAO  
		
		this.dao.addMateria(nomeMateria);
	}
	
	public void addEsame(Esame e) {
		// logica per aggiungere un esame al db
		
		// 1. collego ad EsameDAO
		// 2. 
			
		this.daoEsame.addEsame(e.getStudente(), e.getMateria(), e.getVoto());
	}
	
	
	
	public String stampaStudente(Studente s) {
		
		// creo un oggetto ViewRegistro per accedere al metodo stampaStudente()
		
		ViewRegistro view = new ViewRegistro();
		return view.stampaStudente(s);
	}


	

}
