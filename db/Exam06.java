package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 22.
 * @���� : DML - DELETE ( update�� ���������� ���� select���� �̿��� �������� ���翩�θ� Ȯ�� �� ���� )
 */

public class Exam06 {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select ���� ��� 
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
			System.out.print("��ȣ: ");
			int bunho = sc.nextInt();
			
			String sql = "select * from abc where bunho = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bunho);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
//				System.out.println("����Ű:");
//				float ki = sc.nextFloat();
				String sqlDel = "delete from abc where bunho=?";
				pstmt = conn.prepareStatement(sqlDel);
				pstmt.setInt(1,bunho);
				
				int check = pstmt.executeUpdate();
				
				if(check > 0) System.out.println("������Ʈ ����");
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
