package gip;

import java.util.Random;

/**
 * deze classe zorgt er voor dat mijn spel een random letter genereerd. het weergeven gebeurt waneer men op de vraag knop drukt(deze staat geprogrameerd in de starter)
 * @author Robbe Eyckmans
 * @see Starter.jave
 *
 */

public class RandomL {

	// rondom letter maken
	public char makeRandomL() {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		char c = chars.charAt(rnd.nextInt(chars.length()));
		return c;
	}
			
}
