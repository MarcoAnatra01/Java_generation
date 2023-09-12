package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LeggiFile {

	public static void main(String[] args) {
		
		File f = new File("files/frutti.txt"); 
		File out = new File("files/frutti_maiuscoli.txt");
		
		// i file di testo servono per simulare l'interfacciamento con un database
				
		try {
			
			int a = 7/0;
			
			//Scanner input = new Scanner(f);
			
			PrintWriter pw = new PrintWriter(out);
			
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String riga; 
			
			while( (riga = br.readLine()) != null ) {
				
				//= (input.nextLine()) - condizione alternativa del while se si usa Scanner
				
				if (riga.equals("fragole")) {
					
					// sollevo l'eccezione che ho creato
					throw new MiaEccezione("si capisce?");
					
				}else {
					
					System.out.println(riga);
					
					// scrivo in maiuscolo la riga nel file frutti_maiuscoli.txt
					
					pw.println(riga.toUpperCase());
				}
				pw.close();  // chiudo il file frutti_maiuscoli.txt sul disco
				br.close();  // chiudo il buffer
			
			}
			
		}  // chiusura del try
		
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		} catch (MiaEccezione e) {
			
			System.err.println("AIUTOOOOOOOOOOOO");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.err.println("Generica eccezione");
			System.err.println(e.getMessage());
		}
		
		System.out.println("Programma terminato");
	}

}
