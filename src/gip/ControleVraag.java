package gip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ControleVraag {

	Connection con;
	int score = 0;
	
	public ControleVraag() {
		try {
			con = DriverManager.getConnection("jdbc:sqlite:D:\\School\\School 2019-2020\\OOP\\Oefeningen\\OefeningenJava\\OefeningenJava\\src\\gip\\databasePimPamPet.db");
		} catch (Exception e) {
			System.out.println("Error connecting to database");
		}
	}
	
	public boolean checkAntwoord(String antwoord,String letter) {
		if (antwoord.toLowerCase().toCharArray()[0]== letter.toLowerCase().toCharArray()[0]) {
			try {
				PreparedStatement ps = con.prepareStatement("SELECT * FROM oplossingen WHERE oplossing LIKE ?");
				ps.setString(1, antwoord + "%");
				ps.execute();
				ResultSet resultset = ps.getResultSet();
				if (resultset.getFetchSize() > 0) {
					score++;
					System.out.println("juist");
					return true;
				}
				else {
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
