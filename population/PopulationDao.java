package population;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import dbUnit.ConnectionProvider;
import dbUnit.JdbcUtil;


/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 24.
 * @���� : allData() - ��ü��� , delete() - ȣ�� �� �α� ���� , update() - �α��� ����
 */
/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 26.
 * @���� : gender() - ���� / ���� �� �ο��� , age() - ���ɴ뺰 ��/�� �ο��� , selectGender() - �� ����  ���ɴ뺰 ��/�� �ο��� �˻��Ͽ� ���� , most() - ������ ���� ���� ���� �ο����� �����ϴ� ���� -- ȣ��  ���� ���� ����
 		  alone() - 1�ΰ�����(��,��,��+��) , average() - ���� ��� �ο��� , nobody() - �������� ����
 */

public class PopulationDao {
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private PopulationDto populationDto = null;
	private String sql = null;
	private Scanner sc = null;
	
	public void title() {
		System.out.println("��\tȣ\t������  ������  ��û�ҳ⿩û�ҳⳲ�  ���  ���߳�  ���߳�  ������⿩����Ⳳ���� ������   ���հ�  ���հ� ���հ� ���");
		
	}
	
	// ��ü ���
	public void allData() {
		conn = ConnectionProvider.getConnection();
		ArrayList<PopulationDto> arrayList = new ArrayList<PopulationDto>();
		
		try {
			// �� ��������, ȣ �������� ����
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
			System.out.println("allData() ����");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		}
	}
	
	// ȣ�� �� �α� ���� (�÷� ����)
	
