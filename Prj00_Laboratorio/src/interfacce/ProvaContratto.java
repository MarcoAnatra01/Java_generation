package interfacce;

import java.util.ArrayList;
import java.util.List;

public class ProvaContratto {

	public static void main(String[] args) {

		// anche le interfacce sono un tipo come le classi
		
		Contratto negozi = new Negozio();
		Contratto piloti = new PilotaF1();
		
		
		
		// ArrayList contenente tutti coloro che hanno firmato il Contratto 
		
		List<Contratto> contrattualizzati = new ArrayList<Contratto>();

		contrattualizzati.add(negozi);
		contrattualizzati.add(piloti);
		
		for (Contratto contratto : contrattualizzati) {
			
			contratto.brandizzare();
		}
		
	}

}
