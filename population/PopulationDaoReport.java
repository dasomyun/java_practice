package population;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbUnit.ConnectionProvider;
import dbUnit.JdbcUtil;

/**
 * @author : 곽선아
 * @date : 2017. 2. 26.
 * @description : 구현
 */

/**
 * @author : 곽선아
 * @date : 2017. 2. 27.
 * @description : 수정
 */

/**
 * @author : 곽선아
 * @date : 2017. 2. 28.
 * @description : 수정
 */

/**
 * @author : 곽선아
 * @date : 2017. 3. 2.
 * @description : 메소드 정리 , 완성
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
			System.out.print("■");
		}
		System.out.println("\t" + d + "%");
	}
	
	public void printtot(String str1 , String str2) throws SQLException {
		System.out.println(str1 + "남자는  " + rs.getInt("sum(men" + str2 + ")")+ "名, 여자는 " + rs.getInt("sum(women" + str2 + ")") +"名으로 총 " + sum(str2) +"名이 있습니다." );
	}

	public int getValue(String str) throws SQLException {
			return rs.getInt(str);
	}
	
	//보고서
	public void report(){
		conn = ConnectionProvider.getConnection();
		populationDto = new PopulationDto();
		
		try {
			//총 인원수와 평균
			sql = "select sum(menTotal) , sum(womenTotal) , sum(total) , avg(total) , sum(menChild) , sum(womenChild) ,sum(menTeen), sum(womenTeen), sum(menAdult), sum(womenAdult), sum(menMid), sum(womenMid), sum(menMidOld), sum(womenMidOld), sum(menOld), sum(womenOld) from population";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			if(rs.next()){ 
				System.out.println("총 "+rs.getInt("sum(total)") + "名이 거주하고 있으며, 평균적으로 1가구당 " +rs.getInt("avg(total)") + "名이 거주하고 있습니다.");
				System.out.println("남자는 "+ rs.getInt("sum(menTotal)")+"名, 여자는 "+ rs.getInt("sum(womenTotal)") + "名이 거주하고 있습니다.");
				
				printPercent(">>남자(男)   " , menWomenAvg("menTotal"));
				printPercent(">>여자(女)   " , menWomenAvg("womenTotal"));	
				System.out.println();
				printtot("0-9세" , "child");
				printtot("10-19세 " , "teen");
				printtot("20-39세 " , "adult");
				printtot("40-59세 " , "mid");
				printtot("60-79세 " , "midOld");
				printtot("80세 이상 " , "old");				
				printPercent(">>0-9세        " , avg("child"));
				printPercent(">>10-19세     " , avg("teen"));
				printPercent(">>20-39세     " , avg("adult"));
				printPercent(">>40-59세     " , avg("mid"));
				printPercent(">>60-79세     " , avg("midOld"));
				printPercent(">>80세-이상    " , avg("old"));
			}
				
			//총 가구수 count
			int gaguSum=0;
			int gaguIn=0;
			int gaguNone=0;
			
			sql = "select count(*) from population ";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				gaguSum = rs.getInt("count(*)");
				System.out.println("\n이 빌라는 총 " + gaguSum +"가구가 있습니다.");
			}
			
			//실제 거주하고 있는 count
			sql = "select count(*) from population where total<>0";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				gaguIn = rs.getInt("count(*)");
				System.out.print("그 중 입주민이 있는 가구는 " + gaguIn +"가구,");
			}
			//거주민이 0인, 빈가구 count
			sql = "select count(*) from population where total=0";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()){
				gaguNone = rs.getInt("count(*)");
				System.out.println(" 입주민이 없는 빈가구는 " + gaguNone +"가구가 있습니다.");
			}
			
			double gaguInAvg =Math.round((double)gaguIn/gaguSum*100);
			double gaguNoneAvg =Math.round((double)gaguNone/gaguSum*100);
			
			printPercent(">>거주가구        " , gaguInAvg);
			printPercent(">>비거주가구      " , gaguNoneAvg);
		
			int alone=0;
			int childAlone=0;
			int teenAlone=0;
			int adultAlone=0;
			int midAlone=0;
			int midOldAlone=0;
			int oldAlone=0;
			
			//총 거주민이 1인 count
			sql = "select count(*) from population where total=1";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				
				alone = rs.getInt("count(*)");
				System.out.println("\n1인가구는 총 " + alone + "가구가 있습니다.");
			}
			
			sql = "select count(*) from population where total=1 and menChild + womenChild=1";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				childAlone = rs.getInt("count(*)");
				System.out.println("0-9세 남자가 혼자 거주하는 " + childAlone +"가구가 있습니다.");
			}
			
			sql = "select count(*) from population where total=1 and menChild + womenChild=1";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				teenAlone = rs.getInt("count(*)");
				System.out.println("10대 남자가 혼자 거주하는 " + teenAlone +"가구가 있습니다.");
			}
			
			sql = "select count(*) from population where total=1 and menAdult + womenAdult=1";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				adultAlone= rs.getInt("count(*)");
				System.out.println("20-30대 남자가 혼자 거주하는 " + adultAlone +"가구가 있습니다.");
			}
			
			sql = "select count(*) from population where total=1 and menMid + womenMid=1";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				midAlone = rs.getInt("count(*)");
				System.out.println("40-50대 청년이 혼자 거주하는 " + midAlone +"가구가 있습니다.");
			}
			
			sql = "select count(*) from population where total=1 and menMidOld + womenMidOld=1 ";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				midOldAlone = rs.getInt("count(*)");
				System.out.println("60-70대 이상 노인이 혼자 거주하는 " + midOldAlone +"가구가 있습니다");
			}
			
			sql = "select count(*) from population where total=1 and menOld + womenOld=1 ";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				oldAlone = rs.getInt("count(*)");
				System.out.println("80대 이상 노인이 혼자 거주하는 " + oldAlone +"가구가 있습니다");
			}
			
			printPercent(">>0-9세        " , aloneAvg(childAlone,alone));
			printPercent(">>10-19세     " , aloneAvg(teenAlone,alone));
			printPercent(">>20-39세     " , aloneAvg(adultAlone,alone));
			printPercent(">>40-59세     " , aloneAvg(midAlone,alone));
			printPercent(">>60-79세     " , aloneAvg(midOldAlone,alone));
			printPercent(">>80세-이상    " , aloneAvg(oldAlone,alone));
			
			//1인가구의 동호수
			System.out.println("\n80대 이상 1인가구의 동호수를 공개합니다.");
			sql = "select dong, ho, total from population where total=1 and menOld + womenOld=1";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){//populationDto = new PopulationDto();
				populationDto.setDong(rs.getInt("dong"));
				populationDto.setHo(rs.getInt("ho"));
				populationDto.setTotal(rs.getInt("total"));
				System.out.println(">>" + populationDto.getDong() +"동 "+ populationDto.getHo() + "호" );
			}
			
			System.out.println(" ");
			
			int couple = 0;
			int three = 0;
			int four = 0;
			int five = 0;
			int six = 0;
			
			System.out.println("1인이 거주하는 가구수는 " + alone +"가구 입니다.");
			
			sql = "select count(*) from population where total=2 ";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				couple = rs.getInt("count(*)");
				System.out.println("2인이 거주하는 가구수는 " + couple +"가구 입니다.");
			}
			
			sql = "select count(*) from population where total=3";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				three = rs.getInt("count(*)");
				System.out.println("3인이 거주하는 가구수는 " + three +"가구 입니다.");
			}
			
			sql = "select count(*) from population where total=4";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				four = rs.getInt("count(*)");
				System.out.println("4인이 거주하는 가구수는 " + four + "가구 입니다.");
			}
			
			sql = "select count(*) from population where total=5";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				five = rs.getInt("count(*)");
				System.out.println("5인이 거주하는 가구수는 " + five + "가구 입니다.");
			}
			
			sql = "select count(*) from population where total=5 ";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				six = rs.getInt("count(*)");
				System.out.println("6인 이상 거주하는 가구수는 " + six + "가구 입니다.");
			}
		
			printPercent(">>1인가구       " , gagusuAvg(alone,gaguIn));
			printPercent(">>2인가구       " , gagusuAvg(couple,gaguIn));
			printPercent(">>3인가구       " , gagusuAvg(three,gaguIn));
			printPercent(">>4인가구       " , gagusuAvg(four,gaguIn));
			printPercent(">>5인가구       " , gagusuAvg(five,gaguIn));
			printPercent(">>6인가구 이상  " , gagusuAvg(six,gaguIn));
			
			//가장 많은 인원이 살고있는 동호수
			System.out.println("\n가장 많은 입주민이 거주하고 동호수와 인원수를 공개합니다");
			sql = "select dong, ho, total from population where total = (select max(total) FROM population)";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				populationDto.setDong(rs.getInt("dong"));
				populationDto.setHo(rs.getInt("ho"));
				populationDto.setTotal(rs.getInt("total"));
				System.out.println(">>" + populationDto.getDong() +"동 "+ populationDto.getHo() + "호로 " + populationDto.getTotal()+"名이 거주하고 있습니다.");
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