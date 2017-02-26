package population;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import dbUnit.ConnectionProvider;
import dbUnit.JdbcUtil;


/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 24.
 * @내용 : allData() - 전체출력 , delete() - 호에 들어간 인구 삭제 , update() - 인구수 수정
 */
/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 26.
 * @내용 : gender() - 남자 / 여자 총 인원수 , age() - 연령대별 남/여 인원수 , selectGender() - 각 동의  연령대별 남/여 인원수 검색하여 추출 , most() - 각각의 동의 가장 많은 인원수가 거주하는 가구 -- 호는  아직 추출 못함
 		  alone() - 1인가구수(남,여,남+여) , average() - 동당 평균 인원수 , nobody() - 입주전인 빈집
 */

public class PopulationDao {
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private PopulationDto populationDto = null;
	private String sql = null;
	private Scanner sc = null;
	
	public void title() {
		System.out.println("동\t호\t남유아  여유아  남청소년여청소년남어른  여어른  남중년  여중년  남중장년여중장년남노인 여노인   남합계  여합계 총합계 평균");
		
	}
	
	// 전체 출력
	public void allData() {
		conn = ConnectionProvider.getConnection();
		ArrayList<PopulationDto> arrayList = new ArrayList<PopulationDto>();
		
		try {
			// 동 오름차순, 호 오름차순 정렬
			sql = "select * from population order by dong asc, ho asc";
			pstmt = conn.prepareStatement(sql);
			rs  = pstmt.executeQuery();
			
			while(rs.next()) {
				populationDto = new PopulationDto();
				populationDto.setDong(rs.getInt("dong"));
				populationDto.setHo(rs.getInt("ho"));
				populationDto.setMenChild(rs.getInt("menChild"));
				populationDto.setWomenChild(rs.getInt("womenChild"));
				populationDto.setMenTeen(rs.getInt("menTeen"));
				populationDto.setWomenTeen(rs.getInt("womenTeen"));
				populationDto.setMenAdult(rs.getInt("menAdult"));
				populationDto.setWomenAdult(rs.getInt("womenAdult"));
				populationDto.setMenMid(rs.getInt("menMid"));
				populationDto.setWomenMid(rs.getInt("womenMid"));
				populationDto.setMenMidOld(rs.getInt("menMidOld"));
				populationDto.setWomenMidOld(rs.getInt("womenMidOld"));
				populationDto.setMenOld(rs.getInt("menOld"));
				populationDto.setWomenOld(rs.getInt("womenOld"));
				populationDto.setMenTotal(rs.getInt("menTotal"));
				populationDto.setWomenTotal(rs.getInt("womenTotal"));
				populationDto.setTotal(rs.getInt("total"));
				populationDto.setAverage(rs.getInt("average"));
				arrayList.add(populationDto);
			}
			title();
			for(int i=0; i<arrayList.size(); i++) {
				PopulationDto popul = arrayList.get(i);
				System.out.println(popul.getDong() + "\t" + popul.getHo() + "\t" + popul.getMenChild() + "\t" + popul.getWomenChild() + "\t" + popul.getMenTeen() + "\t" + popul.getWomenTeen() + "\t" + popul.getMenAdult() + "\t" + popul.getWomenAdult() + 
						"\t" + popul.getMenMid() + "\t" + popul.getWomenMid() + "\t" + popul.getMenMidOld() + "\t" + popul.getWomenMidOld() + "\t" + popul.getMenOld() + "\t" + popul.getWomenOld() + "\t" + popul.getMenTotal() + "\t" + popul.getWomenTotal() + "\t" + popul.getTotal() + "\t" + popul.getAverage() );		
			}
			
		} catch(Exception e) {
			System.out.println("allData() 에러");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		}
	}
	
	// 호에 들어간 인구 삭제 (컬럼 삭제)
	
