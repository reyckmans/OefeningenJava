package examendecember;

public class Oefening5 {
	
	public static void main(String args[]) {
		Oefening5 ifOefening = new Oefening5();
		ifOefening.veelvouden();
	}
	
	private void veelvouden() {
		int alles = 0;

		for (int i = 0; i < 1000; i++) {
			if ((i % 5== 0) || (i % 3== 0)){
				alles = alles + i;
			}
		}
		System.out.println(alles);
	}
}
