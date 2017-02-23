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
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ��������");
		System.out.println("4. ��������");
		System.out.println("5. ��ü���(��������)");
		System.out.println("6. ����");
	
	}

	public void title() {
		System.out.println("�й�\t�̸�\t����\t����\t����\t��ȸ\t����\t����\t�̼�\tü��\t����\t���");
	}

	// �����Է�
	public void insert() {
		conn = ConnectionProvider.getConnection();
		sungDto = new SungDto();
		sc = new Scanner(System.in);
		
		System.out.print("�̸�:");
		sungDto.setName(sc.next());
		
		System.out.print("����:");
		sungDto.setKor(sc.nextInt());
		
		System.out.print("����:");
		sungDto.setEng(sc.nextInt());
		
		System.out.print("����:");
		sungDto.setMat(sc.nextInt());
		
		System.out.print("��ȸ:");
		sungDto.setSociety(sc.nextInt());
		
		System.out.print("����:");
		sungDto.setHistory(sc.nextInt());
		
		System.out.print("����:");
		sungDto.setMusic(sc.nextInt());
		
		System.out.print("ü��:");
		sungDto.setPhysical(sc.nextInt());
		
		System.out.print("�̼�:");
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
			if(check > 0) System.out.println("�Է¿Ϸ�");
						
		} catch(Exception e) {
			System.out.println("�����Է½� �����߻�");
			e.printStackTrace();
		}
		
	}
	// �������
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
			System.out.println("��ü��� ����");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);			
		}
		
	}
	// �������
	public void showSungjuk() {
		conn = ConnectionProvider.getConnection();
		SungDto sung = new SungDto();
		sc = new Scanner(System.in);
		
		System.out.print("�̸��˻�: ");
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
			System.out.println("������� ����");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);	
		}
	}
	
	// ��������
	
	public void del() {
		conn = ConnectionProvider.getConnection();
		sungDto = new SungDto();
		sc = new Scanner(System.in);
		
		System.out.print("�̸��Է�: ");
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
				
				if(check > 0) System.out.println("������ �Ϸ�Ǿ����ϴ�");
			} else {
				System.out.println("�̸��� �������� �ʽ��ϴ�");
			}
			
			
		} catch(Exception e) {
			System.out.println("���� ���� ����");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);		
			JdbcUtil.close(conn);
		}
	}
	
	// ��������
	
	public void update() {
		conn = ConnectionProvider.getConnection();
		sungDto = new SungDto();
		
		System.out.print("���� ���� �̸�:");
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
				
				System.out.print("1.���� 2.���� 3.���� 4.��ȸ 5.���� 6.���� 7.�̼� 8.���� : ");
				int choice = sc.nextInt();
			
				System.out.print("���� ����:");
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
				if(check>0) System.out.println("�����Ϸ�");
				
				// ���
				sungDto.setTotal(tot);
				sungDto.setAverage(average);
				System.out.println(sungDto.toString());
				
			}else System.out.println("�Է��� �����Ͱ� �������� �ʽ��ϴ�.");
			
		}catch(Exception e){
			System.out.println("���� Error");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}
	}
	

