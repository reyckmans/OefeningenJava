package scanner;

import java.util.Scanner;

public class ScannerOefeningen {
	private Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		 ScannerOefeningen scanneroefeningen = new ScannerOefeningen();
		 scanneroefeningen.readinput();
		 scanneroefeningen.readinput2();
		 scanneroefeningen.readinput3();
		 
		 scanneroefeningen.readinput4();
	 }
	
	private void readinput() {
		//oefening scanner die de naam vraagt en uitprint 
		System.out.println("Geef aub uw naam in:");
		String input = scanner.nextLine();
		System.out.println("De naam is: " + input);
	}
	
	
	private void readinput2() {
		//oefening scanner vraagt 2 getallen en telt ze op
		System.out.println("Geef het eerste cijfer in aub:");
		double getal1 = scanner.nextDouble();
		
		System.out.println("Geef het tweede cijfer in aub:");
		double getal2 = scanner.nextDouble();
		
		double uitkomst = getal1 + getal2;
		
		System.out.println("de uitkomst is gelijk aan: " + uitkomst);
	}
	
	private void readinput3() {
		//oefening scanner vraagt 2 getallen en deelt ze door elkaar
		System.out.println("geef het eerste cijfer in aub:");
		double getal1 = scanner.nextDouble();
		
		System.out.println("Geef het tweede cijfer in aub:");
		double getal2 = scanner.nextDouble();
		
		double uitkomst = getal1 / getal2;
		System.out.println("de uitkomst is gelijk aan: " + uitkomst);
	}
}
