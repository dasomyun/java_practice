package db;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 21.
 * @내용 : DB 연동 
 * 
 * 	윈도우- java - 빌드패스 - user Libraries 에 import 
 *	java project에서 빌드패스- add library - user library 에 지정 
 *
 *	oracle.jdbc.driver의 oracleDriver - copyofquarifyed~~ 복사 
 *
 */

public class Exam01 {
	public static void main(String[] args) {
		
		// 1단계 : 데이터 베이스 연결 
		// 경로 : C:\oraclexe\app\oracle\product\10.2.0\server\jdbc\lib
		
		// 오라클 에러는 X버튼으로 나오지 않음 ( 자바 언어만 나옴 ) 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("OK");
			
		} catch(ClassNotFoundException e) {
			System.out.println("데이터 베이스 시작 실패");
			e.printStackTrace();
		}
		
		// 2단계 : 연결을 관리하는 객체 생성
		
		String url = "jdbc:oracle:thin:@211.63.89.103:1521:xe";
		String id = "hr";
		String pass = "1234";
		
		try {
			DriverManager.getConnection(url, id, pass);	
			System.out.println("OK");
			
		} catch(SQLException e) {
			System.out.println("데이터 베이스 연결 실패");
			e.printStackTrace();
		}
		
		// 3단계 : 작업 관리 - PreparedStatement
		// 4단계 : 결과 처리 - ResultSet
		// 5단계 : 종료 - close
		
	}
}
