package gip;

import java.sql.DriverManager;
/**
 * 
 * 
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
