package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 21.
 * @내용 : select 문을 실행하여 콘솔에 검색 결과 출력 2
 */

public class Exam03 {
	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
				
		} catch(ClassNotFoundException e){
			System.out.println("Driver Error");
			e.printStackTrace();
		}
		
		try{
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pass = "1234";
			
			conn = DriverManager.getConnection(url, id, pass);
				
		} catch(SQLException e) {
			System.out.println("Connection Error");
			e.printStackTrace();
		}
		
		try {
			String sql = "select employee_id , first_name , last_name from employees";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				int employee_id = rs.getInt("employee_id");
				String first_name = rs.getString("first_name");
				String last_name = rs.getString("last_name");
				
				System.out.println(employee_id +"\t" + first_name + "\t" + last_name);
			}
			
		} catch(Exception e) {
			System.out.println("SQL Error");
			e.printStackTrace();
		}
		
	}
}
