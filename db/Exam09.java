package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class Exam09 {
	public static void main(String[] args) {
	
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");			
		} catch(ClassNotFoundException e){
			System.out.println("Driver error");
			e.printStackTrace();
		}
		
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "java";
			String pass = "1234";
			conn = DriverManager.getConnection(url, id, pass);
			
		} catch(SQLException e){
			System.out.println("Connection error");
			e.printStackTrace();
		}
		
		
		try {
			String sql = "select* from person";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int num = rs.getInt("num");
				String irum = rs.getString("irum");
				String phone = rs.getString("phone");
				String jumin = rs.getString("jumin");
				String city = rs.getString("city");
				Date birthday = rs.getDate("birthday");
				System.out.println(num + "\t" + irum + "\t" + phone + "\t" + jumin + "\t" + city + "\t" + birthday.toString());
			}
			
		} catch(Exception e) {
			
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();				
				if(sc != null) sc.close();		
			} catch(Exception e) {
				e.printStackTrace();
			}
	}
	}
}
