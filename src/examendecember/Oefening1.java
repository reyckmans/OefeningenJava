package examendecember;

public class Oefening1 {

	public static void main(String[] args) {
		Oefening1 forLoop = new Oefening1();
		forLoop.uitprintenVanGetallen();
	}
	
	private void uitprintenVanGetallen() {
		for (int i = -50; i >= -90; i--) {
			if ((i % 6)==0) {
				
			}
			else {
				System.out.println(i);
			}
		}
	}
}
