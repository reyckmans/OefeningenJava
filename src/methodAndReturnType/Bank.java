package methodAndReturnType;

public class Bank {
	
	public static void main(String[]args) 
	{
		Bankrekening zichtrekening = new Bankrekening();
		
		zichtrekening.addMoney(40.0);
		
		System.out.println("zichtrekening = " + zichtrekening.bedrag);
		
		
		
		Bankrekening spaarrekening = new Bankrekening();
		
		spaarrekening.addMoney(20.0);
		spaarrekening.withdrawMoney(5.0);
		
		System.out.println("spaarrekening = " + spaarrekening.bedrag);
	}
}
