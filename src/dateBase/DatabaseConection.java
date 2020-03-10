package dateBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConection {

	Connection con;

	public static void main(String[] args) {
		/* 1. verbinding leggen met database */
		try {
			DatabaseConection dbc = new DatabaseConection();

			dbc.con = DriverManager.getConnection(
					"jdbc:sqlite:C:\\Users\\Robbe Eyckmans\\AppData\\Roaming\\DBeaverData\\workspace6\\.metadata\\sample-database-sqlite-1\\Chinook.db");
			
			ResultSet result = dbc.statmentUitvoeren();
			
			dbc.printresultaat(result);
			
		} catch (Exception e) {
			
		}
	}
	
	/* 2. een sql query uitvoeren */
	public ResultSet statmentUitvoeren() {
		try {
			Statement st = con.createStatement();
			st.execute("SELECT * FROM Artist");
			return st.getResultSet();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/* 4 resultaat van de sql query tonen */
	public void printresultaat(ResultSet result) throws SQLException {
		while (result.next()) {
			System.out.println(result.getString("name"));
		}
	}
	
}
