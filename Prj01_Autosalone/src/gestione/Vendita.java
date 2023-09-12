package gestione;

import java.util.Iterator;

import mezzi.Automobile;

public class Vendita {

	public static void main(String[] args) {
		
		Automobile a1 = new Automobile("Fiat", "Panda", 2012, 1550);
		Automobile a2 = new Automobile("Renault", "Twingo", 2020, 10500);
		Automobile a3 = new Automobile("Fiat", "Punto", 2016, 4550);
		Automobile a4 = new Automobile("Volkswagen", "Polo", 2003, 835);
		Automobile a5 = new Automobile("Ferrari", "GT500", 2021, 45550);
		Automobile a6 = new Automobile("Mercedes", "Classe C", 2017, 17550);
		Automobile a7 = new Automobile("volkswagen", "Golf", 2022, 20200);
		Automobile a8 = new Automobile("Fiat", "500L", 2020, 15300);
		Automobile a9 = new Automobile("Toyota", "Yaris", 2019, 12550);
		Automobile a10 = new Automobile("BMW", "Serie5", 2018, 24000);
		
		Automobile[] garage = {a1,a2,a3,a4,a5,a6,a7,a8,a9,a10};
		
		double totaleGarage = 0;  // valore totale del garage
		for(int i = 0; i < garage.length; i++) {
			
			totaleGarage += garage[i].prezzo;
			System.out.println(garage[i].stampaLibretto() + "\n"); // stampa il libretto di ogni auto
		}
		
		// System.out.println(a1 + "\n" + a2); // stampa gli indirizzi di memoria degli oggetti
		
		System.out.println("valore totale del garage : " + totaleGarage + " €");

	}

}
