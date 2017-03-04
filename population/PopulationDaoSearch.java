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
	
//  남자 / 여자 총 인원수
	public void gender() {
		conn = ConnectionProvider.getConnection();

		try {
			sql = "SELECT dong, sum(mentotal), sum(womentotal), sum(total) FROM population GROUP BY dong ORDER BY dong ASC";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("동\t남합계\t여합계\t총계");

			while(rs.next()) {			
				System.out.print(rs.getInt("dong") + "\t");
				System.out.print(rs.getInt("sum(mentotal)") + "\t");
				System.out.print(rs.getInt("sum(womentotal)") + "\t");
				System.out.print(rs.getInt("sum(total)") + "\n");
			}
			
		} catch(Exception e) {
			System.out.println("성적출력 에러");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);	
		}
	}
	 
	// 연령대별 남/여 인원수 	
	public void age() {
		conn = ConnectionProvider.getConnection();

		try {
			sql = "SELECT dong , sum(menchild), sum(womenchild) , sum(menteen) , sum(womenteen), sum(menadult), sum(womenadult) , sum(menmid) , sum(womenmid), sum(menmidold) , sum(womenmidold) , sum(menold) , sum(womenold) FROM population GROUP BY dong ORDER BY dong ASC";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			System.out.println("|동\t|0~9세\t|0~9세\t|10-19세\t|10-19세\t|20-39세\t|20-39세\t|40-59세\t|40-59세\t|60-79세\t|60-79세\t|80세이상\t|80세이상");
			System.out.println("|\t|남성\t|여성\t|남성\t|여성\t|남성\t|여성\t|남성\t|여성\t|남성\t|여성\t|남성\t|여성");
			System.out.println("￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣");
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
			System.out.println("￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣");
		} catch(Exception e) {
			System.out.println("성적출력 에러");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);	
		}
	}

	public void genderSet(String str1 , String str2) throws SQLException {
		System.out.println("동\t" + str1);
		while(rs.next()){
			System.out.print(rs.getInt("dong") + "\t");
			System.out.print(rs.getInt("sum("+ str2 + ")") + "\n");
		}
	}
	
	// 각 동의 연령대별 남/여 인원수 검색하여 추출 
	public void selectGender() {
		conn = ConnectionProvider.getConnection();
		sc = new Scanner(System.in);
		
		try {
			System.out.println("검색할 연령과 성별을 선택하세요");
			System.out.print("1.0~9세 | 2.10-19세 | 3.20-39세 | 4.40-59세 | 5.60-79세 | 6.80세-이상 >> ");
			int choice = sc.nextInt();
		
			System.out.print("1.남성(男) | 2.여성(女) >>");
			int gender = sc.nextInt();			
						
			if(gender == 1) { // 남성을 선택했을 때
				switch(choice){
				case 1:
					String sql11 = "SELECT dong , sum(menchild) from population GROUP BY dong ORDER BY dong ASC";
					pstmt = conn.prepareStatement(sql11);
					rs = pstmt.executeQuery();
					genderSet("0~9세남","menchild");
					break;
				case 2:
					String sql12 = "SELECT dong , sum(menteen) from population GROUP BY dong ORDER BY dong ASC";
					pstmt = conn.prepareStatement(sql12);
					rs = pstmt.executeQuery();
					genderSet("0~9세남","menteen");
					break;
				case 3:
					String sql13 = "SELECT dong , sum(menadult) from population GROUP BY dong ORDER BY dong ASC";
					pstmt = conn.prepareStatement(sql13);
					rs = pstmt.executeQuery();
					genderSet("20-39세 남","menadult");
					break;
				case 4:
					String sql14 = "SELECT dong , sum(menmid) from population GROUP BY dong ORDER BY dong ASC";
					pstmt = conn.prepareStatement(sql14);
					rs = pstmt.executeQuery();
					genderSet("40-59세 남","menmid");
					break;
				case 5:
					String sql15 = "SELECT dong , sum(menmidold) from population GROUP BY dong ORDER BY dong ASC";
					pstmt = conn.prepareStatement(sql15);
					rs = pstmt.executeQuery();
					genderSet("60-79세 남","menmidold");
					break;
				case 6:
					String sql16 = "SELECT dong , sum(menold) from population GROUP BY dong ORDER BY dong ASC";
					pstmt = conn.prepareStatement(sql16);
					rs = pstmt.executeQuery();
					genderSet("80세-이상","menold");
					break;			
				}
					
			} else if( gender == 2) { // 여성을 선택했을 떄
				switch(choice){
					case 1:
						String sql21 = "SELECT dong , sum(womenchild) from population GROUP BY dong ORDER BY dong ASC";
						pstmt = conn.prepareStatement(sql21);
						rs = pstmt.executeQuery();	
						genderSet("0~9세 여","womenchild");
						break;
					case 2:
						String sql22 = "SELECT dong , sum(womenteen) from population GROUP BY dong ORDER BY dong ASC";
						pstmt = conn.prepareStatement(sql22);
						rs = pstmt.executeQuery();
						genderSet("10-19세 여","womenteen");
						break;
					case 3:
						String sql23 = "SELECT dong , sum(womenadult) from population GROUP BY dong ORDER BY dong ASC";
						pstmt = conn.prepareStatement(sql23);
						rs = pstmt.executeQuery();
						genderSet("20-39세 여","womenadult");
						break;
					case 4:
						String sql24 = "SELECT dong , sum(womenmid) from population GROUP BY dong ORDER BY dong ASC";
						pstmt = conn.prepareStatement(sql24);
						rs = pstmt.executeQuery();
						genderSet("40-59세 여","womenmid");
						break;
					case 5:
						String sql25 = "SELECT dong , sum(womenmidold) from population GROUP BY dong ORDER BY dong ASC";
						pstmt = conn.prepareStatement(sql25);
						rs = pstmt.executeQuery();
						genderSet("60-79세 여","womenmidold");
						break;
					case 6:
						String sql26 = "SELECT dong , sum(womenold) from population GROUP BY dong asc";
						pstmt = conn.prepareStatement(sql26);
						rs = pstmt.executeQuery();
						genderSet("80세-이상","womenold");
						break;				
				}
			}	
		}catch(Exception e){
			System.out.println("수정 Error");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	
	}
	
	// 각각의 동의 가장 많은 인원수가 거주하는 가구
	public void most() {
		conn = ConnectionProvider.getConnection();
		
		try {
			sql = "SELECT p.dong as dong, p.ho as ho, d.dongmax as max FROM population p, (SELECT dong, MAX(total) as dongmax FROM population GROUP BY dong) d WHERE p.dong=d.dong AND p.total=dongmax";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("|동\t|호\t|가장많은인원수|");
			
			while(rs.next()) {
				System.out.print("|"+rs.getInt("dong") + "\t|");
				System.out.print("|"+rs.getInt("ho") + "\t|");
				System.out.print("|"+rs.getInt("max")+ "\t|" +"\n");	
			}
		}catch(Exception e){
			System.out.println("수정 Error");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
		
	}
	
	// 1인 가구수  - 남, 녀, 남+여
	public void alone() {
		conn = ConnectionProvider.getConnection();
		
		sc = new Scanner(System.in);
		System.out.print("검색할 1인 가구의 성별을 입력하세요 (1.남 2.여 3.남+여) : ");
		int gender = sc.nextInt();
		
		try {
			switch(gender){
			// 타이틀 넣기 
				case 1:
					String sql1 = "SELECT dong, ho, menchild, menteen, menadult, menmid, menmidold , menold FROM population WHERE mentotal=1 and womentotal=0";
					pstmt = conn.prepareStatement(sql1);
					rs = pstmt.executeQuery();
					System.out.println("|동\t|호\t|0-9세남\t|10-19세남\t|20-39세남\t|40-59세남\t|60-79세남\t|80세이상남|");
					
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
					System.out.println("|동\t|호\t|0-9세\t|10-19세\t|20-39세\t|40-59세\t|60-79세\t|80세이상");
					
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
					System.out.println("동\t호\t0-9세남\t0-9세여\t10-19세남\t10-19세여\t20-39세남\t20-39세여\t40-59세남\t40-59세여\t60-79세남\t60-79세여\t80세이상남\t80세이상여");
					
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
	
	// 동당 평균 인원수 
	public void average() {
		conn = ConnectionProvider.getConnection();	
		try {
			sql = "SELECT dong, round(avg(total)) FROM population GROUP BY dong";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("동\t평균인원수");
			
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
	
	// 아무도 안사는 집 
	public void nobody() {
		conn = ConnectionProvider.getConnection();
		
		try {
			sql = "SELECT dong, ho FROM population WHERE total=0";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("동\t호");
			
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
