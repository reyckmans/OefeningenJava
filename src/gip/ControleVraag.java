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
	
	ConectiesMetDB connectiesMetDB = new ConectiesMetDB();
	
	public boolean checkAntwoord(String antwoord,String letter) {
		if (antwoord.toLowerCase().toCharArray()[0]== letter.toLowerCase().toCharArray()[0]) {
				if (connectiesMetDB.retrieveFromDB(antwoord)) {
					score++;
					System.out.println("juist");
					return true;
				}
				else {
					System.out.println("fout");
					return false;
				}
			}
		return false;
	}
	
	public static void main(String[] args) {
		ControleVraag controle = new ControleVraag();
		System.out.println(controle.checkAntwoord("mazda", "m"));
	}
}
