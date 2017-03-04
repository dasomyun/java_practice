package population;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbUnit.ConnectionProvider;
import dbUnit.JdbcUtil;

/**
 * @author : ������
 * @date : 2017. 2. 26.
 * @description : ����
 */

/**
 * @author : ������
 * @date : 2017. 2. 27.
 * @description : ����
 */

/**
 * @author : ������
 * @date : 2017. 2. 28.
 * @description : ����
 */

/**
 * @author : ������
 * @date : 2017. 3. 2.
 * @description : �޼ҵ� ���� , �ϼ�
 */
public class PopulationDaoReport {
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private PopulationDto populationDto = null;
	private String sql = null;

	public int sum(String str) throws SQLException {
		return rs.getInt("sum(men" + str +")" ) + rs.getInt("sum(women" + str +")");
	}
	
	public double avg(String str) throws SQLException {
		return Math.round((double)sum(str)/rs.getInt("sum(total)")*100);
	}

	public double menWomenAvg (String str) throws SQLException {
		return Math.round((double)rs.getInt("sum("+str+")") / rs.getInt("sum(total)")*100);
	}
	
	public double gagusuAvg (int i, int gaguIn) {
		return Math.round((double)i/gaguIn*100);
	}
	
	public double aloneAvg(int i, int alone){
		return Math.round((double)i/alone*100);
	}
	
	public void printPercent(String str , double d) {
		System.out.print(str);
		for(int i=1; i<=d/5; i++){
			System.out.print("��");
		}
		System.out.println("\t" + d + "%");
	}
	
	public void printtot(String str1 , String str2) throws SQLException {
		System.out.println(str1 + "���ڴ�  " + rs.getInt("sum(men" + str2 + ")")+ "٣, ���ڴ� " + rs.getInt("sum(women" + str2 + ")") +"٣���� �� " + sum(str2) +"٣�� �ֽ��ϴ�." );
	}

	public int getValue(String str) throws SQLException {
			return rs.getInt(str);
	}
	
