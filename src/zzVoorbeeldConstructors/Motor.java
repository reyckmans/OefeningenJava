package zzVoorbeeldConstructors;

public class Motor {

	int pk;
	int koppel;
	int celinders;
	int aantalVersnellingen;
	boolean turbo;
	
	public Motor() {
		
	}
	
	public Motor(int pk, int koppel, int celinders, int aantalVersnellingen,boolean turbo) {
		this.pk = pk;
		this.koppel = koppel;
		this.celinders = celinders;
		this.aantalVersnellingen = aantalVersnellingen;
		this.turbo = turbo;
	}
}