	public void delete() {
		conn = ConnectionProvider.getConnection();
		populationDto = new PopulationDto();
		sc = new Scanner(System.in);
		
		System.out.print("삭제할 동 입력: ");
		int finddong = sc.nextInt();
		populationDto.setDong(finddong);
		
		System.out.print("삭제할 호 입력: ");
		int findho = sc.nextInt();
		populationDto.setHo(findho);
		
		try {
			sql = "select ho from population where ho=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, populationDto.getHo());
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				sql = "delete from population where dong=? and ho=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, populationDto.getHo());
				pstmt.setInt(2, populationDto.getDong());
				int check = pstmt.executeUpdate();
			
			if(check > 0) System.out.println("삭제가 완료되었습니다");
			} else {
				System.out.println("입력하신 호가 존재하지 않습니다");
			}
			
		} catch(Exception e) {
			System.out.println("delete() 에러");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);		
			JdbcUtil.close(conn);
		}
		
	}
	
	// 인구수 수정
	public void update() {
		conn = ConnectionProvider.getConnection();
		sc = new Scanner(System.in);

		System.out.print("수정할 동 :");
		populationDto.setDong(sc.nextInt());
		
		System.out.print("수정할 호:");
		populationDto.setHo(sc.nextInt());
				
		try{
			sql = "select * from population where ho= ? and dong=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, populationDto.getHo());
			pstmt.setInt(2, populationDto.getDong());
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				
				populationDto = new PopulationDto();
				populationDto.setDong(rs.getInt("dong"));
				populationDto.setHo(rs.getInt("ho"));
				populationDto.setMenChild(rs.getInt("menChild"));
				populationDto.setWomenChild(rs.getInt("womenChild"));
				populationDto.setMenTeen(rs.getInt("menTeen"));
				populationDto.setWomenTeen(rs.getInt("womenTeen"));
				populationDto.setMenAdult(rs.getInt("menAdult"));
				populationDto.setWomenAdult(rs.getInt("womenAdult"));
				populationDto.setMenMid(rs.getInt("menMid"));
				populationDto.setWomenMid(rs.getInt("womenMid"));
				populationDto.setMenMidOld(rs.getInt("menMidOld"));
				populationDto.setWomenMidOld(rs.getInt("womenMidOld"));
				populationDto.setMenOld(rs.getInt("menOld"));
				populationDto.setWomenOld(rs.getInt("womenOld"));
				populationDto.setMenTotal(rs.getInt("menTotal"));
				populationDto.setWomenTotal(rs.getInt("womenTotal"));
				populationDto.setTotal(rs.getInt("total"));
				populationDto.setAverage(rs.getInt("average"));
				
				System.out.println("수정할 연령과 성별을 선택하세요");
				System.out.print("1.어린이 2.청소년 3.어른 4.중년 5.중후년 6.노인 : ");
				int choice = sc.nextInt();
			
				System.out.print("1. 여성 2. 남성 :");
				int gender = sc.nextInt();
				
				System.out.println("수정할 인구수를 입력하세요");
				int population = sc.nextInt();
				
				String age = null;
				
				if(gender == 1) { // 여성을 선택했을 때
					switch(choice){
					case 1:
						age = "womenChild";
						populationDto.setWomenChild(population);
						break;
					case 2:
						age = "womenTeen";
						populationDto.setWomenTeen(population);
						break;
					case 3:
						age = "womenAdult";
						populationDto.setWomenAdult(population);
						break;
					case 4:
						age = "womenMid";
						populationDto.setWomenMid(population);
						break;
					case 5:
						age = "womenMidOld";
						populationDto.setWomenMidOld(population);
						break;
					case 6:
						age = "womenOld";
						populationDto.setWomenOld(population);
						break;			
					}
					
				} else if( gender == 2) { // 남성을 선택했을 떄
					switch(choice){
					case 1:
						age = "menChild";
						populationDto.setMenChild(population);
						break;
					case 2:
						age = "menTeen";
						populationDto.setMenTeen(population);
						break;
					case 3:
						age = "menAdult";
						populationDto.setMenAdult(population);
						break;
					case 4:
						age = "menMid";
						populationDto.setMenMid(population);
						break;
					case 5:
						age = "menMidOld";
						populationDto.setMenMidOld(population);
						break;
					case 6:
						age = "menOld";
						populationDto.setMenOld(population);
						break;			
					}
				}
				
				sql = "update population set " + age + "=?, menTotal=?, womenTotal=?, total=?, average=? where ho=?";
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setInt(1, population);
				
				int mantot = populationDto.getMenChild() + populationDto.getMenTeen() + populationDto.getMenAdult() + populationDto.getMenMid() + populationDto.getMenMidOld() + populationDto.getMenOld();
				int womentot = populationDto.getWomenChild() + populationDto.getWomenTeen() + populationDto.getWomenAdult() + populationDto.getWomenMid() + populationDto.getWomenMidOld() + populationDto.getWomenOld();
				int total = mantot + womentot;
				int average = (mantot+womentot)/12;
				
				pstmt.setInt(2, mantot);
				pstmt.setInt(3, womentot);
				pstmt.setInt(4, total);
				pstmt.setInt(5, average);
				pstmt.setInt(6, populationDto.getHo());
				
				int check = pstmt.executeUpdate();
				if(check > 0) System.out.println("수정완료");
				
				populationDto.setMenTotal(mantot);
				populationDto.setWomenTotal(womentot);
				populationDto.setTotal(total);
				populationDto.setAverage(average);
				
				} else System.out.println("입력한 데이터가 존재하지 않습니다.");
			
		}catch(Exception e){
			System.out.println("수정 Error");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}
	
	//  남자 / 여자 총 인원수
	public void gender() {
		conn = ConnectionProvider.getConnection();
		ArrayList<PopulationDto> arrayList = new ArrayList<PopulationDto>();

		try {
			sql = "select dong,ho,mentotal,womentotal from population order by dong asc, ho asc ";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				populationDto = new PopulationDto();
				populationDto.setDong(rs.getInt("dong"));
				populationDto.setHo(rs.getInt("ho"));
				populationDto.setMenTotal(rs.getInt("menTotal"));
				populationDto.setWomenTotal(rs.getInt("womenTotal"));
				arrayList.add(populationDto);
			}
			System.out.println("동\t호\t남합계\t여합계");
			for(int i=0; i<arrayList.size(); i++) {
				PopulationDto populationDto = arrayList.get(i);
				System.out.println(populationDto.getDong() + "\t" + populationDto.getHo() + "\t" + populationDto.getMenTotal() + "\t" + populationDto.getWomenTotal());
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
			sql = "SELECT dong , sum(menchild) AS 남어린이, sum(womenchild) AS 여어린이 , sum(menteen) as 남청소년 , sum(womenteen) AS 여청소년, sum(menadult) as 남성인, sum(womenadult) AS 여성인 , sum(menmid) as 남중년 , sum(womenmid)  AS 여중년, sum(menmidold) as 남중장년 , sum(womenmidold) as 여중장년 , sum(menold) as 남노인 , sum(womenold) as 여노인 FROM population GROUP BY dong";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			System.out.println("동\t남어린이\t여어린이\t남청소년\t여청소년\t남어른\t여어른\t남중년\t여중년\t남중장년\t여중장년\t남노인\t여노인");

			while(rs.next()) {
				
				System.out.print(rs.getInt("dong") + "\t");
				System.out.print(rs.getInt("남어린이") + "\t");
				System.out.print(rs.getInt("여어린이") + "\t");
				System.out.print(rs.getInt("남청소년") + "\t");
				System.out.print(rs.getInt("여청소년") + "\t");
				System.out.print(rs.getInt("남성인") + "\t");
				System.out.print(rs.getInt("여성인") + "\t");
				System.out.print(rs.getInt("남중년") + "\t");
				System.out.print(rs.getInt("여중년") + "\t");
				System.out.print(rs.getInt("남중장년") + "\t");
				System.out.print(rs.getInt("여중장년") + "\t");
				System.out.print(rs.getInt("남노인") + "\t");
				System.out.print(rs.getInt("여노인") + "\n");	
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
	
	String gt = null;
	public void genderTitle(String gt) {
		this.gt = gt;
		System.out.println("동\t" + gt);
	}
	
	// 각 동의  연령대별 남/여 인원수 검색하여 추출 
	public void selectGender() {
		conn = ConnectionProvider.getConnection();
		sc = new Scanner(System.in);
		
		try {
			System.out.println("검색할 연령과 성별을 선택하세요");
			System.out.print("1.어린이 2.청소년 3.어른 4.중년 5.중후년 6.노인 : ");
			int choice = sc.nextInt();
		
			System.out.print("1. 남성 2. 여성 :");
			int gender = sc.nextInt();			
						
			if(gender == 1) { // 남성을 선택했을 때
				switch(choice){
				case 1:
					String sql11 = "SELECT dong AS 동 , sum(menchild) AS 남어린이 from population GROUP BY dong";
					pstmt = conn.prepareStatement(sql11);
					rs = pstmt.executeQuery();
					
					genderTitle("남어린이");
					while(rs.next()){
						System.out.print(rs.getInt("동") + "\t");
						System.out.print(rs.getInt("남어린이") + "\n");
					}
					break;
				case 2:
					String sql12 = "SELECT dong AS 동 ,  sum(menteen) as 남청소년 from population GROUP BY dong";
					pstmt = conn.prepareStatement(sql12);
					rs = pstmt.executeQuery();
					
					genderTitle("남청소년");
					while(rs.next()){
						System.out.print(rs.getInt("동") + "\t");
						System.out.print(rs.getInt("남청소년") + "\n");
					}
					break;
				case 3:
					String sql13 = "SELECT dong AS 동 , sum(menadult) as 남성인 from population GROUP BY dong";
					pstmt = conn.prepareStatement(sql13);
					rs = pstmt.executeQuery();
					
					genderTitle("남성인");
					while(rs.next()){
						System.out.print(rs.getInt("동") + "\t");
						System.out.print(rs.getInt("남성인") + "\n");
					}
					break;
				case 4:
					String sql14 = "SELECT dong AS 동 , sum(menmid) as 남중년 from population GROUP BY dong";
					pstmt = conn.prepareStatement(sql14);
					rs = pstmt.executeQuery();

					genderTitle("남중년");
					while(rs.next()){
						System.out.print(rs.getInt("동") + "\t");
						System.out.print(rs.getInt("남중년") + "\n");
					}
					break;
				case 5:
					String sql15 = "SELECT dong AS 동 , sum(menmidold) as 남중장년 from population GROUP BY dong";
					pstmt = conn.prepareStatement(sql15);
					rs = pstmt.executeQuery();

					genderTitle("남중장년");
					while(rs.next()){
						System.out.print(rs.getInt("동") + "\t");
						System.out.print(rs.getInt("남중장년") + "\n");
					}
					break;
				case 6:
					String sql16 = "SELECT dong AS 동 , sum(menold) as 남노인 from population GROUP BY dong";
					pstmt = conn.prepareStatement(sql16);
					rs = pstmt.executeQuery();

					genderTitle("남노인");
					while(rs.next()){
						System.out.print(rs.getInt("동") + "\t");
						System.out.print(rs.getInt("남노인") + "\n");
					}
					break;			
				}
					
			} else if( gender == 2) { // 여성을 선택했을 떄
				switch(choice){
					case 1:
						String sql21 = "SELECT dong AS 동 , sum(womenchild) AS 여어린이 from population GROUP BY dong";
						pstmt = conn.prepareStatement(sql21);
						rs = pstmt.executeQuery();	

						genderTitle("여어린이");
						while(rs.next()){
							System.out.print(rs.getInt("동") + "\t");
							System.out.print(rs.getInt("여어린이") + "\n");
						}
						break;
					case 2:
						String sql22 = "SELECT dong AS 동 ,  sum(womenteen) as 여청소년 from population GROUP BY dong";
						pstmt = conn.prepareStatement(sql22);
						rs = pstmt.executeQuery();

						genderTitle("여청소년");
						while(rs.next()){
							System.out.print(rs.getInt("동") + "\t");
							System.out.print(rs.getInt("여청소년") + "\n");
						}
						break;
					case 3:
						String sql23 = "SELECT dong AS 동 , sum(womenadult) as 여성인 from population GROUP BY dong";
						pstmt = conn.prepareStatement(sql23);
						rs = pstmt.executeQuery();

						genderTitle("여성인");
						while(rs.next()){
							System.out.print(rs.getInt("동") + "\t");
							System.out.print(rs.getInt("여성인") + "\n");
						}
						break;
					case 4:
						String sql24 = "SELECT dong AS 동 , sum(womenmid) as 여중년 from population GROUP BY dong";
						pstmt = conn.prepareStatement(sql24);
						rs = pstmt.executeQuery();

						genderTitle("여중년");
						while(rs.next()){
							System.out.print(rs.getInt("동") + "\t");
							System.out.print(rs.getInt("여중년") + "\n");
						}
						break;
					case 5:
						String sql25 = "SELECT dong AS 동 , sum(womenmidold) as 여중장년 from population GROUP BY dong";
						pstmt = conn.prepareStatement(sql25);
						rs = pstmt.executeQuery();

						genderTitle("여중장년");
						while(rs.next()){
							System.out.print(rs.getInt("동") + "\t");
							System.out.print(rs.getInt("여중장년") + "\n");
						}
						break;
					case 6:
						String sql26 = "SELECT dong AS 동 , sum(womenold) as 여노인 from population GROUP BY dong";
						pstmt = conn.prepareStatement(sql26);
						rs = pstmt.executeQuery();

						genderTitle("여노인");
						while(rs.next()){
							System.out.print(rs.getInt("동") + "\t");
							System.out.print(rs.getInt("여노인") + "\n");
						}
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
	
	// 각각의 동의 가장 많은 인원수가 거주하는 가구 -- 호는 추출 아직 못함
	public void most() {
		conn = ConnectionProvider.getConnection();
		
		try {
			sql = "SELECT dong AS 동, MAX(total) AS 가장많은인원수 FROM population GROUP BY  dong";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("동\t가장많은인원수");
			
			while(rs.next()) {
				populationDto = new PopulationDto();
				System.out.print(rs.getInt("동") +"\t");
				System.out.print(rs.getInt("가장많은인원수") +"\n");	
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
				case 1:
					String sql1 = "SELECT dong, ho, menchild, menteen, menadult, menmid, menmidold , menold FROM population WHERE mentotal=1 and womentotal=0";
					pstmt = conn.prepareStatement(sql1);
					rs = pstmt.executeQuery();
					
					while(rs.next()){
						System.out.print(rs.getInt("dong") + "\t");
						System.out.print(rs.getInt("ho") + "\t");
						System.out.print(rs.getInt("menchild") + "\t");
						System.out.print(rs.getInt("menteen") + "\t");
						System.out.print(rs.getInt("menadult") + "\t");
						System.out.println(rs.getInt("menmid") + "\t");
						System.out.println(rs.getInt("menmidold") + "\t");
						System.out.println(rs.getInt("menold") +"\n");
					}
					break;
					
				case 2:
					String sql2 = "SELECT dong, ho, womenchild, womenteen, womenadult, womenmid, womenmidold , womenold FROM population WHERE womentotal=1 and mentotal=0";
					pstmt = conn.prepareStatement(sql2);
					rs = pstmt.executeQuery();
					
					while(rs.next()){
						System.out.print(rs.getInt("dong") + "\t");
						System.out.print(rs.getInt("ho") + "\t");
						System.out.print(rs.getInt("womenchild") + "\t");
						System.out.print(rs.getInt("womenteen") + "\t");
						System.out.print(rs.getInt("womenadult") + "\t");
						System.out.println(rs.getInt("womenmid") + "\t");
						System.out.println(rs.getInt("womenmidold") + "\t");
						System.out.println(rs.getInt("womenold") +"\n");
					}
					break;
				case 3:
					String sql3 = "SELECT dong, ho, menchild, womenchild, menteen, womenteen, menadult, womenadult, menmid, womenmid, menmidold , womenmidold, menold ,womenold FROM population  WHERE total=1";					
					pstmt = conn.prepareStatement(sql3);
					rs = pstmt.executeQuery();
					
					while(rs.next()){
						System.out.print(rs.getInt("dong") + "\t");
						System.out.print(rs.getInt("ho") + "\t");
						System.out.print(rs.getInt("menchild") + "\t");
						System.out.print(rs.getInt("womenchild") + "\t");
						System.out.print(rs.getInt("menteen") + "\t");
						System.out.print(rs.getInt("womenteen") + "\t");
						System.out.print(rs.getInt("menadult") + "\t");
						System.out.print(rs.getInt("womenadult") + "\t");
						System.out.println(rs.getInt("menmid") + "\t");
						System.out.println(rs.getInt("womenmid") + "\t");
						System.out.println(rs.getInt("menmidold") + "\t");
						System.out.println(rs.getInt("womenmidold") + "\t");
						System.out.println(rs.getInt("menold") +"\n");
						System.out.println(rs.getInt("womenold") +"\n");
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
			sql = "SELECT dong as 동, round(avg(total/10)) as 평균인원수 FROM population GROUP BY dong";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("동\t평균인원수");
			
			while(rs.next()){
				System.out.print(rs.getInt("동") + "\t");
				System.out.print(rs.getInt("평균인원수") + "\n");
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
	
	public void genderRatio() {
		
		
		
	}
	
}
	
	