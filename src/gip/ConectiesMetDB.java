package gip;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
*
* This class ensures that my SQL datebase is connected to my game, so that I can get the questions and predicted answers to improve my list and work with them.
* First of all my method is named, it will be named "Con".
* Later in the code you will see on line 27 that the reference is made to the paht of my Database. This is necessary otherwise the Database cannot be used. This is in a Try / Catch (further explanation can be found in the class "RandomV").
* The code in line 34 is entirely is written to get the correct information from the DataBase.
* The main event takes place on line 37, here the literal code is written with which the solutions will be retrieved from the DataBase. This looks like "SELECT * FROM solutions WHERE solution LIKE?".
* All this will be placed in a Try / Catch again.
* The ResultSet is also essential, with this operation I�m going to check the result that one gets from the database if it is the right one that is needed.
* One must also get a "Return" here. A "Return" allows you to see that they are going to take something out of the concept / code before doing an operation or something else with it and then putting it back into the code.
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
	
	public List<String> retrieveQuestionsFromDB(){
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("SELECT * FROM Vragen");
			ps.execute();
			ResultSet resultset = ps.getResultSet();
			List<String> resultlist = new ArrayList<String>();
			while (resultset.next()) {
				resultlist.add(resultset.getString("vraag"));
			}
			return resultlist;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public boolean retrieveFromDB(String antwoordGebruiker) {
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("SELECT * FROM oplossingen WHERE lower(oplossing) LIKE lower(?)");
			ps.setString(1, antwoordGebruiker);
			ps.execute();
			ResultSet resultset = ps.getResultSet();
			return resultset.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	List<String> retrieveLettersFromDB(int idvraag){
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("SELECT DISTINCT SUBSTRING(oplossing, 1, 1) FROM oplossingen WHERE FK = '1'");
			ps.execute();
			ResultSet resultset = ps.getResultSet();
			List<String> resultlist = new ArrayList<String>();
			while (resultset.next()) {
				resultlist.add(resultset.getString("letter"));
			}
			return resultlist;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
//	public static void main(String[] args) {
//		ConectiesMetDB c = new ConectiesMetDB();
//		boolean retrieveFromDB = c.retrieveFromDB("bas");
//	
	//System.out.println(retrieveFromDB);
//	}
}
