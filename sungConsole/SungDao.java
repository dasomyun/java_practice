package sungConsole;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import dbUnit.ConnectionProvider;
import dbUnit.JdbcUtil;

public class SungDao {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private SungDto sungDto = null;
	private String sql = null;
	private Scanner sc = null;
	
	public void printMenu() {
		System.out.println("Menu ----------");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 성적삭제");
		System.out.println("5. 전체출력(내림차순)");
		System.out.println("6. 종료");
	
	}

	public void title() {
		System.out.println("학번\t이름\t국어\t영어\t수학\t사회\t역사\t음악\t미술\t체육\t총점\t평균");
	}

	// 성적입력
	public void insert() {
		conn = ConnectionProvider.getConnection();
		sungDto = new SungDto();
		sc = new Scanner(System.in);
		
		System.out.print("이름:");
		sungDto.setName(sc.next());
		
		System.out.print("국어:");
		sungDto.setKor(sc.nextInt());
		
		System.out.print("영어:");
		sungDto.setEng(sc.nextInt());
		
		System.out.print("수학:");
		sungDto.setMat(sc.nextInt());
		
		System.out.print("사회:");
		sungDto.setSociety(sc.nextInt());
		
		System.out.print("역사:");
		sungDto.setHistory(sc.nextInt());
		
		System.out.print("음악:");
		sungDto.setMusic(sc.nextInt());
		
		System.out.print("체육:");
		sungDto.setPhysical(sc.nextInt());
		
		System.out.print("미술:");
		sungDto.setArt(sc.nextInt());
		
		int tot = sungDto.getKor() + sungDto.getEng() + sungDto.getMat() + sungDto.getSociety() + sungDto.getMusic() + sungDto.getHistory() + sungDto.getPhysical() + 
				sungDto.getArt();
		
		float average = (float) tot/8;
		
		sungDto.setTotal(tot);
		sungDto.setAverage(average);
		
		// System.out.println(sungDto.getTotal() + "\t" + sungDto.getAverage() );
		
		try {
			sql = "insert into sungjuk values(sungjuk_num_sql.nextval,?,?,?,?,?,?,?,?,?,?,?)";
			conn = ConnectionProvider.getConnection();
			pstmt = conn.prepareStatement(sql);
		
			pstmt.setString(1, sungDto.getName());
			pstmt.setInt(2, sungDto.getKor());
			pstmt.setInt(3, sungDto.getEng());
			pstmt.setInt(4, sungDto.getMat());
			pstmt.setInt(5, sungDto.getSociety());
			pstmt.setInt(6, sungDto.getHistory());
			pstmt.setInt(7, sungDto.getMusic());
			pstmt.setInt(8, sungDto.getArt());
			pstmt.setInt(9, sungDto.getPhysical());
			pstmt.setInt(10, sungDto.getTotal());
			pstmt.setFloat(11, sungDto.getAverage());
			
			int check = pstmt.executeUpdate();
			if(check > 0) System.out.println("입력완료");
						
		} catch(Exception e) {
			System.out.println("성적입력시 에러발생");
			e.printStackTrace();
		}
		
	}
	// 전제출력
	public void showData() {
		conn = ConnectionProvider.getConnection();
		ArrayList<SungDto> arrayList = new ArrayList<SungDto>();
	
		try {
			sql = "select * from sungjuk order by average desc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
				
			while(rs.next()) {
				sungDto = new SungDto();
				sungDto.setNum(rs.getInt("num"));
				sungDto.setName(rs.getString("name"));
				sungDto.setKor(rs.getInt("kor"));
				sungDto.setEng(rs.getInt("eng"));
				sungDto.setMat(rs.getInt("mat"));
				sungDto.setSociety(rs.getInt("society"));
				sungDto.setHistory(rs.getInt("history"));
				sungDto.setMusic(rs.getInt("music"));
				sungDto.setArt(rs.getInt("art"));
				sungDto.setPhysical(rs.getInt("physical"));
				sungDto.setTotal(rs.getInt("total"));
				sungDto.setAverage(rs.getFloat("average"));
				arrayList.add(sungDto);
			}
			title();
			for(int i=0; i<arrayList.size(); i++) {
				SungDto sung = arrayList.get(i);
				System.out.println(sung.getNum() + "\t" + sung.getName() + "\t" + sung.getKor() + "\t" + sung.getEng() + "\t" + sung.getMat() + "\t" + sung.getSociety() + "\t" + sung.getHistory() + "\t" + sung.getMusic() + "\t" + sung.getArt() + "\t" + sung.getPhysical() + "\t" + sung.getTotal() + "\t" + sung.getAverage());
			}
			System.out.println(pstmt.toString());
			
		} catch(Exception e) {
			System.out.println("전체출력 에러");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);			
		}
		
	}
	// 성적출력
	public void showSungjuk() {
		conn = ConnectionProvider.getConnection();
		SungDto sung = new SungDto();
		sc = new Scanner(System.in);
		
		System.out.print("이름검색: ");
		sung.setName(sc.next());
		
		try {
			String sql = "select * from sungjuk where name=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,sung.getName());
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				sung.setNum(rs.getInt("num"));
				sung.setName(rs.getString("name"));
				sung.setKor(rs.getInt("kor"));
				sung.setEng(rs.getInt("eng"));
				sung.setMat(rs.getInt("mat"));
				sung.setSociety(rs.getInt("society"));
				sung.setHistory(rs.getInt("history"));
				sung.setMusic(rs.getInt("music"));
				sung.setArt(rs.getInt("art"));
				sung.setPhysical(rs.getInt("physical"));
				sung.setTotal(rs.getInt("total"));
				sung.setAverage(rs.getFloat("average"));
			}
			title();
			System.out.println(sung.getNum() + "\t" + sung.getName() + "\t" + sung.getKor() + "\t" + sung.getEng() + "\t" + sung.getMat() + "\t" + sung.getSociety() + "\t" + sung.getHistory() + "\t" + sung.getMusic() + "\t" + sung.getArt() + "\t" + sung.getPhysical() + "\t" + sung.getTotal() + "\t" + sung.getAverage());
			
			
		} catch(Exception e) {
			System.out.println("성적출력 에러");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);	
		}
	}
	
	// 성적삭제
	
	public void del() {
		conn = ConnectionProvider.getConnection();
		sungDto = new SungDto();
		sc = new Scanner(System.in);
		
		System.out.print("이름입력: ");
		String name = sc.next();
		sungDto.setName(name);
		
		try {
			sql = "select name from sungjuk where name=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sungDto.getName());
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				sql = "delete from sungjuk where name=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, sungDto.getName());
				int check = pstmt.executeUpdate();
				
				if(check > 0) System.out.println("삭제가 완료되었습니다");
			} else {
				System.out.println("이름이 존재하지 않습니다");
			}
			
			
		} catch(Exception e) {
			System.out.println("성적 삭제 에러");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);		
			JdbcUtil.close(conn);
		}
	}
	
	// 성적수정
	
	public void update() {
		conn = ConnectionProvider.getConnection();
		sungDto = new SungDto();
		
		System.out.print("성적 수정 이름:");
		sc = new Scanner(System.in);
		sungDto.setNum(sc.nextInt());
				
		try{
			sql = "select * from sungjuk where num= ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sungDto.getNum());
			rs = pstmt.executeQuery();
			if(rs.next()){
				sungDto.setNum(rs.getInt("num"));
				sungDto.setName(rs.getString("name"));
				sungDto.setKor(rs.getInt("kor"));
				sungDto.setEng(rs.getInt("eng"));
				sungDto.setMat(rs.getInt("mat"));
				sungDto.setSociety(rs.getInt("society"));
				sungDto.setHistory(rs.getInt("history"));
				sungDto.setMusic(rs.getInt("music"));
				sungDto.setArt(rs.getInt("art"));
				sungDto.setPhysical(rs.getInt("physical"));
				sungDto.setTotal(rs.getInt("total"));
				sungDto.setAverage(rs.getFloat("average"));
				
				System.out.println(sungDto.toString());
				
				System.out.print("1.국어 2.영어 3.수학 4.사회 5.역사 6.음악 7.미술 8.물리 : ");
				int choice = sc.nextInt();
			
				System.out.print("수정 점수:");
				int score = sc.nextInt();
				
				String subject=null;
				
				switch(choice){
				case 1:
					subject = "kor";
					sungDto.setKor(score);
					break;
				case 2:
					subject = "eng";
					sungDto.setEng(score);
					break;
				case 3:
					subject = "mat";
					sungDto.setMat(score);
					break;
				case 4:
					subject = "society";
					sungDto.setSociety(score);
					break;
				case 5:
					subject = "history";
					sungDto.setHistory(score);
					break;
				case 6:
					subject = "music";
					sungDto.setMusic(score);
					break;
				case 7:
					subject = "art";
					sungDto.setArt(score);
					break;
				case 8:
					subject = "physical";
					sungDto.setPhysical(score);
					break;
				
				}
				
				sql = "update sungjuk set " + subject + "=?, total=?, average=? where num=?";
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setInt(1, score);
				
				int tot = sungDto.getKor() + sungDto.getEng() + sungDto.getMat() + sungDto.getSociety() + sungDto.getHistory() + sungDto.getMusic() + sungDto.getArt() + sungDto.getPhysical();
				float average = (float) tot/8;
				
				pstmt.setInt(2, tot);
				pstmt.setFloat(3, average);
				pstmt.setInt(4, sungDto.getNum());
				
				int check = pstmt.executeUpdate();
				if(check>0) System.out.println("수정완료");
				
				// 출력
				sungDto.setTotal(tot);
				sungDto.setAverage(average);
				System.out.println(sungDto.toString());
				
			}else System.out.println("입력한 데이터가 존재하지 않습니다.");
			
		}catch(Exception e){
			System.out.println("수정 Error");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}
	}
	

