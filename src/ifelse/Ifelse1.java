package ifelse;

public class Ifelse1 {
	
	public static void main(String[]args) {
		Ifelse1 ifelse = new Ifelse1();
		boolean result = ifelse.controlIfNumberBetweenZeroAndOne(3);
		System.out.println("resultaat: " + result);
		
	}
	
	public boolean controlIfNumberBetweenZeroAndOne(double a) {
		 if(a < 1 && a > 0)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 } 
	}		
}
