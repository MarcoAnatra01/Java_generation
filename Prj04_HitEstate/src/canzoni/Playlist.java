package canzoni;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Playlist {

	public static void main(String[] args) {
		

/* TRACCIA
 * 
 * 1- stampa playlist un brano alla volta
 * 2- chiedi all'utente se vuole salvare il brano nella playlist personale 
 * 3- se si, salvare nella playlist personale , altrimenti passare al brano successivo 
 * 4- scrivere un file txt contenente la tua playlist personale
*/

		File hits22 = new File ("documents/hit-estate-2022.txt");
		ArrayList<Canzone> hitlist = new ArrayList<Canzone>();
		ArrayList<Canzone> playlist = new ArrayList<Canzone>();
		
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
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("file non trovato");
		}
		
		
		Scanner utente = new Scanner(System.in);
		
		// for each con cui ciclo l'ArrayList
		
		for (Canzone canzone : hitlist) {
			System.out.println(canzone);
			System.out.println("Vuoi salvare il brano nella playlist personale ?");
			String rispostaUtente = utente.nextLine();
			
			if (rispostaUtente.equals("s")) {
				playlist.add(canzone);
				System.out.println("brano aggiunto");
			}
		}
		System.out.println("n. brani playlist : " + playlist.size());
		
		File  myplaylist = new File("documents/myplaylist.txt");
		
		try {
			PrintWriter download = new PrintWriter(myplaylist);
			for (Canzone canzone : playlist) {
				
	// scrivo la canzone su myplaylist.txt con PrintWriter download
				
				download.println(canzone);
			}
			download.close();  // chiudo il file txt sul disco
			
		} catch (FileNotFoundException e) {
			System.out.println("file non trovato");
		}
	}
}


