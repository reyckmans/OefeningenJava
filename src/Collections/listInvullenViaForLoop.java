package Collections;

import java.util.ArrayList;
import java.util.List;

public class listInvullenViaForLoop {

	public static void main(String[]args) {
		listInvullenViaForLoop list = new listInvullenViaForLoop();
		list.invullen();
		
	}
	
	public void invullen() {
		
		List<String> gegevens = new ArrayList<String>();
		
		String woord = "Strijder";
		int getal = 0;
		
		for (int i = 0; i < 100; i++) {
			gegevens.add(woord + getal);//of gegevens[i] = woord + getal++;
			getal = getal + 1;//deze is dan niet nodig	
		}
		
		System.out.println(gegevens);
		
		gegevens.clear(); // dit dient om de array teurg leeg te maken
	}
}
