package gip;

public class ControleVraag {

	int score = 0;
	
	public boolean checkAntwoord(String antwoord,String letter) {
		if (antwoord.toLowerCase().toCharArray()[0]== letter.toLowerCase().toCharArray()[0]) {
			score++;
			return true;
		}else {
			return false;
		}
	}
}
