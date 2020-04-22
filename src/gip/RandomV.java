package gip;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomV {
	
	// random vraag kiezen
	public String makeRandomV() {
		Random rndV = new Random();
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
	    
	    int numberOfElements = 2;
	    return makeRandomV();
	}
}
