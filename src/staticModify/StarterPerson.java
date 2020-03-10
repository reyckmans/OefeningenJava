package staticModify;

public class StarterPerson {
	
	public static void main(String[]args) {
		Person P1 = new Person("Eyckmans","Robbe");
		Person P2 = new Person("Eyckmans","Robbe");
		Person P3 = new Person("Eyckmans","Robbe");
		Person P4 = new Person("Eyckmans","Robbe");
		
		System.out.println(Person.count);
	}
}
