package config;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConfig {
	public DataBaseConfig() {
		// TODO Auto-generated constructor stub
	}

	public static void JDBC()throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection Connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","12345678");
		} 
		catch (Exception e) {
			// TODO: handle exception
			throw e;
		}

	}
}
