package array;

public class StringOmdraaienArray2{
	
	public static void main(String[]args) {
		StringOmdraaienArray2 reverse = new StringOmdraaienArray2();
		String omgedraaidestring = reverse.stringreverse("dit is een zin");
		System.out.println(omgedraaidestring);
	}
	
	public String stringreverse(String zin){
		
		char[] caracters = new char[zin.length()];
		
		for (int i = 0; i < caracters.length; i++) 
		{
			caracters[zin.length()-i -1 ] = zin.charAt(i);
		}
		
		String nieuweZin = "";
		
		for (int i = 0; i < caracters.length; i++) 
		{
			nieuweZin = nieuweZin + caracters[i];
		}
		return nieuweZin;
	}
}
