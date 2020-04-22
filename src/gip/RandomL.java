package gip;

import java.util.Random;

public class RandomL {

	// rondom letter maken
	public char makeRandomL() {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		char c = chars.charAt(rnd.nextInt(chars.length()));
		return c;
	}
			
}
