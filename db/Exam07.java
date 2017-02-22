package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 22.
 * @내용 : SEQUENCE
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
			System.out.print("1.친구추가  2.이름으로 검색  3.전화번호 수정  4.삭제  5.전체출력  6.종료 : ");
			
			int choice = sc.nextInt();
			
			if(choice == 1) { 			// 친구추가
				System.out.print("이름 ");
				String name = sc.next();
				
				System.out.print("전화번호: ");
				String phone = sc.next();
				
				sql = "insert into friend values(friend_num_seq.nextval, ? , ?)";
				
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, name);
					pstmt.setString(2, phone);
					int check = pstmt.executeUpdate();
					if(check > 0) System.out.println("전화번호 등록이 완료되었습니다");
					
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
				
			} else if(choice == 2) { 	// 이름으로 검색
				
				System.out.print("이름 입력 : ");
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
						System.out.println("친구 이름이 존재하지 않습니다");
					}
				} catch(SQLException e) {
					e.printStackTrace();
				}
				
			} else if(choice == 3) {	// 전화번호 수정
				
				System.out.print("이름 입력 : ");
				String SearchName = sc.next();
				String sql3 = "select * from friend where irum=?";
				
				try {
					pstmt = conn.prepareStatement(sql3);
					pstmt.setString(1, SearchName);
					rs = pstmt.executeQuery();
			
					if(rs.next()){
						System.out.print("변경할 번호를 입력 : ");
						String changePhone = sc.next();
						
						String sql4 = "update friend set  phone=? where irum =?";
						pstmt = conn.prepareStatement(sql4);
						pstmt.setString(1, changePhone);
						pstmt.setString(2, SearchName);
						
						int check = pstmt.executeUpdate();
						if(check > 0 ) System.out.println("변경되었습니다");
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
				
			} else if(choice == 4) {	// 삭제
				System.out.print("이름 입력 : ");
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
						if(check > 0 ) System.out.println("삭제되었습니다");
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
			} else if(choice == 5) { 	// 전체출력
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
				
			} else if(choice == 6) { 	// 종료 
				try {
					if(sc != null) sc.close();
					if(conn != null) conn.close();					
				} catch(SQLException e) {
					e.printStackTrace();
				}
				System.out.println("종료합니다");
				return;
			} else {
				System.out.println("잘못 입력 하셨습니다");
			}
			
		}
		
	}
}
