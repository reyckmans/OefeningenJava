package Collections;

public class arrayInvullenViaForLoop {

	public static void main(String[]args) {
		arrayInvullenViaForLoop array = new arrayInvullenViaForLoop();
		array.invullen();
	}
	
	public void invullen(){
		String[] gegevens = new String[100];
		
		String woord = "strijder";
		int getal = 0;
		
		for (int i = 0; i < gegevens.length; i++) {
			gegevens[i] = woord + getal; //of gegevens[i] = woord + getal++;
			getal = getal + 1; //deze is dan niet nodig
			
			System.out.println(gegevens[i]);
		}
		
		for (int i = 0; i < gegevens.length; i++) {
			gegevens[i] = null; // dit dient om de array teurg leeg te maken
		}
	}
}
