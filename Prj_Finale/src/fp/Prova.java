package fp;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

class Studente{
	String nome, cognome;

	public Studente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	
}

public class Prova {

	// PROGRAMMAZIONE FUNZIONALE
	
	// basata sulle INTERFACCE FUNZIONALI
	
	public static void main(String[] args) {
		
		try {
			Stream<String> lines = Files.lines(Paths.get("studenti.txt"));
			
			// .lines() ritorna uno Stream
			
			// una INTERFACCIA del package java.util.stream che comprende classi per gestire delle sequenze di elementi
			
			lines
			.map(s -> {
				String[] array = s.split(",");
				Studente stud = new Studente(array[0], array[1]);
				return stud;
			})
			.toList();
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
