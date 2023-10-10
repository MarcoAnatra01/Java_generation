package collezioni;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Provincia {
	
	int id;
	String nome;
	boolean capoluogo;
}

class Regione {
	
	int id;
	String nome;
	Set<Provincia> province;
}



public class ProvaCollezioni {

	public static void main(String[] args) {
		
		// COLLEZIONI 
		
		
		// COLLECTION
		// interfaccia di java.util che comprende tutti i tipi di contenitori
		
		
		// LISTE
		
		// List è un'interfaccia con cui si possono creare diversi tipi di contenitori:
		// i contenitori di List hanno un ACCESSO POSIZIONALE
		
		// ArrayList è un contenitore che può contenere oggetti duplicati
		
		List<String> regioni = new ArrayList<>();
		
		
		// LinkedList invece 
		// new LinkedList<>(); 
		
		// Set prevede contenitori che NON hanno un ordinamento degli elementi al suo interno
		// new HashSet<>();
		
		//     Set   , Collection 
		// Map<String, String> regioniMap = new HashMap<>();
		
		
		Regione campania = new Regione();
		campania.id = 1;
		campania.nome = "Campania";
		
		Provincia p1 = new Provincia();
		p1.id = 1;
		p1.nome = "Napoli";
		p1.capoluogo = false;
		
		Provincia p2 = new Provincia();
		p2.id = 2;
		p2.nome = "Salerno";
		p2.capoluogo = false;
		
		campania.province.addAll(List.of(p1, p2));
		
		// of() - metodo che costruisce una List a partire da un numero arbitrario di oggetti di un certo Tipo
		
		// in questo caso lo usiamo solo per 
		
		
		
		Regione toscana = new Regione();
		toscana.id = 2;
		toscana.nome = "Toscana";
		
		Provincia p3 = new Provincia();
		p3.id = 3;
		p3.nome = "Firenze";
		p3.capoluogo = true;
		
		Provincia p4 = new Provincia();
		p4.id = 4;
		p4.nome = "Siena";
		p4.capoluogo = false;
		
		toscana.province.addAll(List.of(p3, p4));
		
		
		Map<Integer, Regione> regioniMap = new HashMap<>();
		regioniMap.put(campania.id, campania);
		regioniMap.put(toscana.id, toscana);
		
		// Set con le chiavi delle regioni (con gli id)
		Set<Integer> keySet = regioniMap.keySet(); 
		
		// Collection con i nomi delle regioni
		Collection<Regione> values = regioniMap.values();
		
		
		for (Integer chiave : keySet) {
			System.out.println(regioniMap.get(chiave));
		}
		
		for (Regione regione : values) {
			System.out.println(regione);
			System.out.println("----------------------");
		}
		
		
		for (Entry<Integer, Regione> reg : regioniMap.entrySet()) {
			
		}
		
		
		
	}
}
