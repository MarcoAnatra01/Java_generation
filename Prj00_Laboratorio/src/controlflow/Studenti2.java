package controlflow;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Studenti2 {

	public static void main(String[] args) {

		// oggetto File , nome : f , file : studenti.txt
		File f = new File("documenti/studenti.txt");
		
		// oggetto File , nome : studentiList , file : studenti.html
		File studentiList = new File("documenti/studenti.html");
		
		try {
			
			// oggetto Scanner che porta al file f
			Scanner input = new Scanner(f);
			
			// oggetto PrintWriter , nome : pennarello
			// con il pennarello non punto alla console 
			// non punto alla console ma al file studenti.html
			// in questo modo lavora sul codice html  
			PrintWriter pennarello = new PrintWriter(studentiList);
			
			pennarello.println("<ul>"); // INIZIO LISTA HTML
			
			while(input.hasNextLine()) {  // INIZIO CICLO
				
				// variabile studente : 
				// contiene una riga del file input studenti.txt (cioè il nome studente)
				String studente = input.nextLine();
				
				// creo un list item con il PrintWriter
				pennarello.println("<li>" + studente + "</li>");
				
			} // FINE CICLO
			
			pennarello.println("</ul>"); // FINE LISTA HTML
			
			pennarello.close();       // chiudo il file html sul disco
			
			System.out.println("Programma terminato ,codice generato");
			
		} catch (FileNotFoundException e) {
			
			System.err.println("Error: file non trovato, verificare il nome file");
			System.err.println(e.getMessage());
			
			// messaggio eccezione completo di java
			// e.printStackTrace(); 
		}
	}
}
