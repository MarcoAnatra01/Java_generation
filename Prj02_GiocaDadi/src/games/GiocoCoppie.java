package games;

public class GiocoCoppie {

	public static void main(String[] args) {
		
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();

		final int PARTITE = 10;  // COSTANTE, NUMERO PARTITE DA GIOCARE
		int vittorie = 0;
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < PARTITE; i++) {
			
			int res1 = dado1.launch();
			int res2 = dado2.launch();
			
			if (res1==res2) {
				System.out.println("hai vinto!" + "\n" + "sono usciti una coppia di : " + res1 + "\n");
				vittorie++;
				
			}
		}
		long stop = System.currentTimeMillis();
		
		System.out.println("Hai giocato " + PARTITE + " volte");
		System.out.println("Hai vinto " + vittorie + " volte");
		
		double percentuale = (double)vittorie/PARTITE * 100;
		System.out.println("Percentuale di vittorie = " + percentuale + "\n");
		
		double elaborazione = stop - start; 
		System.out.println("Durata di elaborazione del ciclo = " + elaborazione + "ms");
	}

}