	public void delete() {
		conn = ConnectionProvider.getConnection();
		populationDto = new PopulationDto();
		sc = new Scanner(System.in);
		
		System.out.print("������ �� �Է�: ");
		int finddong = sc.nextInt();
		populationDto.setDong(finddong);
		
		System.out.print("������ ȣ �Է�: ");
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
			
			if(check > 0) System.out.println("������ �Ϸ�Ǿ����ϴ�");
			} else {
				System.out.println("�Է��Ͻ� ȣ�� �������� �ʽ��ϴ�");
			}
			
		} catch(Exception e) {
			System.out.println("delete() ����");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);		
			JdbcUtil.close(conn);
		}
		
	}
	
	// �α��� ����
	public void update() {
		conn = ConnectionProvider.getConnection();
		sc = new Scanner(System.in);

		System.out.print("������ �� :");
		populationDto.setDong(sc.nextInt());
		
		System.out.print("������ ȣ:");
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
				
				System.out.println("������ ���ɰ� ������ �����ϼ���");
				System.out.print("1.��� 2.û�ҳ� 3.� 4.�߳� 5.���ĳ� 6.���� : ");
				int choice = sc.nextInt();
			
				System.out.print("1. ���� 2. ���� :");
				int gender = sc.nextInt();
				
				System.out.println("������ �α����� �Է��ϼ���");
				int population = sc.nextInt();
				
				String age = null;
				
				if(gender == 1) { // ������ �������� ��
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
					
				} else if( gender == 2) { // ������ �������� ��
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
				if(check > 0) System.out.println("�����Ϸ�");
				
				populationDto.setMenTotal(mantot);
				populationDto.setWomenTotal(womentot);
				populationDto.setTotal(total);
				populationDto.setAverage(average);
				
				} else System.out.println("�Է��� �����Ͱ� �������� �ʽ��ϴ�.");
			
		}catch(Exception e){
			System.out.println("���� Error");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}
	
	//  ���� / ���� �� �ο���
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
			System.out.println("��\tȣ\t���հ�\t���հ�");
			for(int i=0; i<arrayList.size(); i++) {
				PopulationDto populationDto = arrayList.get(i);
				System.out.println(populationDto.getDong() + "\t" + populationDto.getHo() + "\t" + populationDto.getMenTotal() + "\t" + populationDto.getWomenTotal());
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
			sql = "SELECT dong , sum(menchild) AS �����, sum(womenchild) AS ����� , sum(menteen) as ��û�ҳ� , sum(womenteen) AS ��û�ҳ�, sum(menadult) as ������, sum(womenadult) AS ������ , sum(menmid) as ���߳� , sum(womenmid)  AS ���߳�, sum(menmidold) as ������� , sum(womenmidold) as ������� , sum(menold) as ������ , sum(womenold) as ������ FROM population GROUP BY dong";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			System.out.println("��\t�����\t�����\t��û�ҳ�\t��û�ҳ�\t���\t���\t���߳�\t���߳�\t�������\t�������\t������\t������");

			while(rs.next()) {
				
				System.out.print(rs.getInt("dong") + "\t");
				System.out.print(rs.getInt("�����") + "\t");
				System.out.print(rs.getInt("�����") + "\t");
				System.out.print(rs.getInt("��û�ҳ�") + "\t");
				System.out.print(rs.getInt("��û�ҳ�") + "\t");
				System.out.print(rs.getInt("������") + "\t");
				System.out.print(rs.getInt("������") + "\t");
				System.out.print(rs.getInt("���߳�") + "\t");
				System.out.print(rs.getInt("���߳�") + "\t");
				System.out.print(rs.getInt("�������") + "\t");
				System.out.print(rs.getInt("�������") + "\t");
				System.out.print(rs.getInt("������") + "\t");
				System.out.print(rs.getInt("������") + "\n");	
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
	
	String gt = null;
	public void genderTitle(String gt) {
		this.gt = gt;
		System.out.println("��\t" + gt);
	}
	
	// �� ����  ���ɴ뺰 ��/�� �ο��� �˻��Ͽ� ���� 
	public void selectGender() {
		conn = ConnectionProvider.getConnection();
		sc = new Scanner(System.in);
		
		try {
			System.out.println("�˻��� ���ɰ� ������ �����ϼ���");
			System.out.print("1.��� 2.û�ҳ� 3.� 4.�߳� 5.���ĳ� 6.���� : ");
			int choice = sc.nextInt();
		
			System.out.print("1. ���� 2. ���� :");
			int gender = sc.nextInt();			
						
			if(gender == 1) { // ������ �������� ��
				switch(choice){
				case 1:
					String sql11 = "SELECT dong AS �� , sum(menchild) AS ����� from population GROUP BY dong";
					pstmt = conn.prepareStatement(sql11);
					rs = pstmt.executeQuery();
					
					genderTitle("�����");
					while(rs.next()){
						System.out.print(rs.getInt("��") + "\t");
						System.out.print(rs.getInt("�����") + "\n");
					}
					break;
				case 2:
					String sql12 = "SELECT dong AS �� ,  sum(menteen) as ��û�ҳ� from population GROUP BY dong";
					pstmt = conn.prepareStatement(sql12);
					rs = pstmt.executeQuery();
					
					genderTitle("��û�ҳ�");
					while(rs.next()){
						System.out.print(rs.getInt("��") + "\t");
						System.out.print(rs.getInt("��û�ҳ�") + "\n");
					}
					break;
				case 3:
					String sql13 = "SELECT dong AS �� , sum(menadult) as ������ from population GROUP BY dong";
					pstmt = conn.prepareStatement(sql13);
					rs = pstmt.executeQuery();
					
					genderTitle("������");
					while(rs.next()){
						System.out.print(rs.getInt("��") + "\t");
						System.out.print(rs.getInt("������") + "\n");
					}
					break;
				case 4:
					String sql14 = "SELECT dong AS �� , sum(menmid) as ���߳� from population GROUP BY dong";
					pstmt = conn.prepareStatement(sql14);
					rs = pstmt.executeQuery();

					genderTitle("���߳�");
					while(rs.next()){
						System.out.print(rs.getInt("��") + "\t");
						System.out.print(rs.getInt("���߳�") + "\n");
					}
					break;
				case 5:
					String sql15 = "SELECT dong AS �� , sum(menmidold) as ������� from population GROUP BY dong";
					pstmt = conn.prepareStatement(sql15);
					rs = pstmt.executeQuery();

					genderTitle("�������");
					while(rs.next()){
						System.out.print(rs.getInt("��") + "\t");
						System.out.print(rs.getInt("�������") + "\n");
					}
					break;
				case 6:
					String sql16 = "SELECT dong AS �� , sum(menold) as ������ from population GROUP BY dong";
					pstmt = conn.prepareStatement(sql16);
					rs = pstmt.executeQuery();

					genderTitle("������");
					while(rs.next()){
						System.out.print(rs.getInt("��") + "\t");
						System.out.print(rs.getInt("������") + "\n");
					}
					break;			
				}
					
			} else if( gender == 2) { // ������ �������� ��
				switch(choice){
					case 1:
						String sql21 = "SELECT dong AS �� , sum(womenchild) AS ����� from population GROUP BY dong";
						pstmt = conn.prepareStatement(sql21);
						rs = pstmt.executeQuery();	

						genderTitle("�����");
						while(rs.next()){
							System.out.print(rs.getInt("��") + "\t");
							System.out.print(rs.getInt("�����") + "\n");
						}
						break;
					case 2:
						String sql22 = "SELECT dong AS �� ,  sum(womenteen) as ��û�ҳ� from population GROUP BY dong";
						pstmt = conn.prepareStatement(sql22);
						rs = pstmt.executeQuery();

						genderTitle("��û�ҳ�");
						while(rs.next()){
							System.out.print(rs.getInt("��") + "\t");
							System.out.print(rs.getInt("��û�ҳ�") + "\n");
						}
						break;
					case 3:
						String sql23 = "SELECT dong AS �� , sum(womenadult) as ������ from population GROUP BY dong";
						pstmt = conn.prepareStatement(sql23);
						rs = pstmt.executeQuery();

						genderTitle("������");
						while(rs.next()){
							System.out.print(rs.getInt("��") + "\t");
							System.out.print(rs.getInt("������") + "\n");
						}
						break;
					case 4:
						String sql24 = "SELECT dong AS �� , sum(womenmid) as ���߳� from population GROUP BY dong";
						pstmt = conn.prepareStatement(sql24);
						rs = pstmt.executeQuery();

						genderTitle("���߳�");
						while(rs.next()){
							System.out.print(rs.getInt("��") + "\t");
							System.out.print(rs.getInt("���߳�") + "\n");
						}
						break;
					case 5:
						String sql25 = "SELECT dong AS �� , sum(womenmidold) as ������� from population GROUP BY dong";
						pstmt = conn.prepareStatement(sql25);
						rs = pstmt.executeQuery();

						genderTitle("�������");
						while(rs.next()){
							System.out.print(rs.getInt("��") + "\t");
							System.out.print(rs.getInt("�������") + "\n");
						}
						break;
					case 6:
						String sql26 = "SELECT dong AS �� , sum(womenold) as ������ from population GROUP BY dong";
						pstmt = conn.prepareStatement(sql26);
						rs = pstmt.executeQuery();

						genderTitle("������");
						while(rs.next()){
							System.out.print(rs.getInt("��") + "\t");
							System.out.print(rs.getInt("������") + "\n");
						}
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
	
	// ������ ���� ���� ���� �ο����� �����ϴ� ���� -- ȣ�� ���� ���� ����
	public void most() {
		conn = ConnectionProvider.getConnection();
		
		try {
			sql = "SELECT dong AS ��, MAX(total) AS ���帹���ο��� FROM population GROUP BY  dong";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("��\t���帹���ο���");
			
			while(rs.next()) {
				populationDto = new PopulationDto();
				System.out.print(rs.getInt("��") +"\t");
				System.out.print(rs.getInt("���帹���ο���") +"\n");	
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
	
	// ���� ��� �ο��� 
	public void average() {
		conn = ConnectionProvider.getConnection();
		
		try {
			sql = "SELECT dong as ��, round(avg(total/10)) as ����ο��� FROM population GROUP BY dong";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("��\t����ο���");
			
			while(rs.next()){
				System.out.print(rs.getInt("��") + "\t");
				System.out.print(rs.getInt("����ο���") + "\n");
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
	
	public void genderRatio() {
		
		
		
	}
	
}
	
	