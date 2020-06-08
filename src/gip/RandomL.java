package gip;

import java.util.List;
import java.util.Random;

/**
 * @author Robbe Eyckmans
 * @see Starter
 * 
 * word list:
 * 		String: is a sequence of characters, for e.g. “Hello” is a string of 5 characters. In java, string is an immutable object which means it is constant and can cannot be changed once it has been created. 
 * 		method: is a collection of statements that are grouped together to perform an operation.
 * 
 * These classes ensure that my game generates a random letter. the display happens when one clicks the play button (it is programmed in the starter classes)
 *
 * First of all a class called "RandomL" is created on line 21. In these classes everything will take place to make a random letter.
 * Next on line 25 you can find a String with all the letters. An order will be executed which is shown on line 27.
 * This command stands for each element of the string being taken separately over the lengths of the whole string and viewed as 1 part of the string.
 * On line 28 the order of line 27 is returned, this is essential for the operation of the order. this command is used that
 * Finally, a method random is made on line 26. this ensures that each separate element of the string appears in different sequences.
 */
public class RandomL {
	
	ConectiesMetDB conectiesMetDB;
	
	public RandomL(ConectiesMetDB conectiesMetDB) {
		this.conectiesMetDB = conectiesMetDB;
	}

	// Make random letter
	public char makeRandomL(int idvraag) {
//		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
//		char c = chars.charAt(rnd.nextInt(chars.length()));
//		return c;
		List<String> retrieveLettersFromDB = conectiesMetDB.retrieveLettersFromDB(idvraag);
		String gekozenLetter = retrieveLettersFromDB.get(rnd.nextInt(retrieveLettersFromDB.size()-1));
		char c = gekozenLetter.charAt(0);
		System.out.println(c);
		return c;
		//random uithalen
	}
			
}
