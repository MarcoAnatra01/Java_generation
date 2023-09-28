package controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import model.*;

public class LeggiFile {

	public static ArrayList<Studente> leggiFileStudenti(String nomeFile) {
		
		File f = new File(nomeFile);
		
		// contenitore temporaneo di studenti
		ArrayList<Studente> tempStudenti = new ArrayList<>();
		
		try {
			Scanner sc = new Scanner(f);
			
			while(sc.hasNextLine()) {
				
				String riga = sc.nextLine();
				
				tempStudenti.add(new Studente(0, riga));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempStudenti;
	}
}
