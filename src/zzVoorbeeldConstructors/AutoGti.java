package zzVoorbeeldConstructors;

public class AutoGti extends Auto{
	
	boolean spoiler;
	
	public AutoGti(String uitvoering, boolean standaartvelg, String color, Motor motor, boolean spoiler) {
		super(uitvoering, standaartvelg, 20, color, motor);
		this.spoiler = spoiler;
		if (motor.pk < 95) {
			motor.pk = 200;
		}
		
	}
	

	
}
