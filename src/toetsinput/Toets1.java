package toetsinput;

import java.util.Scanner;

public class Toets1 {
	private Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Toets1 oef1 = new Toets1();
		oef1.readinput();
		
		Toets1 oef2 = new Toets1();
		oef2.readinput2();
	}
	
	private void readinput() {
		System.out.println("Geef een zin aub.");
		String zin = scanner.nextLine();
		
		System.out.println("Welk woord wilt u vervangen?");
		String woord = scanner.nextLine();
		String vervanging ="";
		
		for (int i = 0; i < woord.length(); i++) {
			vervanging = vervanging + "*";
		}
		
		if (zin.contains(woord)) {
			System.out.println(zin.replaceAll(woord, vervanging));
		}
	}
	
	private void readinput2() {
		System.out.println("Geef een getal en de macht in aub.");
		String formule = scanner.nextLine();
		
		/*if () {
			int positie = formule.indexOf("^");
			
			String eersteGetal = formule.substring(0, positie);
			String tweedeGetal = formule.substring(positie + 1, formule.length());
			
			double getalEEN = Double.parseDouble(eersteGetal);
			double getalTWEE = Double.parseDouble(tweedeGetal);
			
			System.out.println(Math.pow(getalEEN, getalTWEE));
		}
		else(){
			System.out.println("u heeft een verkeerde bewerking uitgevoerd");
		}*/
		int positie = formule.indexOf("^");
		
		String eersteGetal = formule.substring(0, positie);
		String tweedeGetal = formule.substring(positie + 1, formule.length());
		
		double getalEEN = Double.parseDouble(eersteGetal);
		double getalTWEE = Double.parseDouble(tweedeGetal);
		
		System.out.println(Math.pow(getalEEN, getalTWEE));
	}
}
