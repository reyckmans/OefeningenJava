package examendecember;

import java.util.Scanner;

public class Oefening3 {
	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Oefening3 scannerOefening = new Oefening3();
		scannerOefening.readinput();
	}
	
	private void readinput() {
		System.out.println("Geef aub een zin in:");
		String input = scanner.nextLine();
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			System.out.println(c);
		}
	}
}
