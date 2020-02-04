package Constructors;

public class Auto {
	
	String uitvoering;
	boolean standaartvelg;
	int velgMaat;
	String color;
	Motor motor;
	
	public Auto() {
		
	}
	
	public Auto(String uitvoering, boolean standaartvelg, int velgMaat, String color, Motor motor) {
		this.uitvoering = uitvoering;
		this.standaartvelg = standaartvelg;
		this.velgMaat = velgMaat;
		this.color = color;
		this.motor = motor;
	}
}
