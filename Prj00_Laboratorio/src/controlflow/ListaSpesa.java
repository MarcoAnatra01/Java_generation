package controlflow;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ListaSpesa {

	public static void main(String[] args) {

		File f = new File ("documenti/listaSpesa.txt");
		
		try {
			Scanner input = new Scanner(f);
			
			while(input.hasNextLine()) {
				
				// hasNextLine() , metodo Scanner
				// verifica se il file è finito
				// ritorna true finchè ci sono righe nel file
				
				// finchè ci sono righe nell'input (nel file), stampa la prossima riga
				
				// stampo ogni riga del file
				System.out.println(input.nextLine()); 
			}
			
		} catch (FileNotFoundException e) {
			
			System.err.println("file non trovato, verifica il nome file");
		}

	}

}
