package array;


public class Array1 {
	
	public static void main(String[]args) {
		Array1 array = new Array1();
		array.bewerking();
		
		
	}
	
	public void bewerking(){
		int[] getal = new int[10];
		for (int i = 0; i < getal.length; i++) {
			getal[i] = i + 1;
		}
		
		for (int i = 0; i < getal.length; i++) {
			System.out.println(getal[i]);
		}
	}
}
