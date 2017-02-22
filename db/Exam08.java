package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 22.
 * @���� : ��¥ �Է��ϱ� 
 */

public class Exam08 {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = null;

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
			sc = new Scanner(System.in);

			System.out.print("�̸�: ");
			String irum = sc.next();
			
			System.out.print("��ȭ��ȣ: ");
			String phone = sc.next();
			
			System.out.print("�ֹι�ȣ: ");
			String jumin = sc.next();
			
			System.out.print("������: ");
			String city = sc.next();
			
			System.out.print("�������: ");
			String birth = sc.next();
			
			String sql = "insert into person values(person_num_seq.nextval,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,  irum);
			pstmt.setString(2, phone);
			pstmt.setString(3, jumin);
			pstmt.setString(4, city);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date dateBirth = sdf.parse(birth);
			pstmt.setDate(5,new java.sql.Date(dateBirth.getTime()));
			
			int check = pstmt.executeUpdate();
			if(check > 0) System.out.println("���ԵǾ����ϴ�");
			
			
		} catch(Exception e) {
			System.out.println("SQL error");
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();		
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
