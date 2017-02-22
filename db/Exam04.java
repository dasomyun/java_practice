package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 22.
 * @내용 : DML - INSERT - Scanner 로 입력받아 insert문을 사용하여 테이블에 컬럼 추가
 */

public class Exam04 {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = null;
		
		// 1단계 : 드라이브 (JDBC)로 데이터베이스 연결 - 동적 객체 생성 
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 클래스화
		
		} catch(ClassNotFoundException e) {
			System.out.println("Driver Error");
			e.printStackTrace();
		}
		
		// 2단계 : 연결관리 객체 생성 Connection
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "java";
			String pass = "1234";
			
			conn = DriverManager.getConnection(url, id, pass);
			
		} catch(SQLException e) {
			System.out.println("Connection Error");
			e.printStackTrace();	
		}
		
		// 3단계 : 작업관리 PreparedStatement
		try {
			sc = new Scanner(System.in);
			System.out.print("번호:");
			int bunho = sc.nextInt();
			
			System.out.print("이름:");
			String name = sc.next();
			
			System.out.print("키:");
			float ki = sc.nextFloat();
			
			String sql = "insert into abc values(?,?,?)"; // 무엇이 들어올지 모르니 ???로 선언 
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1,  bunho);
			pstmt.setString(2, name);
			pstmt.setFloat(3, ki);
			
			int check = pstmt.executeUpdate();  // executeUpdate()는 int형 반환 (추가된 갯수가 1이면 1반환)
			/*
			   select 문 : 테이블에 영향x -- pstmt.executeQuery();
			   insert문, delete문, update문 : 테이블에 영향o -- pstmt.executeUpdate();
			   delete문, update문 : select문을 이용해 먼저 변경, 지울 데이터가 있는지 확인후 진행 
			 */
			
			// 4단계 : 결과처리 ResultSet
			if(check > 0) {
				System.out.println("업데이트 성공");
			} else {
				System.out.println("업데이트 실패");
			}
			
		} catch(Exception e) {
			System.out.println("SQL Error");
			e.printStackTrace();
			
		} finally {
			try {
				// 5단계 : 종료 close
				if(sc != null) sc.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
