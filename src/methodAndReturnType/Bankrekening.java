package methodAndReturnType;

public class Bankrekening {
	
	public double bedrag = 0.0;
	
	public void addMoney(double money) {
		bedrag = bedrag + money;
	}
	
	public void withdrawMoney (double money) {
		bedrag = bedrag - money;
	}
	
}
