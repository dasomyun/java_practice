package db;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 21.
 * @���� : DB ���� 
 * 
 * 	������- java - �����н� - user Libraries �� import 
 *	java project���� �����н�- add library - user library �� ���� 
 *
 *	oracle.jdbc.driver�� oracleDriver - copyofquarifyed~~ ���� 
 *
 */

public class Exam01 {
	public static void main(String[] args) {
		
		// 1�ܰ� : ������ ���̽� ���� 
		// ��� : C:\oraclexe\app\oracle\product\10.2.0\server\jdbc\lib
		
		// ����Ŭ ������ X��ư���� ������ ���� ( �ڹ� �� ���� ) 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("OK");
			
		} catch(ClassNotFoundException e) {
			System.out.println("������ ���̽� ���� ����");
			e.printStackTrace();
		}
		
		// 2�ܰ� : ������ �����ϴ� ��ü ����
		
		String url = "jdbc:oracle:thin:@211.63.89.103:1521:xe";
		String id = "hr";
		String pass = "1234";
		
		try {
			DriverManager.getConnection(url, id, pass);	
			System.out.println("OK");
			
		} catch(SQLException e) {
			System.out.println("������ ���̽� ���� ����");
			e.printStackTrace();
		}
		
		// 3�ܰ� : �۾� ���� - PreparedStatement
		// 4�ܰ� : ��� ó�� - ResultSet
		// 5�ܰ� : ���� - close
		
	}
}
