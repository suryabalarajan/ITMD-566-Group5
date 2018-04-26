package myws;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {
	public static Connection getConnection() throws Exception {
		try {

			String url = "jdbc:mysql://www.papademas.net:3306/ps?autoReconnect=true&useSSL=false";
			String username = "ps";
			String password = "ps1";
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established");

			return conn;
		}

		catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
}
