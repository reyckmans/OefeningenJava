package staticModify;


public class StarterPlaneet {


	public static void main(String[] args) {
		double uitkomstAarde = Planeet.snelheidBaanPlaneet(Planeet.omlooptijdAardeZon, Planeet.straalAardeZon);
		System.out.println(uitkomstAarde + " km/uur" + " Aarde");
		
		double uitkomstVenus = Planeet.snelheidBaanPlaneet(Planeet.omlooptijdVenusZon, Planeet.straalVenusZon);
		System.out.println(uitkomstVenus + " km/uur" + " Venus");
		
		double uitkomstJupiter = Planeet.snelheidBaanPlaneet(Planeet.omlooptijdJupiterZon, Planeet.straalJupiterZon);
		System.out.println(uitkomstJupiter + " km/uur" + " Jupiter");
	}
	
	

}
