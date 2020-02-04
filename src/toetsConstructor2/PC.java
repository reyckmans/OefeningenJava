package toetsConstructor2;

public class PC {

	int ramgeheugen; 
	int hddCapacity;
	
	public PC() {
		
	}
	
	public PC(int ramgeheugen) {
		this.ramgeheugen = ramgeheugen;
	}
	
	public PC(int ramgeheugen,int hddCapacity) {
		this(ramgeheugen);
		this.hddCapacity = hddCapacity;
	}
}
