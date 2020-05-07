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
 * 
 * @author Robbe Eyckmans
 *
 */

public class RandomV {
	URL url = getClass().getResource("RandomVlijst.txt");
	File onveranderbarelijst = new File("src/gip/RandomVlijst.txt");
	List<String> givenList = new ArrayList<String>();
	public void readLijst() {
		try {
			Scanner scanner = new Scanner(onveranderbarelijst);
			String randomV = "";
			while (scanner.hasNext()) {
				String input = scanner.nextLine();
				givenList.add(input);
			}
		} catch (FileNotFoundException e) { //als je bestand niet gevonden is is dt de foutmelding.
			System.out.println("sorry, je bestant is niet gevonden");
			e.printStackTrace();
		}
		
	}

	// random vraag kiezen
	public String makeRandomV() {
		Random rndV = new Random();
	    int randomgetaltussenNulenGrottevandelijst = rndV.nextInt(givenList.size());
	    String gekozenVraag = givenList.get(randomgetaltussenNulenGrottevandelijst);
	    givenList.remove(gekozenVraag);
	    return gekozenVraag;
	}
}
