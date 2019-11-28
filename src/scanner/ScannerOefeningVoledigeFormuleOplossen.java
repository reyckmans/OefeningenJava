package scanner;

import java.util.Scanner;

public class ScannerOefeningVoledigeFormuleOplossen {
	private Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		ScannerOefeningVoledigeFormuleOplossen scanneroefening = new ScannerOefeningVoledigeFormuleOplossen();
		scanneroefening.readinput();
	 }
	
	private void readinput() {
		System.out.println("geef je formule in aub:");
		String formule = scanner.nextLine();
		int positie = formule.indexOf("+");
		String eerstegedeelte = formule.substring(0, positie);
		System.out.println(eerstegedeelte);
		
		String tweedegedeelte = formule.substring(positie +1, formule.length());
		System.out.println(tweedegedeelte);
		
		double eersteDouble = Double.parseDouble(eerstegedeelte);
		double tweedeDouble = Double.parseDouble(tweedegedeelte);}
}
