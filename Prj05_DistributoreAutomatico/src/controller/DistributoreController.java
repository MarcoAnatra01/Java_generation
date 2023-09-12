package controller;

import model.*;  // importa tutte le classi del package model


public class DistributoreController {
	
	// CONTROLLER :
	// PROCEDURE E LOGICA PROGRAMMA

	public Bevanda bevanda;  // oggetto tipo Bevanda
	
	public Bevanda dammiBevanda(String nomeBevanda) {
		
		switch (nomeBevanda) {
		case "A1":
			bevanda = new Caffe();
			break;
		case "A2":
			bevanda = new CaffeLungo();
			break;
		case "A3":
			bevanda = new Cappuccino();
			break;
		case "A4":
			bevanda = new Cioccolata();
			break;
		case "A5":
			bevanda = new The();
			break;
		default:
			break;
		}
		
		
		return bevanda; 
	}
	
	
}
