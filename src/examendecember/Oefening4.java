package examendecember;

public class Oefening4 {

	public static void main(String[] args) {
		Oefening4 whileLoop = new Oefening4();
		whileLoop.teller();
	}
	
	private void teller() {
		int counter = -1;
		while (counter < 80) {
			counter++;
			System.out.println(counter);
		}
	}
}
