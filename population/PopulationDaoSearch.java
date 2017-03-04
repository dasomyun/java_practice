package population;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import dbUnit.ConnectionProvider;
import dbUnit.JdbcUtil;

public class PopulationDaoSearch {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private String sql = null;
	private Scanner sc = null;
	
//  ���� / ���� �� �ο���
	public void gender() {
		conn = ConnectionProvider.getConnection();

		try {
			sql = "SELECT dong, sum(mentotal), sum(womentotal), sum(total) FROM population GROUP BY dong ORDER BY dong ASC";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("��\t���հ�\t���հ�\t�Ѱ�");

			while(rs.next()) {			
				System.out.print(rs.getInt("dong") + "\t");
				System.out.print(rs.getInt("sum(mentotal)") + "\t");
				System.out.print(rs.getInt("sum(womentotal)") + "\t");
				System.out.print(rs.getInt("sum(total)") + "\n");
			}
			
		} catch(Exception e) {
			System.out.println("������� ����");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);	
		}
	}
	 
	// ���ɴ뺰 ��/�� �ο��� 	
	public void age() {
		conn = ConnectionProvider.getConnection();

		try {
			sql = "SELECT dong , sum(menchild), sum(womenchild) , sum(menteen) , sum(womenteen), sum(menadult), sum(womenadult) , sum(menmid) , sum(womenmid), sum(menmidold) , sum(womenmidold) , sum(menold) , sum(womenold) FROM population GROUP BY dong ORDER BY dong ASC";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			System.out.println("|��\t|0~9��\t|0~9��\t|10-19��\t|10-19��\t|20-39��\t|20-39��\t|40-59��\t|40-59��\t|60-79��\t|60-79��\t|80���̻�\t|80���̻�");
			System.out.println("|\t|����\t|����\t|����\t|����\t|����\t|����\t|����\t|����\t|����\t|����\t|����\t|����");
			System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������������������");
			while(rs.next()) {
				System.out.print("|"+rs.getInt("dong") + "\t|");
				System.out.print(rs.getInt("sum(menchild)") + "\t|");
				System.out.print(rs.getInt("sum(womenchild)") + "\t|");
				System.out.print(rs.getInt("sum(menteen)") + "\t|");
				System.out.print(rs.getInt("sum(womenteen)") + "\t|");
				System.out.print(rs.getInt("sum(menadult)") + "\t|");
				System.out.print(rs.getInt("sum(womenadult)") + "\t|");
				System.out.print(rs.getInt("sum(menmid)") + "\t|");
				System.out.print(rs.getInt("sum(womenmid)") + "\t|");
				System.out.print(rs.getInt("sum(menmidold)") + "\t|");
				System.out.print(rs.getInt("sum(womenmidold)") + "\t|");
				System.out.print(rs.getInt("sum(menold)") + "\t|");
				System.out.print(rs.getInt("sum(womenold)") + "\n");	
			}
			System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������������������");
		} catch(Exception e) {
			System.out.println("������� ����");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);	
		}
	}

	public void genderSet(String str1 , String str2) throws SQLException {
		System.out.println("��\t" + str1);
		while(rs.next()){
			System.out.print(rs.getInt("dong") + "\t");
			System.out.print(rs.getInt("sum("+ str2 + ")") + "\n");
		}
	}
	
	// �� ���� ���ɴ뺰 ��/�� �ο��� �˻��Ͽ� ���� 
	public void selectGender() {
		conn = ConnectionProvider.getConnection();
		sc = new Scanner(System.in);
		
		try {
			System.out.println("�˻��� ���ɰ� ������ �����ϼ���");
			System.out.print("1.0~9�� | 2.10-19�� | 3.20-39�� | 4.40-59�� | 5.60-79�� | 6.80��-�̻� >> ");
			int choice = sc.nextInt();
		
			System.out.print("1.����(��) | 2.����(��) >>");
			int gender = sc.nextInt();			
						
			if(gender == 1) { // ������ �������� ��
				switch(choice){
				case 1:
					String sql11 = "SELECT dong , sum(menchild) from population GROUP BY dong ORDER BY dong ASC";
					pstmt = conn.prepareStatement(sql11);
					rs = pstmt.executeQuery();
					genderSet("0~9����","menchild");
					break;
				case 2:
					String sql12 = "SELECT dong , sum(menteen) from population GROUP BY dong ORDER BY dong ASC";
					pstmt = conn.prepareStatement(sql12);
					rs = pstmt.executeQuery();
					genderSet("0~9����","menteen");
					break;
				case 3:
					String sql13 = "SELECT dong , sum(menadult) from population GROUP BY dong ORDER BY dong ASC";
					pstmt = conn.prepareStatement(sql13);
					rs = pstmt.executeQuery();
					genderSet("20-39�� ��","menadult");
					break;
				case 4:
					String sql14 = "SELECT dong , sum(menmid) from population GROUP BY dong ORDER BY dong ASC";
					pstmt = conn.prepareStatement(sql14);
					rs = pstmt.executeQuery();
					genderSet("40-59�� ��","menmid");
					break;
				case 5:
					String sql15 = "SELECT dong , sum(menmidold) from population GROUP BY dong ORDER BY dong ASC";
					pstmt = conn.prepareStatement(sql15);
					rs = pstmt.executeQuery();
					genderSet("60-79�� ��","menmidold");
					break;
				case 6:
					String sql16 = "SELECT dong , sum(menold) from population GROUP BY dong ORDER BY dong ASC";
					pstmt = conn.prepareStatement(sql16);
					rs = pstmt.executeQuery();
					genderSet("80��-�̻�","menold");
					break;			
				}
					
			} else if( gender == 2) { // ������ �������� ��
				switch(choice){
					case 1:
						String sql21 = "SELECT dong , sum(womenchild) from population GROUP BY dong ORDER BY dong ASC";
						pstmt = conn.prepareStatement(sql21);
						rs = pstmt.executeQuery();	
						genderSet("0~9�� ��","womenchild");
						break;
					case 2:
						String sql22 = "SELECT dong , sum(womenteen) from population GROUP BY dong ORDER BY dong ASC";
						pstmt = conn.prepareStatement(sql22);
						rs = pstmt.executeQuery();
						genderSet("10-19�� ��","womenteen");
						break;
					case 3:
						String sql23 = "SELECT dong , sum(womenadult) from population GROUP BY dong ORDER BY dong ASC";
						pstmt = conn.prepareStatement(sql23);
						rs = pstmt.executeQuery();
						genderSet("20-39�� ��","womenadult");
						break;
					case 4:
						String sql24 = "SELECT dong , sum(womenmid) from population GROUP BY dong ORDER BY dong ASC";
						pstmt = conn.prepareStatement(sql24);
						rs = pstmt.executeQuery();
						genderSet("40-59�� ��","womenmid");
						break;
					case 5:
						String sql25 = "SELECT dong , sum(womenmidold) from population GROUP BY dong ORDER BY dong ASC";
						pstmt = conn.prepareStatement(sql25);
						rs = pstmt.executeQuery();
						genderSet("60-79�� ��","womenmidold");
						break;
					case 6:
						String sql26 = "SELECT dong , sum(womenold) from population GROUP BY dong asc";
						pstmt = conn.prepareStatement(sql26);
						rs = pstmt.executeQuery();
						genderSet("80��-�̻�","womenold");
						break;				
				}
			}	
		}catch(Exception e){
			System.out.println("���� Error");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	
	}
	
	// ������ ���� ���� ���� �ο����� �����ϴ� ����
	public void most() {
		conn = ConnectionProvider.getConnection();
		
		try {
			sql = "SELECT p.dong as dong, p.ho as ho, d.dongmax as max FROM population p, (SELECT dong, MAX(total) as dongmax FROM population GROUP BY dong) d WHERE p.dong=d.dong AND p.total=dongmax";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("|��\t|ȣ\t|���帹���ο���|");
			
			while(rs.next()) {
				System.out.print("|"+rs.getInt("dong") + "\t|");
				System.out.print("|"+rs.getInt("ho") + "\t|");
				System.out.print("|"+rs.getInt("max")+ "\t|" +"\n");	
			}
		}catch(Exception e){
			System.out.println("���� Error");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
		
	}
	
	// 1�� ������  - ��, ��, ��+��
	public void alone() {
		conn = ConnectionProvider.getConnection();
		
		sc = new Scanner(System.in);
		System.out.print("�˻��� 1�� ������ ������ �Է��ϼ��� (1.�� 2.�� 3.��+��) : ");
		int gender = sc.nextInt();
		
		try {
			switch(gender){
			// Ÿ��Ʋ �ֱ� 
				case 1:
					String sql1 = "SELECT dong, ho, menchild, menteen, menadult, menmid, menmidold , menold FROM population WHERE mentotal=1 and womentotal=0";
					pstmt = conn.prepareStatement(sql1);
					rs = pstmt.executeQuery();
					System.out.println("|��\t|ȣ\t|0-9����\t|10-19����\t|20-39����\t|40-59����\t|60-79����\t|80���̻�|");
					
					while(rs.next()){
						System.out.print("|"+rs.getInt("dong") + "\t");
						System.out.print("|"+rs.getInt("ho") + "\t");
						System.out.print("|"+rs.getInt("menchild") + "\t");
						System.out.print("|"+rs.getInt("menteen") + "\t");
						System.out.print("|"+rs.getInt("menadult") + "\t");
						System.out.print("|"+rs.getInt("menmid") + "\t");
						System.out.print("|"+rs.getInt("menmidold") + "\t");
						System.out.print("|"+rs.getInt("menold") + "\t" +"\n");
					}
					break;
					
				case 2:
					String sql2 = "SELECT dong, ho, womenchild, womenteen, womenadult, womenmid, womenmidold , womenold FROM population WHERE womentotal=1 and mentotal=0";
					pstmt = conn.prepareStatement(sql2);
					rs = pstmt.executeQuery();
					System.out.println("|��\t|ȣ\t|0-9��\t|10-19��\t|20-39��\t|40-59��\t|60-79��\t|80���̻�");
					
					while(rs.next()){
						System.out.print(rs.getInt("dong") + "\t");
						System.out.print(rs.getInt("ho") + "\t");
						System.out.print(rs.getInt("womenchild") + "\t");
						System.out.print(rs.getInt("womenteen") + "\t");
						System.out.print(rs.getInt("womenadult") + "\t");
						System.out.print(rs.getInt("womenmid") + "\t");
						System.out.print(rs.getInt("womenmidold") + "\t");
						System.out.print(rs.getInt("womenold") +"\n");
					}
					break;
				case 3:
					String sql3 = "SELECT dong, ho, menchild, womenchild, menteen, womenteen, menadult, womenadult, menmid, womenmid, menmidold , womenmidold, menold ,womenold FROM population  WHERE total=1";					
					pstmt = conn.prepareStatement(sql3);
					rs = pstmt.executeQuery();
					System.out.println("��\tȣ\t0-9����\t0-9����\t10-19����\t10-19����\t20-39����\t20-39����\t40-59����\t40-59����\t60-79����\t60-79����\t80���̻�\t80���̻�");
					
					while(rs.next()){
						System.out.print(rs.getInt("dong") + "\t");
						System.out.print(rs.getInt("ho") + "\t");
						System.out.print(rs.getInt("menchild") + "\t");
						System.out.print(rs.getInt("womenchild") + "\t");
						System.out.print(rs.getInt("menteen") + "\t");
						System.out.print(rs.getInt("womenteen") + "\t");
						System.out.print(rs.getInt("menadult") + "\t");
						System.out.print(rs.getInt("womenadult") + "\t");
						System.out.print(rs.getInt("menmid") + "\t");
						System.out.print(rs.getInt("womenmid") + "\t");
						System.out.print(rs.getInt("menmidold") + "\t");
						System.out.print(rs.getInt("womenmidold") + "\t");
						System.out.print(rs.getInt("menold") +"\t");
						System.out.print(rs.getInt("womenold") +"\n");
					}
					break;
			}
		} catch(Exception e){
			System.out.println("alone() Error");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}
	
	// ���� ��� �ο��� 
	public void average() {
		conn = ConnectionProvider.getConnection();	
		try {
			sql = "SELECT dong, round(avg(total)) FROM population GROUP BY dong";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("��\t����ο���");
			
			while(rs.next()){
				System.out.print(rs.getInt("dong") + "\t");
				System.out.print(rs.getInt("round(avg(total))") + "\n");
			}
			
		} catch(Exception e){
			System.out.println("average() Error");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}
	
	// �ƹ��� �Ȼ�� �� 
	public void nobody() {
		conn = ConnectionProvider.getConnection();
		
		try {
			sql = "SELECT dong, ho FROM population WHERE total=0";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("��\tȣ");
			
			while(rs.next()) {
				System.out.print(rs.getInt("dong") + "\t");
				System.out.print(rs.getInt("ho") + "\n");
			}
		
		} catch(Exception e){
			System.out.println("average() Error");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}
}
