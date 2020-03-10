package staticModify;

public class Person {

	String naam;
	String voornaam;
	static int count; //static zorgt er voor dat de count bij de klasse hoort en niet bij de instanties
	
	public Person(String naam,String voornaam) {
		this.naam = naam;
		this.voornaam = voornaam;
		this.count++;
	}
}
