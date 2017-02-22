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
 * @���� : DML - UPDATE ( update�� select�� �����Ͱ� �ִ��� Ȯ�� �ϰ� �ؾ��Ѵ�)
 */

public class Exam05 {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = null;
		
		try {			
			Class.forName("oracle.jdbc.driver.OracleDriver");	
		
		} catch(ClassNotFoundException e) {
			System.out.println("Driver Error");
			e.printStackTrace();
		}
		
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "java";
			String pass = "1234";
			
			conn = DriverManager.getConnection(url , id , pass);
			
		} catch(SQLException e) {
			System.out.println("Connection Error");
			e.printStackTrace();
		}
		
		try {
			// update�� �����Ͱ� �ִ��� Ȯ�� -- select
			sc = new Scanner(System.in);
			System.out.print("��ȣ:");
			int bunho = sc.nextInt();
			
			String sql = "select * from abc where bunho=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bunho);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.print("��ü Ű : ");
				float ki = sc.nextFloat();
				
				String sqlUp = "update abc set ki=? where bunho = ?"; 
				pstmt = conn.prepareStatement(sqlUp); 
				pstmt.setFloat(1, ki); // ù��° ? - 1
				pstmt.setInt(2, bunho); // �ι�° ? - 2
				
				int check = pstmt.executeUpdate();
				if(check > 0) System.out.println("������Ʈ ����");
				
			} else {
				System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
			}
			
		} catch(Exception e) {
			System.out.println("SQL Error");
			e.printStackTrace();
		} finally {
			try {
				if(sc != null) sc.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
				if(conn != null) conn.close();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
