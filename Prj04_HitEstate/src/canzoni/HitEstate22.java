package canzoni;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HitEstate22 {

	public static void main(String[] args) {

		File hits22 = new File ("documents/hit-estate-2022.txt");
		ArrayList<Canzone> hitlist = new ArrayList<Canzone>();
		
		try {
			
			Scanner input = new Scanner(hits22);
			
			while(input.hasNextLine()) {
				
				String canzone = input.nextLine();
				
				// CONVERSIONE String canzone - Array canzoneSplittata
				// si ottiene un array di 2 elementi :
				// - elemento 1 : cantante
				// - elemento 2 : titolo canzone
				
				// splitta ogni volta che trova il carattere pipe |
				// il pipe è preceduto da 2 backslash per prenderlo come elemento separatore e non come elemento matematico 
				String[] canzoneSplittata = canzone.split("\\|");
				
				String cantante = canzoneSplittata[0];
				String titolo = canzoneSplittata[1];
				
				// creazione oggetto c di tipo Canzone
				Canzone c = new Canzone(cantante, titolo);
				
				// aggiungo l'oggetto Canzone c all'ArrayList hitlist
				hitlist.add(c);
				
				//System.out.println(c);
				
			}  // chiusura while
			
		} catch (FileNotFoundException e) {
			System.out.println("file non trovato");
		}
		
		// for each con cui ciclo l'ArrayList
		
		/*for (Canzone canzone : hitlist) {
			System.out.println(canzone.titolo);
		}*/
		
		System.out.println("Sono presenti " + hitlist.size() + " canzoni" + "\n");
		
		// BRANO CASUALE
		
		Random random = new Random();
		
		// genera un numero casuale tra 0 e (hitlist.size() - 1)
		int casuale = random.nextInt(hitlist.size());
		
		System.out.println("Riproduzione di un brano casuale :");
		System.out.println(hitlist.get(casuale));	
	}
}
