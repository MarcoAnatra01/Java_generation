package array;

public class ArrayStringhe {

	public static void main(String[] args) {
		
		String[] nani = {"pisolo", "mammolo", "eolo", "gongolo", "brontolo", "dotto", "cucciolo"};
	
	for (int i = 0; i < nani.length; i++) {
	
		if (nani[i].length() > 6) {
			System.out.println(nani[i].toUpperCase());  // stampa solo gli elementi dell'array con più di 6 caratteri tutti in MAIUSCOLO
		}
	}
	}
}

