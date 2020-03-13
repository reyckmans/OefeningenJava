package swingGui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataBaseConectionOef3 {

	public List<String> artiestOpvragen(){
		//1 verbinding leggen met database
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Robbe Eyckmans\\AppData\\Roaming\\DBeaverData\\workspace6\\.metadata\\sample-database-sqlite-1\\Chinook.db");
			
			//2 een sql query uitvoeren  
			Statement statement = con.createStatement(); //statment = een uitvoering sql
			statement.execute("SELECT * FROM ARTIST");
			
			//3 resultaat van de sql query opvragen
			ResultSet resultaat = statement.getResultSet();
			
			//4 resultaat van de sql query tonen
			List<String> artistList = new ArrayList<String>();
			
			while (resultaat.next()) {
				artistList.add(resultaat.getString("Name"));
				
			}
			return artistList;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return new ArrayList<String>(0);
	}
}

