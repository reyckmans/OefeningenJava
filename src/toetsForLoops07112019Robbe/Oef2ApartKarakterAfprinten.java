package toetsForLoops07112019Robbe;

public class Oef2ApartKarakterAfprinten {
	
	public static void main(String[] args) {
		String s = "hallo";
		
		for (int i = 0; i <s.length(); i++) {
			char c = s.charAt(i);
			System.out.println("character " + (i+1) +":" + "'"+ c +"'");
		}
	}
}
