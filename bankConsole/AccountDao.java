package bankConsole;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import dbUnit.ConnectionPorvider;
import dbUnit.JdbcUtil;

public class AccountDao {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private String sql = null;
	
	private AccountDto account = null;
	private Scanner sc = null;
	
	public void printMenu() {
		System.out.println("Menu----------");
		System.out.println("1. 계좌개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 잔액조회");
		System.out.println("5. 전체출력");
		System.out.println("6. 종료");
	}
	
	public void makeAccount() {
		
		sc = new Scanner(System.in);
		account = new AccountDto();
		
		System.out.print("계좌번호:");
		account.setId(sc.next());
		
		System.out.print("이름:");
		account.setName(sc.next());
		
		System.out.print("입금액");
		account.setBalance(sc.nextLong());
		
	
		try {
			conn = ConnectionPorvider.getConnection();	
			sql = "insert into bank values(bank_num_sql.nextval,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, account.getId());
			pstmt.setString(2, account.getName());
			pstmt.setLong(3, account.getBalance());
			
			int check = pstmt.executeUpdate();		
			if(check > 0) System.out.println("계좌가 개설되었습니다\n");
			
		} catch(SQLException e) {
			System.out.println("계좌 개설 에러 발생");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}
		
}
