package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import model.*;

public class GestoreEsami {

	public static void main(String[] args) {
		
		ArrayList<Studente> studenti = new ArrayList<>();
		ArrayList<Materia> materie = new ArrayList<>();
		ArrayList<Esame> esami = new ArrayList<>();
		
		//per leggere il file, puoi anche usare la classe Scanner
		//qui è proposto un esempio con FileReader e BufferedReader
		//in ogni caso occorre gestire una IOException
		
		// qui leggo il file studenti.txt
		try {
			BufferedReader readerStudenti = new BufferedReader(new FileReader("files/studenti.txt"));
			String line;
			
			while ((line = readerStudenti.readLine()) != null) {
				
				String[] parts = line.split(",");
				
				// nella variabile studenteId inserisco il primo elemento dell'array parts[0] 
				// il primo elemento va convertito in tipo int con parseInt()
				int studenteId = Integer.parseInt(parts[0]);
				
				// il secondo elemento di parts[] è il nome studente
				String studenteNome = parts[1];
				Studente studente = new Studente(studenteId, studenteNome);
				studenti.add(studente);
			}
			readerStudenti.close();
			
		} catch (IOException e) {
			
			System.out.println("Errore nella lettura del file: " + e.getMessage());
		}
		
		
		// qui leggo il file materie.txt
		try {
			BufferedReader readerMaterie = new BufferedReader(new FileReader("files/materie.txt"));
			String line;
			
			while ((line = readerMaterie.readLine()) != null) {
				
				String[] parts = line.split(",");
				
				int materiaId = Integer.parseInt(parts[0]);
				String materiaNome = parts[1];
				Materia materia = new Materia(materiaId, materiaNome);
				materie.add(materia);
			}
			readerMaterie.close();
			
		} catch (IOException e) {
			
			System.out.println("Errore nella lettura del file: " + e.getMessage());
		}
		
		
		
		// qui leggo il file esami.txt
		try {
			BufferedReader readerEsami = new BufferedReader(new FileReader("files/esami.txt"));
			String line;
			
			while ((line = readerEsami.readLine()) != null) {
				
				String[] parts = line.split(",");
				
				int studenteId = Integer.parseInt(parts[0]);
				int materiaId = Integer.parseInt(parts[1]);
				int voto = Integer.parseInt(parts[2]);
				
				
				// trovaStudente e trovaMateria sono 2 metodi
				
				Studente studente = trovaStudente(studenti, studenteId);
				Materia materia = trovaMateria(materie, materiaId);
				
				if(studente != null && materia != null) {
					
					Esame esame = new Esame(studente, materia, voto);
					esami.add(esame);
				}
				
			}
			
		} catch (IOException e) {
			
			System.out.println("Errore nella lettura del file: " + e.getMessage());
		}
		
		Scanner s = new Scanner(System.in);
		
		int scelta;
		
		do {
			
			System.out.println("OPERAZIONI: ");
			System.out.println("1 - aggiungi studente");
			System.out.println("2 - aggiungi materia");
			System.out.println("3 - aggiungi nuovo voto");
			System.out.println("4 - esci");
			
			System.out.println("Digita il numero dell'operazione da eseguire:");
			
			scelta = s.nextInt();
			
			switch (scelta) {
				case 1: 
					
					System.out.println("inserisci id studente: ");
					int studenteId = s.nextInt();
					s.nextLine();
				      
					System.out.println("inserisci il nome studente: ");
					String nomeStudente= s.nextLine();
				      
				    Studente studente = new Studente(studenteId, nomeStudente);
				    studenti.add(studente);
				    
				    break;   
			      
			    case 2:
			    	
		    	    System.out.println("inserisci codice materia: ");
				    int materiaId = s.nextInt();
				    s.nextLine();
				    	  
				    System.out.println("inserisci nome materia: ");
				    String nomeMateria = s.nextLine();
				    	  
				    Materia materia = new Materia(materiaId, nomeMateria);
				    
				    break;
			    	  
			    case 3:
			    	
				    System.out.println("inserisci il nuovo voto: ");
				    int voto = s.nextInt();
				    s.nextLine();
				    	  
				    System.out.println("inserisci codice materia: ");
				    int materiaIdVoto = s.nextInt();
				    s.nextLine();
				    	  
				    System.out.println("id studente a cui assegnare il voto: ");
				    int studenteIdVoto= s.nextInt();
				    s.nextLine();
				    	  
				    // cerco nell'ArrayList studenti lo studente avente come id quello inserito dall'utente 
				    Studente studenteV = trovaStudente(studenti , studenteIdVoto);
				    
				    // cerco nell'ArrayList materie la materia avente come codice quello inserito dall'utente
					Materia materiaV = trovaMateria (materie , materiaIdVoto);
							
					if(studenteV != null && materiaV != null) {
							
						// creo un nuovo oggetto Esame che ha come parametri:
						
						// - l'oggetto Studente studenteV ritornato da trovaStudente()
						
						// - l'oggetto Materia materiaV ritornato da trovaMateria()
						
						// - il voto inserito dall'utente
						
						Esame esame = new Esame(studenteV, materiaV, voto);
						
						// aggiungo all'ArrayList esami il nuovo oggetto Esame esame appena creato
						esami.add(esame);
						
					}else {
						System.out.println("studenti o materia non trovati");
					}
					
					break;
					
			    case 4:
			    	
				    System.out.println("uscita dal programma");
				    
				    s.close(); // chiudo lo scanner
				    
				    break;
			    	  
		    	default: 
		    		System.out.println("scelta non valida");
			    	break;
				}
			
		}while(scelta != 4);
		
		
		
		for (Materia materia : materie) {
			
			double media = mediaVotixMateria(materia, esami); 
			System.out.println(materia.getNome() + "- media voti = " + media);
		}
		
		for (Studente studente : studenti) {
			
			double media = mediaVotixStud(studente, esami);
			System.out.println(studente.getNome() + "- media voti = " + media);
		}
		
		Collections.sort(esami, new Comparator<Esame>() {
			
			@Override
			public int compare(Esame esame1, Esame esame2) {
				return Integer.compare(esame2.getVoto(), esame1.getVoto());
			}
		});
		
		
		report("stampaMateria.txt", creaReport(materie, esami));
		
	}
	
	
	private static void report(String string, Object creaReport) {
		
		
	}


