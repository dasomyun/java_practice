package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 21.
 * @내용 : select 문을 실행하여 콘솔에 검색 결과 출력 1 
 */

public class Exam02 {
	public static void main(String[] args) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(ClassNotFoundException e) {
			System.out.println("OracleDriver Error");
			e.printStackTrace();
		}
		
		try{
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "java";
			String pass = "1234";
			conn = DriverManager.getConnection(url, id, pass);	
		} catch(SQLException e) {
			System.out.println("Connection Error");
		}
		
		try {
			pstmt = conn.prepareStatement ("select * from abc");
			rs = pstmt.executeQuery(); // 실행
			
			while(rs.next()) {  // next() 커서 위치
				int bunho = rs.getInt("bunho"); 	// 자료형 변환 (number -> int)
				String irum = rs.getString("irum");
				float ki = rs.getFloat("ki");
				System.out.println(bunho + "\t" + irum + "\t" + ki + "\t");
			}
			
		} catch(SQLException e) {
			System.out.println("SQL Error");
			e.printStackTrace();
		} finally {
			try{
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close(); 	// connection 먼저 끊지 말기
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
