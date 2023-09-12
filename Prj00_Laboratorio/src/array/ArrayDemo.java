package array;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] voti = {25, 26, 27, 28, 29};
		
		double totaleVoti = 0;
		
		for (int i = 0; i < voti.length; i++) {
			System.out.println("voto : " + voti[i]);
			totaleVoti += voti[i];
		}
		
		double mediaVoti = totaleVoti/voti.length;
		System.out.println("media voti = " + mediaVoti);
	}
}
