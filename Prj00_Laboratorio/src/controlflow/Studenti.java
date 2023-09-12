package controlflow;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Studenti {

	public static void main(String[] args) {

		File f = new File("documenti/studenti.txt");
		int assenti = 0;
		int presenti = 0;
		
		try {
			Scanner input = new Scanner(f);
			Scanner prof = new Scanner(System.in);
			
			while(input.hasNextLine()) {
				
				// salvo nella variabile studente una riga del file input (cioè il nome studente)
				String studente = input.nextLine();
				
				System.out.println("E' presente lo studente " + studente + " ?");
				// risposta prof : s = si è presente
				String risposta = prof.nextLine();
				
				if (risposta.equals("s")) {
					presenti++;
				}else {
					assenti++;
				}
			}
			System.out.println("n assenti : " + assenti);
			System.out.println("n presenti : " + presenti);
			
		} catch (FileNotFoundException e) {
			
			System.err.println("Error: file non trovato, verificare il nome file");
		}
	}
}
