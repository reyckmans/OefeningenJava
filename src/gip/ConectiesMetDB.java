package gip;

import java.sql.DriverManager;
/**
 * 
 * dit is mijn klasse die er voor zorgt dat mijn SQL datebase geconecteerd staat met mijn spel, zodat ik de vragen en voorspelde antwoorden waarmee men verbeter uit mijn lijst kan halen en mee kan werken.
 * 
 * 
 * 
 * 
 */

public class ConectiesMetDB {
	
	public ConectiesMetDB con = new ConectiesMetDB();
	
	public ConectiesMetDB() {
		try {
			con = (ConectiesMetDB) DriverManager.getConnection("jdbc:sqlite:databasePimPamPet.db");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error connecting to database");
		}
	}
}
