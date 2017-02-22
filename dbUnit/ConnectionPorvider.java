package dbUnit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPorvider {
	public static Connection getConnection() {
		
		Connection conn = null;
		
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "java";
			String pass = "1234";
			
			conn = DriverManager.getConnection(url, id, pass);			
		
		} catch(SQLException e) {
			System.out.println("ConnectionProvider getConnection Error");
			e.printStackTrace();
		} 
		return conn;
	}
}