	//����
	public void report(){
		conn = ConnectionProvider.getConnection();
		populationDto = new PopulationDto();
		
		try {
			//�� �ο����� ���
			sql = "select sum(menTotal) , sum(womenTotal) , sum(total) , avg(total) , sum(menChild) , sum(womenChild) ,sum(menTeen), sum(womenTeen), sum(menAdult), sum(womenAdult), sum(menMid), sum(womenMid), sum(menMidOld), sum(womenMidOld), sum(menOld), sum(womenOld) from population";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			if(rs.next()){ 
				System.out.println("�� "+rs.getInt("sum(total)") + "٣�� �����ϰ� ������, ��������� 1������ " +rs.getInt("avg(total)") + "٣�� �����ϰ� �ֽ��ϴ�.");
				System.out.println("���ڴ� "+ rs.getInt("sum(menTotal)")+"٣, ���ڴ� "+ rs.getInt("sum(womenTotal)") + "٣�� �����ϰ� �ֽ��ϴ�.");
				
				printPercent(">>����(��)   " , menWomenAvg("menTotal"));
				printPercent(">>����(��)   " , menWomenAvg("womenTotal"));	
				System.out.println();
				printtot("0-9��" , "child");
				printtot("10-19�� " , "teen");
				printtot("20-39�� " , "adult");
				printtot("40-59�� " , "mid");
				printtot("60-79�� " , "midOld");
				printtot("80�� �̻� " , "old");				
				printPercent(">>0-9��        " , avg("child"));
				printPercent(">>10-19��     " , avg("teen"));
				printPercent(">>20-39��     " , avg("adult"));
				printPercent(">>40-59��     " , avg("mid"));
				printPercent(">>60-79��     " , avg("midOld"));
				printPercent(">>80��-�̻�    " , avg("old"));
			}
				
			//�� ������ count
			int gaguSum=0;
			int gaguIn=0;
			int gaguNone=0;
			
			sql = "select count(*) from population ";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				gaguSum = rs.getInt("count(*)");
				System.out.println("\n�� ����� �� " + gaguSum +"������ �ֽ��ϴ�.");
			}
			
			//���� �����ϰ� �ִ� count
			sql = "select count(*) from population where total<>0";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				gaguIn = rs.getInt("count(*)");
				System.out.print("�� �� ���ֹ��� �ִ� ������ " + gaguIn +"����,");
			}
			//���ֹ��� 0��, �󰡱� count
			sql = "select count(*) from population where total=0";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()){
				gaguNone = rs.getInt("count(*)");
				System.out.println(" ���ֹ��� ���� �󰡱��� " + gaguNone +"������ �ֽ��ϴ�.");
			}
			
			double gaguInAvg =Math.round((double)gaguIn/gaguSum*100);
			double gaguNoneAvg =Math.round((double)gaguNone/gaguSum*100);
			
			printPercent(">>���ְ���        " , gaguInAvg);
			printPercent(">>����ְ���      " , gaguNoneAvg);
		
			int alone=0;
			int childAlone=0;
			int teenAlone=0;
			int adultAlone=0;
			int midAlone=0;
			int midOldAlone=0;
			int oldAlone=0;
			
			//�� ���ֹ��� 1�� count
			sql = "select count(*) from population where total=1";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				
				alone = rs.getInt("count(*)");
				System.out.println("\n1�ΰ����� �� " + alone + "������ �ֽ��ϴ�.");
			}
			
			sql = "select count(*) from population where total=1 and menChild + womenChild=1";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				childAlone = rs.getInt("count(*)");
				System.out.println("0-9�� ���ڰ� ȥ�� �����ϴ� " + childAlone +"������ �ֽ��ϴ�.");
			}
			
			sql = "select count(*) from population where total=1 and menChild + womenChild=1";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				teenAlone = rs.getInt("count(*)");
				System.out.println("10�� ���ڰ� ȥ�� �����ϴ� " + teenAlone +"������ �ֽ��ϴ�.");
			}
			
			sql = "select count(*) from population where total=1 and menAdult + womenAdult=1";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				adultAlone= rs.getInt("count(*)");
				System.out.println("20-30�� ���ڰ� ȥ�� �����ϴ� " + adultAlone +"������ �ֽ��ϴ�.");
			}
			
			sql = "select count(*) from population where total=1 and menMid + womenMid=1";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				midAlone = rs.getInt("count(*)");
				System.out.println("40-50�� û���� ȥ�� �����ϴ� " + midAlone +"������ �ֽ��ϴ�.");
			}
			
			sql = "select count(*) from population where total=1 and menMidOld + womenMidOld=1 ";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				midOldAlone = rs.getInt("count(*)");
				System.out.println("60-70�� �̻� ������ ȥ�� �����ϴ� " + midOldAlone +"������ �ֽ��ϴ�");
			}
			
			sql = "select count(*) from population where total=1 and menOld + womenOld=1 ";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				oldAlone = rs.getInt("count(*)");
				System.out.println("80�� �̻� ������ ȥ�� �����ϴ� " + oldAlone +"������ �ֽ��ϴ�");
			}
			
			printPercent(">>0-9��        " , aloneAvg(childAlone,alone));
			printPercent(">>10-19��     " , aloneAvg(teenAlone,alone));
			printPercent(">>20-39��     " , aloneAvg(adultAlone,alone));
			printPercent(">>40-59��     " , aloneAvg(midAlone,alone));
			printPercent(">>60-79��     " , aloneAvg(midOldAlone,alone));
			printPercent(">>80��-�̻�    " , aloneAvg(oldAlone,alone));
			
			//1�ΰ����� ��ȣ��
			System.out.println("\n80�� �̻� 1�ΰ����� ��ȣ���� �����մϴ�.");
			sql = "select dong, ho, total from population where total=1 and menOld + womenOld=1";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){//populationDto = new PopulationDto();
				populationDto.setDong(rs.getInt("dong"));
				populationDto.setHo(rs.getInt("ho"));
				populationDto.setTotal(rs.getInt("total"));
				System.out.println(">>" + populationDto.getDong() +"�� "+ populationDto.getHo() + "ȣ" );
			}
			
			System.out.println(" ");
			
			int couple = 0;
			int three = 0;
			int four = 0;
			int five = 0;
			int six = 0;
			
			System.out.println("1���� �����ϴ� �������� " + alone +"���� �Դϴ�.");
			
			sql = "select count(*) from population where total=2 ";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				couple = rs.getInt("count(*)");
				System.out.println("2���� �����ϴ� �������� " + couple +"���� �Դϴ�.");
			}
			
			sql = "select count(*) from population where total=3";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				three = rs.getInt("count(*)");
				System.out.println("3���� �����ϴ� �������� " + three +"���� �Դϴ�.");
			}
			
			sql = "select count(*) from population where total=4";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				four = rs.getInt("count(*)");
				System.out.println("4���� �����ϴ� �������� " + four + "���� �Դϴ�.");
			}
			
			sql = "select count(*) from population where total=5";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				five = rs.getInt("count(*)");
				System.out.println("5���� �����ϴ� �������� " + five + "���� �Դϴ�.");
			}
			
			sql = "select count(*) from population where total=5 ";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				six = rs.getInt("count(*)");
				System.out.println("6�� �̻� �����ϴ� �������� " + six + "���� �Դϴ�.");
			}
		
			printPercent(">>1�ΰ���       " , gagusuAvg(alone,gaguIn));
			printPercent(">>2�ΰ���       " , gagusuAvg(couple,gaguIn));
			printPercent(">>3�ΰ���       " , gagusuAvg(three,gaguIn));
			printPercent(">>4�ΰ���       " , gagusuAvg(four,gaguIn));
			printPercent(">>5�ΰ���       " , gagusuAvg(five,gaguIn));
			printPercent(">>6�ΰ��� �̻�  " , gagusuAvg(six,gaguIn));
			
			//���� ���� �ο��� ����ִ� ��ȣ��
			System.out.println("\n���� ���� ���ֹ��� �����ϰ� ��ȣ���� �ο����� �����մϴ�");
			sql = "select dong, ho, total from population where total = (select max(total) FROM population)";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				populationDto.setDong(rs.getInt("dong"));
				populationDto.setHo(rs.getInt("ho"));
				populationDto.setTotal(rs.getInt("total"));
				System.out.println(">>" + populationDto.getDong() +"�� "+ populationDto.getHo() + "ȣ�� " + populationDto.getTotal()+"٣�� �����ϰ� �ֽ��ϴ�.");
			}
		}catch (Exception e) {
			System.out.println("report() Exception Error");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
		
	}
}