package population;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import dbUnit.ConnectionProvider;
import dbUnit.JdbcUtil;
import population.PopulationDto;


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
/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 27.
 * @내용 : insert() 수정, gender() 각 호마다 성별총계를 구했지만 동마다 성별총계를 구하는 걸로 수정    
 */
/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 28.
 * @내용 : alone() 출력 에러 수정 , insert() 삭제(선아씨가 만든걸로 대체) , most() 선생님과 함께 쿼리수정
 */
/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 3. 1.
 * @내용 : 메서드 정리 
 */
/**
 * @author : 윤다솜
 * @date : 2017. 3. 2.
 * @description : 메서드 정리
 */


/**
 * @author : 곽선아
 * @date : 2017. 2. 24.
 * @description : insert() 구현 - DB연동 문제 
 */

/**
 * @author : 곽선아
 * @date : 2017. 2. 26.
 * @description : insert() 수정, search() 구현
 */

/**
 * @author : 곽선아
 * @date : 2017. 2. 27.
 * @description : insert() 수정완료
 */

/**
 * @author : 곽선아
 * @date : 2017. 3. 2.
 * @description :
 */
public class PopulationDao {
	// 상속?! - 55줄
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private PopulationDto populationDto = null;
	private String sql = null;
	private Scanner sc = null;
	private int mentot=0, womentot=0, total=0;

	public void title() {
		System.out.println("|동\t|호\t|남유아\t|여유아\t|남청소년\t|여청소년\t|남어른\t|여어른\t|남중년\t|여중년\t|남중장년\t|여중장년\t|남노인\t|여노인\t|남합계\t|여합계\t|총합계\t|");	
		System.out.println("￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣");
	}
	
	public PopulationDto setDb(PopulationDto populationDto) throws SQLException { 
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
			return populationDto;
	}
	
	public void setTot(PopulationDto populationDto) {  	// mentot , womentot , total 세팅 
		mentot = populationDto.getMenChild() + populationDto.getMenTeen() + populationDto.getMenAdult() + populationDto.getMenMid() + populationDto.getMenMidOld() + populationDto.getMenOld();
		womentot = populationDto.getWomenChild() + populationDto.getWomenTeen() + populationDto.getWomenAdult() + populationDto.getWomenMid() + populationDto.getWomenMidOld() + populationDto.getWomenOld();
		total = mentot + womentot;

		populationDto.setMenTotal(mentot);
		populationDto.setWomenTotal(womentot);
		populationDto.setTotal(total);
	}
	
