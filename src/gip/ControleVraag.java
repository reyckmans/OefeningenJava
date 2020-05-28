package gip;

/**
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ControleVraag {

	int score = 0;
	
	ConectiesMetDB con = new ConectiesMetDB();
	
	public boolean checkAntwoord(String antwoord,String letter) {
		if (antwoord.toLowerCase().toCharArray()[0]== letter.toLowerCase().toCharArray()[0]) {
			try {
				PreparedStatement ps = con.PrepareStatement("SELECT * FROM oplossingen WHERE oplossing LIKE ?");
				ps.setString(1, antwoord + "%");
				ps.execute();
				ResultSet resultset = ps.getResultSet();
				if (resultset.getFetchSize() > 0) {
					score++;
					System.out.println("juist");
					return true;
				}
				else {
					System.out.println("fout");
					return false;
				}
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	return false;
	}
}
