package examendecember;

import java.util.Scanner;

public class Oefening7 {
private Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		 Oefening7 scanneroefeningen = new Oefening7();
		 scanneroefeningen.readinput();

		 
	}
	
	private void readinput() {
		System.out.println("Geef aub uw zin in:");
		String input = scanner.nextLine();
		
		System.out.println("welke optie kiest u");
		String optie = scanner.nextLine();
		
		switch(optie) {
		case "1":
			int count1 = 0;
			for (int i = 0; i < input.length(); i++) {
				
				if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
					count1++;
				}
			}
			System.out.println("de zin bevat " + count1 +" klinkers");
			break;
		case "2":
			int count2 = 0;
			for (int i = 0; i < input.length(); i++) {
				
				if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
					
				}
				else {
					count2++;
				}
			}
			System.out.println("de zin bevat " + count2 +" medeklinkers");
			break;
		default:
			int aantalTekes = 0;
			int count3 = 0;
			for (int i = 0; i < input.length(); i++) {
				aantalTekes = input.charAt(i)+ count3;
			}
			System.out.println("de zin bevat " + count3 + " tekens");
		}
	}
}
	
	