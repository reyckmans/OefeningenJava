package scanner;

import java.util.Scanner;

public class ScannerDieNaamVraagt {
	private Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		 ScannerDieNaamVraagt naam = new ScannerDieNaamVraagt();
		 naam.readinput();
	 }
	
	private void readinput() {
		System.out.println("Geef aub uw naam in:");
		String input = scanner.nextLine();
		System.out.println("De naam is: " + input);
	}
}
