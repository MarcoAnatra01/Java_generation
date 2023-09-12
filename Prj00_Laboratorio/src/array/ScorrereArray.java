package array;

public class ScorrereArray {

	public static void main(String[] args) {

		int[] voti = {25,26,27,28,29};
		
		
		// FOR MIGLIORATO (FOR EACH)
		// VANTAGGIO : non necessita di condizione e incremento
		// SVANTAGGIO : non possiede il contatore e può scorrere in un solo verso (non scorre al contrario)
		
		for (int voto : voti) {
			
			// ogni elemento dell'array è salvato nella variabile voto
			
			System.out.println(voto);
		}
		
		

	}

}
