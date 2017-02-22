package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 22.
 * @���� : DML - INSERT - Scanner �� �Է¹޾� insert���� ����Ͽ� ���̺� �÷� �߰�
 */

public class Exam04 {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = null;
		
		// 1�ܰ� : ����̺� (JDBC)�� �����ͺ��̽� ���� - ���� ��ü ���� 
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver"); // Ŭ����ȭ
		
		} catch(ClassNotFoundException e) {
			System.out.println("Driver Error");
			e.printStackTrace();
		}
		
		// 2�ܰ� : ������� ��ü ���� Connection
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "java";
			String pass = "1234";
			
			conn = DriverManager.getConnection(url, id, pass);
			
		} catch(SQLException e) {
			System.out.println("Connection Error");
			e.printStackTrace();	
		}
		
		// 3�ܰ� : �۾����� PreparedStatement
		try {
			sc = new Scanner(System.in);
			System.out.print("��ȣ:");
			int bunho = sc.nextInt();
			
			System.out.print("�̸�:");
			String name = sc.next();
			
			System.out.print("Ű:");
			float ki = sc.nextFloat();
			
			String sql = "insert into abc values(?,?,?)"; // ������ ������ �𸣴� ???�� ���� 
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1,  bunho);
			pstmt.setString(2, name);
			pstmt.setFloat(3, ki);
			
			int check = pstmt.executeUpdate();  // executeUpdate()�� int�� ��ȯ (�߰��� ������ 1�̸� 1��ȯ)
			/*
			   select �� : ���̺� ����x -- pstmt.executeQuery();
			   insert��, delete��, update�� : ���̺� ����o -- pstmt.executeUpdate();
			   delete��, update�� : select���� �̿��� ���� ����, ���� �����Ͱ� �ִ��� Ȯ���� ���� 
			 */
			
			// 4�ܰ� : ���ó�� ResultSet
			if(check > 0) {
				System.out.println("������Ʈ ����");
			} else {
				System.out.println("������Ʈ ����");
			}
			
		} catch(Exception e) {
			System.out.println("SQL Error");
			e.printStackTrace();
			
		} finally {
			try {
				// 5�ܰ� : ���� close
				if(sc != null) sc.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
