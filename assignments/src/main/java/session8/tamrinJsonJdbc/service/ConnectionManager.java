package session8.tamrinJsonJdbc.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class ConnectionManager {

	private static final Logger log = Logger.getLogger(ConnectionManager.class.getName());
	private static Connection connection;
	 
	private ConnectionManager() {
			
	}
	
	public static Connection getConnection() {
		
		if (connection == null) {
			
			try {
				connection = DriverManager.getConnection(DBInfo.URL, DBInfo.USER, DBInfo.PASSWORD);
			} catch (SQLException e) {
				
				log.severe("Database connection Error");
				System.out.println(e);
				//throw new RuntimeException("Employee file reader error",e);
			}
			
		}
			
		return connection;
	}

} 
