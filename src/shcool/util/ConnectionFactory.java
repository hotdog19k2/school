package shcool.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static final ConnectionFactory instance = new ConnectionFactory();
	
	public static Connection getInstance(){
		return instance.createConnection();
		
	}
	private ConnectionFactory(){}
	
	private Connection createConnection(){
		Connection connection = null;
		String url = "jdbc:mysql://localhost:3306/school";
		String user = "user_school";
		String password = "rootroot";
		
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("JDBC Driver 추가 혹은 url,user,password 확인");
			e.printStackTrace();
		}
		return connection; 
	}
}
