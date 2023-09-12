package model;

public class ContoCorrente {

	private static int contatore = 1; 
	
	// variabile static :
	
	// - condivisa tra tutte le istanze della classe
	// - in questo caso la variabile static è anche private perchè corrisponde al numero del conto
	
	private int numero;
	public Cliente titolare;
	private double saldo;
	
	public ContoCorrente(Cliente titolare) {
		
		this.numero = contatore++;
		this.titolare = titolare;
		this.saldo = 0;
	}
	
	public void versamento(double sommaVersata) {
		this.saldo += sommaVersata;
	}
	
	public double prelievo(double sommaRichiesta) {
		
		if (sommaRichiesta < this.saldo) {
			
			this.saldo -= sommaRichiesta;
			return sommaRichiesta;
		}
		System.out.println("Non puoi ritirare " + sommaRichiesta);
		System.out.println("La disponibilità sul tuo conto è di : " + this.saldo);
		return 0; // NON TI RITORNO LA sommaRichiesta PERCHE' E' MAGGIORE DEL TUO SALDO
		
	}
	
	public double getSaldo() {  // metodo getter , RITORNA IL SALDO ATTUALE
		return this.saldo;
	}
	
	public String report() {
		return "Conto Corrente n. " + this.numero 
	    + "\n" + "titolare : " + this.titolare.nome 
	    + "\n" + "saldo attuale : " + this.saldo; 
	}
}
