package session7.tamrin1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadFromDB {
	
	private static final String URL = "jdbc:h2:tcp://localhost:9092/~/testdb";
	private static final String USER = "sa";
	private static final String PASSWORD = "";
	private static final String SQL = """
			                          SELECT DEPARTMENT_NAME, COUNTRY_NAME
			                          FROM  DEPARTMENTS, COUNTRIES
			                          WHERE COUNTRY_NAME =? and REGION_ID=LOCATION_ID
			                          """;

	public static void main(String[] args) throws SQLException {
		
		String country = "USA";
		
		try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
		PreparedStatement pState = connection.prepareStatement(SQL);){
			System.out.println("Connected to the H2 database successfully");
			
			pState.setString(1, country);
			
			try(ResultSet result = pState.executeQuery();){
				
				while(result.next()) {
					String DEPARTMENT_NAME = result.getString("DEPARTMENT_NAME");
					String COUNTRY_NAME = result.getString("COUNTRY_NAME");
					System.out.println("DEPARTMENT_NAME: " + DEPARTMENT_NAME + ", COUNTRY_NAME: " + COUNTRY_NAME);
			    }
			}
	    }
	} 
}
