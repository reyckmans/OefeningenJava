package gip;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
* @author Robbe Eyckmans
*
* These classes actually have the same purpose as the previous classes (RandomL). The only difference is that these classes serve a random question.
* The random question does not originate from a String, it currently stems from a text file that I have linked to this file by name.
* Later it is intended that the questions will be placed in a database and that the game will randomly retrieve these questions from a database. You can read more about this in my French task.
*
* On line 32 you have the text file linked to this program by name.
* Then you can see that on line 34, the different questions are put in an Array.
* An Array can be compared to a list with all different boxes, where each question is referred to the one same box that has been programmed beforehand.
*
* You see on line 35 "public void readList ()" the part programmed in these brackets is all necessary for the program to read and use my text file in the game.
* On line 37 you will see the word scanner, this is the programmed part that ensures that the text is read from the text file (with the scanner) and can be used in the game.
* The Try / Catch speaks for itself, this is literally trying and if it does not absorb work by displaying a message in an advantageous way.
*
* Below you see "public String makeRandomV ()" this is the same as in the previous classes (RandomL), this ensures that the questions are shown randomly.
*/


public class RandomV {
//	URL url = getClass().getResource("RandomVlijst.txt");
//	File onveranderbarelijst = new File("src/gip/RandomVlijst.txt");
	List<String> givenList = new ArrayList<String>();
	ConectiesMetDB conectiesMetDB;
	
	
	public RandomV(ConectiesMetDB conectiesMetDB) {
		this.conectiesMetDB = conectiesMetDB;
	}
	
	public void readLijst() {
//		try {
//			Scanner scanner = new Scanner(onveranderbarelijst);
//			String randomV = "";
//			while (scanner.hasNext()) {
//				String input = scanner.nextLine();
//				givenList.add(input);
//			}
//		} catch (FileNotFoundException e) { //als je bestand niet gevonden is is dt de foutmelding.
//			System.out.println("sorry, je bestant is niet gevonden");
//			e.printStackTrace();
//		}
		givenList = conectiesMetDB.retrieveQuestionsFromDB();
	}
	
	// choose random question
	public String makeRandomV() {
		Random rndV = new Random();
	    int randomgetaltussenNulenGrottevandelijst = rndV.nextInt(givenList.size());
	    String gekozenVraag = givenList.get(randomgetaltussenNulenGrottevandelijst);
	    givenList.remove(gekozenVraag);
	    return gekozenVraag;
	}
}
