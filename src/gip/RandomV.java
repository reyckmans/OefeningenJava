package gip;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomV {
	 List<String> givenList = Arrays.asList("Een beroep met een….", "Een zoogdier…", "Een jongensnaam…", "Een meisjesnaam","Wat zie je in de woonkamer…",
	    		"Wat zie je op de boerderij….",
	    		"Een insekt…",
	    		"Kledingstuk/Schoeisel….",
	    		"Noem een kleur….",
	    		"Noem een land….",
	    		"Meisjesnaam….",
	    		"Noem een vissoort met een…..",
	    		"Noem een vogelsoort…",
	    		"Wat vind je in de keuken….",
	    		"Wat vind je in de woonkamer….",
	    		"Noem een bloem plant", "boom of struik….");
	
	// random vraag kiezen
	public String makeRandomV() {
		Random rndV = new Random();
	    int randomgetaltussenNulenGrottevandelijst = rndV.nextInt(givenList.size());
	    String gekozenVraag = givenList.get(randomgetaltussenNulenGrottevandelijst);
	    givenList.remove(gekozenVraag);
	    return gekozenVraag;
	}
}
