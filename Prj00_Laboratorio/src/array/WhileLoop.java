package array;

public class WhileLoop {

	public static void main(String[] args) {

		// WHILE
		// USATO QUANDO NON CONOSCO A PRIORI QUANTE VOLTE RIPETERE IL CICLO
		// - leggere dei file
		// - leggere database
		
		
		String[] note = {"do", "re", "mi", "fa", "sol", "la", "si"};
		
		boolean suona = true;
		
		while(suona) {  
			
			// suona una nota a caso e fermati se la nota è sol
			
			int casuale = (int) (Math.random() * note.length);
			
			if (note[casuale].equals("sol")) {
				suona = false;
			}
		}

	}

}
