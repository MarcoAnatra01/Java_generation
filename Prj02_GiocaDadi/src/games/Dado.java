package games;

public class Dado {
	
	public int facce;
	
	public Dado() {
		this.facce = 6;
	}
	
	public int launch() {
		int i = 1;
		
		// CALCOLO VALORE RANDOM TRA 1 E IL NUMERO DI FACCE DEL DADO
		double casuale = Math.random();  // GENERAZIONE NUMERO RANDOM COMPRESO TRA 0.0 e 1 (1 ESCLUSO)
		
		i=(int)(casuale * facce) + 1;  // GENERAZIONE DEL NUMERO RANDOM CHE ESCE SUL DADO E CONVERSIONE DA double A int 
				
		return i;
	}
	
	

}