	private static Object creaReport(ArrayList<Materia> materie, ArrayList<Esame> esami) {

		// metodo che ritorna 
		
	}


	private static double mediaVotixMateria(Materia materia, ArrayList<Esame> esami) {

		double totale = 0;  // somma dei voti di una materia
		int numEsami = 0;   // numero di esami sostenuti in una materia
		
		for (Esame esame : esami) {
			
			if(esame.getMateria().getCodice() == materia.getCodice()) {
				
				numEsami++;
				totale += esame.getVoto();		
			}
		}
		if (numEsami > 0) {
			return totale/numEsami;
		}else {
			// se uno studente non ha sostenuto esami in una materia, ritorna zero
			
			return 0;
		}
	}
	
	
	private static double mediaVotixStud(Studente studente, ArrayList<Esame> esami) {

		double totale = 0;  // somma dei voti di una materia
		int numEsami = 0;   // numero di esami sostenuti in una materia
		
		for (Esame esame : esami) {
			
			if(esame.getMateria().getCodice() == studente.getId()) {
				
				numEsami++;
				totale += esame.getVoto();		
			}
		}
		if (numEsami > 0) {
			return totale/numEsami;
		}else {
			// se uno studente non ha sostenuto esami in una materia, ritorna zero
			
			return 0;
		}
	}
	

	private static Materia trovaMateria(ArrayList<Materia> materie, int codice) {
		
		for (Materia materia: materie) {
			
			if(materia.getCodice() == codice) 
				
				return materia;				
		}
		return null;
	}


	private static Studente trovaStudente(ArrayList<Studente> studenti, int id) {
			
		for (Studente studente : studenti) {
			
			if(studente.getId() == id) 
				
				return studente;			 
		}
		return null;
	}
	
	
	
}


