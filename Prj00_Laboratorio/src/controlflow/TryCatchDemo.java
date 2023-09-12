package controlflow;

public class TryCatchDemo {

	public static void main(String[] args) {

		// GESTIONE DELLE ECCEZIONI
		
		String[] colori = {"giallo", "rosso", "verde"};
		
		// System.out.println(colori[-3]); , esempio eccezione
		
		
		try {
			
			int num1 = 0;
			int num2 = 0;
			int divisione = num1 / num2;
			System.out.println("risultato divisione = " + divisione);
			
		} catch (ArithmeticException eccezione) {  // cattura l'eccezione
			
			// stampo messaggi di tipo errore (syserr)
			
			System.err.println("Si è verificata un'eccezione !");
			System.err.println(eccezione.getMessage()); // messaggio eccezione
		}
		System.out.println("programma terminato");
		

	}

}
