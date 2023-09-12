package view;

import java.util.Scanner;

public class DistributoreView {
	
	// VIEW :
	// INTERFACCIA DISTRIBUTORE

	private Scanner scanner = new Scanner(System.in);
	
	final String MSG_SCELTA = "Scegli una bevanda";
	final String MSG_DENARO = "Inserisci credito";
	
	public String showMenu() {
		String s = "";
		
		s += "A1 - caffe: € 0.50" + "\n";
		s += "A2 - caffe lungo: € 0.55" + "\n";
		s += "A3 - cappuccino: € 0.60" + "\n";
		s += "A4 - cioccolata: € 0.65" + "\n";
		
		return s;
	}
	
	public String sceltaBevanda() {
		String s = "";
		
		System.out.println(MSG_SCELTA);  // Scegli una bevanda
		
		s = scanner.nextLine();  // l'utente digita il codice bevanda		
		return s;
	}
	
	public double chiediSoldi() {
		double d = 0;
		
		//TODO: LOGICA PER CARICAMENTO CREDITO
		
		return d;
	}
}
