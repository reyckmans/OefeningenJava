package toetsConstructor2;

public class Laptop extends PC {

	int gewicht;
	
	public Laptop() {
		
	}
	
	public Laptop(int ramgeheugen, int hddCapacity, int gewicht) {
		super(ramgeheugen, hddCapacity);
		this.gewicht = gewicht;
	}
	
	
}
