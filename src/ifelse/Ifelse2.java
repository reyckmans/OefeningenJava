package ifelse;

public class Ifelse2 {
	public static void main(String[]args) {
		Ifelse2 ifelse = new Ifelse2();
		boolean result = ifelse.controleCalculation(15,42);
		System.out.println("resultaat: " + result);
	}
	
	public boolean controleCalculation(double a, double b) {
		if(a > b) 
		{
			return a;
		}
		else
		{
			return b;
		}
	}
}
