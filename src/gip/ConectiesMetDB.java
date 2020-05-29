package gip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * 
 * Dit is mijn klasse die er voor zorgt dat mijn SQL datebase geconecteerd staat met mijn spel, zodat ik de vragen en voorspelde antwoorden waarmee men verbeter uit mijn lijst kan halen en mee kan werken.
 * 
 * 
 * 
 * 
 */

public class ConectiesMetDB {
	
	public Connection con;
	
	public ConectiesMetDB() {
		try {
			con = DriverManager.getConnection("jdbc:sqlite:src/gip/databasePimPamPet.db");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error connecting to database");
		}
	}
	
	public boolean retrieveFromDB(String antwoordGebruiker) {
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("SELECT * FROM oplossingen WHERE oplossing LIKE ?");
			ps.setString(1, antwoordGebruiker + "%");
			ps.execute();
			ResultSet resultset = ps.getResultSet();
			return resultset.getFetchSize() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