	public void setDongHo (PopulationDto populationDto) { 		// 동과 호의 타탕성 체크 와 세팅
		while(true){	// 동의 타당성 체크
			System.out.print("동을 입력하세요>>");
			int dongCorrect = sc.nextInt();
			
			if(dongCorrect > 100 && dongCorrect < 106) {
				populationDto.setDong(dongCorrect);
				break;
			} else {
				System.out.println("입력하신 동이 존재하지 않습니다.다시 입력하세요.");
			}
		}
		
		while(true){	// 호의 타당성 체크
			System.out.print("호를 입력하세요>>");
			int hoCorrect = sc.nextInt();
			if(hoCorrect > 100 && hoCorrect < 1003) {
				if(hoCorrect % 100 == 1 || hoCorrect % 100 == 2 ) {
					populationDto.setHo(hoCorrect);
					break;	
				}
			}
			System.out.println("입력하신 호가 존재하지 않습니다.다시 입력하세요.");
		}
	}
	
	
	// 1. 가구 입력
	public void insert(){
		populationDto = new PopulationDto();
		sc= new Scanner(System.in);
		setDongHo(populationDto);
		
		System.out.print("0-9세 男(남) 인원수>>");
		populationDto.setMenChild(sc.nextInt());
		
		System.out.print("0-9세 女(여) 인원수>>");
		populationDto.setWomenChild(sc.nextInt());
		
		System.out.print("10대 男(남) 인원수>>");
		populationDto.setMenTeen(sc.nextInt());
		
		System.out.print("10대 女(여) 인원수>>");
		populationDto.setWomenTeen(sc.nextInt());
		
		System.out.print("20-30대 男(남) 인원수>>");
		populationDto.setMenAdult(sc.nextInt());
		
		System.out.print("20-30대 女(여) 인원수>>");
		populationDto.setWomenAdult(sc.nextInt());
		
		System.out.print("40-50대 男(남) 인원수>>");
		populationDto.setMenMid(sc.nextInt());
		
		System.out.print("40-50대 女(여) 인원수>>");
		populationDto.setWomenMid(sc.nextInt());
		
		System.out.print("60-70대 男(남) 인원수>>");
		populationDto.setMenMidOld(sc.nextInt());
		
		System.out.print("60-70대 女(여) 인원수>>");
		populationDto.setWomenMidOld(sc.nextInt());
		
		System.out.print("80대 이상 男(남) 인원수>>");
		populationDto.setMenOld(sc.nextInt());
		
		System.out.print("80대 이상 女(여) 인원수>>");
		populationDto.setWomenOld(sc.nextInt());

		setTot(populationDto);	
		
		try{
			conn = ConnectionProvider.getConnection();
			sql = " insert into population values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1 , populationDto.getDong());
			pstmt.setInt(2 , populationDto.getHo());
			pstmt.setInt(3 , populationDto.getMenChild());
			pstmt.setInt(4 , populationDto.getWomenChild());
			pstmt.setInt(5 , populationDto.getMenTeen());
			pstmt.setInt(6 , populationDto.getWomenTeen());
			pstmt.setInt(7 , populationDto.getMenAdult());
			pstmt.setInt(8 , populationDto.getWomenAdult());
			pstmt.setInt(9 , populationDto.getMenMid());
			pstmt.setInt(10 , populationDto.getWomenMid());
			pstmt.setInt(11 , populationDto.getMenMidOld());
			pstmt.setInt(12 , populationDto.getWomenMidOld());
			pstmt.setInt(13 , populationDto.getMenOld());
			pstmt.setInt(14 , populationDto.getWomenOld());
			pstmt.setInt(15 , populationDto.getMenTotal());
			pstmt.setInt(16 , populationDto.getWomenTotal());
			pstmt.setInt(17 , populationDto.getTotal());
						
			int check = pstmt.executeUpdate();
			if(check>0){
				System.out.println("입력완료");
			}else{
				System.out.println("입력실패");
			}
		} catch(SQLException e) {
			System.out.println("이미 동과 호가 존재합니다");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
		populationDto.toString();
	}

	// 2. 가구수 수정
	public void update() {
		conn = ConnectionProvider.getConnection();
		sc = new Scanner(System.in);
		PopulationDto populationDto = new PopulationDto();
		setDongHo(populationDto);
		
		try{
			sql = "select * from population where ho= ? and dong=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, populationDto.getHo());
			pstmt.setInt(2, populationDto.getDong());
			rs = pstmt.executeQuery();

			if(rs.next()){
				populationDto = setDb(populationDto);
				
				System.out.println("수정할 연령과 성별을 선택하세요");
				System.out.print("1.어린이 2.청소년 3.어른 4.중년 5.중후년 6.노인 : ");
				int choice = sc.nextInt();
			
				System.out.print("1. 남성 2. 여성 :");
				int gender = sc.nextInt();
				
				System.out.println("수정할 인구수를 입력하세요");
				int population = sc.nextInt();
				
				String age = null;
				
				if(gender == 1) { // 남성을 선택했을 때
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
					
				} else if( gender == 2) { // 여성을 선택했을 떄
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
				}	
				sql = "update population set " + age + "=?, menTotal=?, womenTotal=?, total=? where ho=?"; 	// 수정
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, population);
				setTot(populationDto);
				pstmt.setInt(2, populationDto.getMenTotal());
				pstmt.setInt(3, populationDto.getWomenTotal());
				pstmt.setInt(4, populationDto.getTotal());
				pstmt.setInt(5, populationDto.getHo());
				
				int check = pstmt.executeUpdate();
				if(check > 0) System.out.println("수정완료");
				
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
	
	// 3. 한 가구 삭제
	public void delete() {
		conn = ConnectionProvider.getConnection();
		populationDto = new PopulationDto();
		sc = new Scanner(System.in);
	
		setDongHo(populationDto);
	
		try {
			sql = "select dong, ho from population where dong=? and ho=? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, populationDto.getDong());
			pstmt.setInt(2, populationDto.getHo());
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				sql = "delete from population where dong=? and ho=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, populationDto.getDong());
				pstmt.setInt(2, populationDto.getHo());
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
	// 4. 전체 가구 출력
	public void showAllData() {
		conn = ConnectionProvider.getConnection();
		ArrayList<PopulationDto> arrayList = new ArrayList<PopulationDto>();
		PopulationDto populationDto = new PopulationDto();
		
		try {
			sql = "select * from population order by dong asc, ho asc";
			pstmt = conn.prepareStatement(sql);
			rs  = pstmt.executeQuery();
			
			while(rs.next()) {
				arrayList.add(setDb(populationDto));
			}
			
			title();
			for(int i=0; i<arrayList.size(); i++) {
				PopulationDto popul = arrayList.get(i);
				System.out.println("|"+popul.getDong() + "\t|" + popul.getHo() + "\t|" + popul.getMenChild() + "\t|" + popul.getWomenChild() + "\t|" + popul.getMenTeen() + "\t|" + popul.getWomenTeen() + "\t|" + popul.getMenAdult() + "\t|" + popul.getWomenAdult() + 
						"\t|" + popul.getMenMid() + "\t|" + popul.getWomenMid() + "\t|" + popul.getMenMidOld() + "\t|" + popul.getWomenMidOld() + "\t|" + popul.getMenOld() + "\t|" + popul.getWomenOld() + "\t|" + popul.getMenTotal() + "\t|" + popul.getWomenTotal() + "\t|" + popul.getTotal() +"\t|" );		
				
			}
			System.out.println("￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣");
			
		} catch(Exception e) {
			System.out.println("allData() 에러");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		}
	}
	
	// 5. 동 호수를 입력받아 가구 검색
	public void search(){
		conn = ConnectionProvider.getConnection();
		populationDto = new PopulationDto();
		sc = new Scanner(System.in);
		setDongHo(populationDto);

		try{
			sql = "select * from population where dong=? and ho=?"; 	// 검색
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, populationDto.getDong());
			pstmt.setInt(2, populationDto.getHo());
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				this.populationDto = setDb(populationDto);
				System.out.println(populationDto.toString());
			}else{
				System.out.println("입력하신 동,호에 가구가 존재하지 않습니다");
			}	
		}catch(SQLException e){
			System.out.println("동호수검색 에러");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(conn);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		}
	}
	
}
