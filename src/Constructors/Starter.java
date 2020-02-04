package Constructors;

public class Starter {

	public static void main(String[]args) {
		Auto polo = new Auto("United", false, 15,"united blue", new Motor(95, 175, 3, 5, false, 70));
		System.out.println("De auto zelf ==> " + "\n"
		+ "Uitvoering: " + polo.uitvoering + "\n"
		+ "Standaartvelg: " + polo.standaartvelg + "\n"
		+ "Velg maat: " + polo.velgMaat + "\n"
		+ "Kleur: " + polo.color + "\n"
		+ "\n"
		+ "De motor ==>" + "\n"
		+ "Aantal pk: " + polo.motor.pk + "\n"
		+ "Het koppel: " + polo.motor.koppel + "\n"
		+ "Het aantal celinders: " + polo.motor.celinders + "\n"
		+ "Aantal versnellingen: " + polo.motor.aantalVersnellingen + "\n"
		+ "Turbo: " + polo.motor.turbo);
	}
}
