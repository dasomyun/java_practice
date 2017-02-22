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
		System.out.println("1. ���°���");
		System.out.println("2. �Ա�");
		System.out.println("3. ���");
		System.out.println("4. �ܾ���ȸ");
		System.out.println("5. ��ü���");
		System.out.println("6. ����");
	}
	
	public void makeAccount() {
		
		sc = new Scanner(System.in);
		account = new AccountDto();
		
		System.out.print("���¹�ȣ:");
		account.setId(sc.next());
		
		System.out.print("�̸�:");
		account.setName(sc.next());
		
		System.out.print("�Աݾ�");
		account.setBalance(sc.nextLong());
		
	
		try {
			conn = ConnectionPorvider.getConnection();	
			sql = "insert into bank values(bank_num_sql.nextval,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, account.getId());
			pstmt.setString(2, account.getName());
			pstmt.setLong(3, account.getBalance());
			
			int check = pstmt.executeUpdate();		
			if(check > 0) System.out.println("���°� �����Ǿ����ϴ�\n");
			
		} catch(SQLException e) {
			System.out.println("���� ���� ���� �߻�");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}
		
}
