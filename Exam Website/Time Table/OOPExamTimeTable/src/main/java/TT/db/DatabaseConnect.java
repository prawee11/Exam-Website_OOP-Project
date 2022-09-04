package TT.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnect {
	
	private static String url = "jdbc:mysql://localhost:3306/timetable";
	private static String username = "root";
	private static String password = "Praweena";
	private static Connection tt;
	
	public static Connection getConnection() {
	try {
	Class.forName("com.mysql.jdbc.Driver");
	
	System.out.println("Well Done...Database Connection successful!");
	
	tt = DriverManager.getConnection(url, username, password);
	
	}catch(Exception e) {
	System.out.println("Database Connection Unsuccessful!!!");
	e.printStackTrace();
	}
	return tt;
	}
	}


