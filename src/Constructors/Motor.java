package Constructors;

public class Motor {

	int pk;
	int koppel;
	int celinders;
	int aantalVersnellingen;
	boolean turbo;
	private int olipijl;
	
	public Motor() {
		
	}
	
	public Motor(int pk, int koppel, int celinders, int aantalVersnellingen,boolean turbo, int olipijl) {
		this.pk = pk;
		this.koppel = koppel;
		this.celinders = celinders;
		this.aantalVersnellingen = aantalVersnellingen;
		this.turbo = turbo;
		this.olipijl = olipijl;
	}
	
	public boolean controleerOlipijl() {
		if (olipijl > 6) {
			return true;
		}
		else{
			 return false;
		} 
	}
}
