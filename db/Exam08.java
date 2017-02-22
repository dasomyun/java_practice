package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 22.
 * @내용 : 날짜 입력하기 
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

			System.out.print("이름: ");
			String irum = sc.next();
			
			System.out.print("전화번호: ");
			String phone = sc.next();
			
			System.out.print("주민번호: ");
			String jumin = sc.next();
			
			System.out.print("거주지: ");
			String city = sc.next();
			
			System.out.print("생년월일: ");
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
			if(check > 0) System.out.println("삽입되었습니다");
			
			
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
