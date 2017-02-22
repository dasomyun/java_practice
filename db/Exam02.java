package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 21.
 * @���� : select ���� �����Ͽ� �ֿܼ� �˻� ��� ��� 1 
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
			rs = pstmt.executeQuery(); // ����
			
			while(rs.next()) {  // next() Ŀ�� ��ġ
				int bunho = rs.getInt("bunho"); 	// �ڷ��� ��ȯ (number -> int)
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
				if(conn != null) conn.close(); 	// connection ���� ���� ����
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
