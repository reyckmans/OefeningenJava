package gip;

public class ControleVraag {

	int score = 0;
	
	public boolean checkAntwoord(String value,String vraag) {
		if (value.toCharArray()[0]== rndV) {
			score++;
			return true;
		}else {
			return false;
		}
	}
}
