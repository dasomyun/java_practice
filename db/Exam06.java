package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 22.
 * @내용 : DML - DELETE ( update와 마찬가지로 먼저 select문을 이용해 데이터의 존재여부를 확인 후 삭제 )
 */

public class Exam06 {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select 쓸때 사용 
		Scanner sc = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch(ClassNotFoundException e) {
			System.out.println("driver error");
			e.printStackTrace();
		}
		
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "java";
			String pass = "1234";
			
			conn = DriverManager.getConnection(url, id, pass);
			
		} catch(SQLException e) {
			System.out.println("Connection error");
			e.printStackTrace();
		}
		
		try {
			sc = new Scanner(System.in);
			System.out.print("번호: ");
			int bunho = sc.nextInt();
			
			String sql = "select * from abc where bunho = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bunho);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
//				System.out.println("지울키:");
//				float ki = sc.nextFloat();
				String sqlDel = "delete from abc where bunho=?";
				pstmt = conn.prepareStatement(sqlDel);
				pstmt.setInt(1,bunho);
				
				int check = pstmt.executeUpdate();
				
				if(check > 0) System.out.println("업데이트 성공");
			}
			
		} catch(Exception e) {
			System.out.println("SQL error");
			e.printStackTrace();
		} finally {
			try {
				if(sc != null) sc.close();
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch(Exception e){
				System.out.println("SQL error");
				e.printStackTrace();
			}
			
		}
		
	}
}
