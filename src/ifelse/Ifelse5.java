package ifelse;

public class Ifelse5 {
	
	public static void main(String[]args) {
		Ifelse5 ifelse = new Ifelse5();
		boolean result = ifelse.controleCalculation(-50,45,92,"m");
		System.out.println("resultaat: " + result);
	}
	
	public boolean controleCalculation(double a, double b, double c, String s) {
		if((a > -100 && a < 0) && (b > 40 && b < 50) && (c >= 0) && (s.length() < 2 || s.length() > 10)) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
