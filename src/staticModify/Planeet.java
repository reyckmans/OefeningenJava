package staticModify;

public class Planeet {
	
	static final double straalAardeZon =149600000;
	static final double omlooptijdAardeZon= 365 * 24;
	
	static final double straalVenusZon = 108000000;
	static final double omlooptijdVenusZon = 224 * 24;
	
	static final double straalJupiterZon = 778330000;
	static final double omlooptijdJupiterZon = 4015 * 24;
	
	
	public static double snelheidBaanPlaneet(double omlooptijd, double omloopafstand) {
		double afstand = 2 * Math.PI * omloopafstand;
		return afstand / omlooptijd;
	}
}
