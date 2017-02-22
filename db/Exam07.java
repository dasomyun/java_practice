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
 * @���� : SEQUENCE
 */

public class Exam07 {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = null;
		String sql = null;

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
	
		while(true) {
			sc = new Scanner(System.in);
			System.out.print("1.ģ���߰�  2.�̸����� �˻�  3.��ȭ��ȣ ����  4.����  5.��ü���  6.���� : ");
			
			int choice = sc.nextInt();
			
			if(choice == 1) { 			// ģ���߰�
				System.out.print("�̸� ");
				String name = sc.next();
				
				System.out.print("��ȭ��ȣ: ");
				String phone = sc.next();
				
				sql = "insert into friend values(friend_num_seq.nextval, ? , ?)";
				
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, name);
					pstmt.setString(2, phone);
					int check = pstmt.executeUpdate();
					if(check > 0) System.out.println("��ȭ��ȣ ����� �Ϸ�Ǿ����ϴ�");
					
				} catch(SQLException e) {
					System.out.println("Insert error");
					e.printStackTrace();
				} finally {
					try {
						if(pstmt != null) pstmt.close();	
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
				
			} else if(choice == 2) { 	// �̸����� �˻�
				
				System.out.print("�̸� �Է� : ");
				String SearchName = sc.next();
				String sql2 = "select * from friend where irum=?";
				
				try {
					pstmt = conn.prepareStatement(sql2);
					pstmt.setString(1, SearchName);
					
					rs = pstmt.executeQuery();
					
					if(rs.next()) {
						do{
						int num = rs.getInt("num");
						String irum = rs.getString("irum");
						String phone = rs.getString("phone");
						System.out.println(num + "\t" + irum + "\t" + phone);
						} while(rs.next());
					} else {
						System.out.println("ģ�� �̸��� �������� �ʽ��ϴ�");
					}
				} catch(SQLException e) {
					e.printStackTrace();
				}
				
			} else if(choice == 3) {	// ��ȭ��ȣ ����
				
				System.out.print("�̸� �Է� : ");
				String SearchName = sc.next();
				String sql3 = "select * from friend where irum=?";
				
				try {
					pstmt = conn.prepareStatement(sql3);
					pstmt.setString(1, SearchName);
					rs = pstmt.executeQuery();
			
					if(rs.next()){
						System.out.print("������ ��ȣ�� �Է� : ");
						String changePhone = sc.next();
						
						String sql4 = "update friend set  phone=? where irum =?";
						pstmt = conn.prepareStatement(sql4);
						pstmt.setString(1, changePhone);
						pstmt.setString(2, SearchName);
						
						int check = pstmt.executeUpdate();
						if(check > 0 ) System.out.println("����Ǿ����ϴ�");
					}
						
				} catch(Exception e) {
					e.printStackTrace();
				} finally { 
					try {
						if(pstmt != null) pstmt.close();
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
				
			} else if(choice == 4) {	// ����
				System.out.print("�̸� �Է� : ");
				String SearchName = sc.next();
				String sql3 = "select * from friend where irum=?";
				
				try {
					pstmt = conn.prepareStatement(sql3);
					pstmt.setString(1, SearchName);
					rs = pstmt.executeQuery();
			
					if(rs.next()){
						
						String sql5 = "delete from friend where irum=?";
						pstmt = conn.prepareStatement(sql5);
						pstmt.setString(1, SearchName);
						
						int check = pstmt.executeUpdate();
						if(check > 0 ) System.out.println("�����Ǿ����ϴ�");
					}
						
				} catch(Exception e) {
					e.printStackTrace();
				} finally { 
					try {
						if(pstmt != null) pstmt.close();
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
			} else if(choice == 5) { 	// ��ü���
				sql = "SELECT * FROM friend ORDER BY num ASC";	  

				try {
					pstmt = conn.prepareStatement(sql);
					rs = pstmt.executeQuery();
					
					while(rs.next()) {
						int number = rs.getInt("num");
						String irum = rs.getString("irum");
						String phone = rs.getString("phone");
						System.out.println(number + "\t" + irum + "\t" + phone);		
					}
					
				} catch(SQLException e) {
					System.out.println("Select All Error");
					e.printStackTrace();					
				} finally {
					try {
						if(pstmt != null) pstmt.close();
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
				
			} else if(choice == 6) { 	// ���� 
				try {
					if(sc != null) sc.close();
					if(conn != null) conn.close();					
				} catch(SQLException e) {
					e.printStackTrace();
				}
				System.out.println("�����մϴ�");
				return;
			} else {
				System.out.println("�߸� �Է� �ϼ̽��ϴ�");
			}
			
		}
		
	}
}
