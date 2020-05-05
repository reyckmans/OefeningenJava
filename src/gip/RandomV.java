package gip;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomV {
	
	File onveranderbarelijst = new File("D:\\School\\School 2019-2020\\OOP\\Oefeningen\\OefeningenJava\\OefeningenJava\\src\\gip\\RandomVlijst.txt");
	public String readLijst() {
		try {
			Scanner scanner = new Scanner(onveranderbarelijst);
			String randomV = "";
			while (scanner.hasNext()) {
				String input = scanner.nextLine();
				if(randomV == "") { //als de scanner geen tekst meer kan lezen is moet hij terug naar het begin
					randomV = input;
				}else {
					randomV = randomV + "\n" + input;
				}
			}
			return randomV;
		} catch (FileNotFoundException e) { //als je bestand niet gevonden is is dt de foutmelding.
			System.out.println("sorry, je bestant is niet gevonden");
			e.printStackTrace();
		}
	return "error reading file";
	}
	
	/*List<String> onveranderbarelijst = Arrays.asList("Een beroep met een….", 
		 	"Een zoogdier…", 
		 	"Een jongensnaam…", 
		 	"Een meisjesnaam",
		 	"Wat zie je in de woonkamer…",
    		"Wat zie je op de boerderij….",
    		"Een insekt…",
    		"Kledingstuk/Schoeisel….",
    		"Noem een kleur….",
    		"Noem een land….",
    		"Noem een vissoort met een…..",
    		"Noem een vogelsoort…",
    		"Wat vind je in de keuken….",
    		"Wat vind je in de woonkamer….",
    		"Noem een bloem plant", "boom of struik….");*/
	
	 List<String> givenList = new ArrayList<String>(onveranderbarelijst);
	
	// random vraag kiezen
	public String makeRandomV() {
		Random rndV = new Random();
	    int randomgetaltussenNulenGrottevandelijst = rndV.nextInt(givenList.size());
	    String gekozenVraag = givenList.get(randomgetaltussenNulenGrottevandelijst);
	    givenList.remove(gekozenVraag);
	    return gekozenVraag;
	}
}
