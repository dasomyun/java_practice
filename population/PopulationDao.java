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
/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 27.
 * @���� : insert() ����, gender() �� ȣ���� �����Ѱ踦 �������� ������ �����Ѱ踦 ���ϴ� �ɷ� ����    
 */
/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 28.
 * @���� : alone() ��� ���� ���� , insert() ����(���ƾ��� ����ɷ� ��ü) , most() �����԰� �Բ� ��������
 */
/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 3. 1.
 * @���� : �޼��� ���� 
 */
/**
 * @author : ���ټ�
 * @date : 2017. 3. 2.
 * @description : �޼��� ����
 */


/**
 * @author : ������
 * @date : 2017. 2. 24.
 * @description : insert() ���� - DB���� ���� 
 */

/**
 * @author : ������
 * @date : 2017. 2. 26.
 * @description : insert() ����, search() ����
 */

/**
 * @author : ������
 * @date : 2017. 2. 27.
 * @description : insert() �����Ϸ�
 */

/**
 * @author : ������
 * @date : 2017. 3. 2.
 * @description :
 */
public class PopulationDao {
	// ���?! - 55��
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private PopulationDto populationDto = null;
	private String sql = null;
	private Scanner sc = null;
	private int mentot=0, womentot=0, total=0;

	public void title() {
		System.out.println("|��\t|ȣ\t|������\t|������\t|��û�ҳ�\t|��û�ҳ�\t|���\t|���\t|���߳�\t|���߳�\t|�������\t|�������\t|������\t|������\t|���հ�\t|���հ�\t|���հ�\t|");	
		System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
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
	
	public void setTot(PopulationDto populationDto) {  	// mentot , womentot , total ���� 
		mentot = populationDto.getMenChild() + populationDto.getMenTeen() + populationDto.getMenAdult() + populationDto.getMenMid() + populationDto.getMenMidOld() + populationDto.getMenOld();
		womentot = populationDto.getWomenChild() + populationDto.getWomenTeen() + populationDto.getWomenAdult() + populationDto.getWomenMid() + populationDto.getWomenMidOld() + populationDto.getWomenOld();
		total = mentot + womentot;

		populationDto.setMenTotal(mentot);
		populationDto.setWomenTotal(womentot);
		populationDto.setTotal(total);
	}
	
	public void setDongHo (PopulationDto populationDto) { 		// ���� ȣ�� Ÿ���� üũ �� ����
		while(true){	// ���� Ÿ�缺 üũ
			System.out.print("���� �Է��ϼ���>>");
			int dongCorrect = sc.nextInt();
			
			if(dongCorrect > 100 && dongCorrect < 106) {
				populationDto.setDong(dongCorrect);
				break;
			} else {
				System.out.println("�Է��Ͻ� ���� �������� �ʽ��ϴ�.�ٽ� �Է��ϼ���.");
			}
		}
		
		while(true){	// ȣ�� Ÿ�缺 üũ
			System.out.print("ȣ�� �Է��ϼ���>>");
			int hoCorrect = sc.nextInt();
			if(hoCorrect > 100 && hoCorrect < 1003) {
				if(hoCorrect % 100 == 1 || hoCorrect % 100 == 2 ) {
					populationDto.setHo(hoCorrect);
					break;	
				}
			}
			System.out.println("�Է��Ͻ� ȣ�� �������� �ʽ��ϴ�.�ٽ� �Է��ϼ���.");
		}
	}
	
	
	// 1. ���� �Է�
	public void insert(){
		populationDto = new PopulationDto();
		sc= new Scanner(System.in);
		setDongHo(populationDto);
		
		System.out.print("0-9�� ��(��) �ο���>>");
		populationDto.setMenChild(sc.nextInt());
		
		System.out.print("0-9�� ��(��) �ο���>>");
		populationDto.setWomenChild(sc.nextInt());
		
		System.out.print("10�� ��(��) �ο���>>");
		populationDto.setMenTeen(sc.nextInt());
		
		System.out.print("10�� ��(��) �ο���>>");
		populationDto.setWomenTeen(sc.nextInt());
		
		System.out.print("20-30�� ��(��) �ο���>>");
		populationDto.setMenAdult(sc.nextInt());
		
		System.out.print("20-30�� ��(��) �ο���>>");
		populationDto.setWomenAdult(sc.nextInt());
		
		System.out.print("40-50�� ��(��) �ο���>>");
		populationDto.setMenMid(sc.nextInt());
		
		System.out.print("40-50�� ��(��) �ο���>>");
		populationDto.setWomenMid(sc.nextInt());
		
		System.out.print("60-70�� ��(��) �ο���>>");
		populationDto.setMenMidOld(sc.nextInt());
		
		System.out.print("60-70�� ��(��) �ο���>>");
		populationDto.setWomenMidOld(sc.nextInt());
		
		System.out.print("80�� �̻� ��(��) �ο���>>");
		populationDto.setMenOld(sc.nextInt());
		
		System.out.print("80�� �̻� ��(��) �ο���>>");
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
				System.out.println("�Է¿Ϸ�");
			}else{
				System.out.println("�Է½���");
			}
		} catch(SQLException e) {
			System.out.println("�̹� ���� ȣ�� �����մϴ�");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
		populationDto.toString();
	}

	// 2. ������ ����
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
					
				} else if( gender == 2) { // ������ �������� ��
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
				sql = "update population set " + age + "=?, menTotal=?, womenTotal=?, total=? where ho=?"; 	// ����
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, population);
				setTot(populationDto);
				pstmt.setInt(2, populationDto.getMenTotal());
				pstmt.setInt(3, populationDto.getWomenTotal());
				pstmt.setInt(4, populationDto.getTotal());
				pstmt.setInt(5, populationDto.getHo());
				
				int check = pstmt.executeUpdate();
				if(check > 0) System.out.println("�����Ϸ�");
				
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
	
	// 3. �� ���� ����
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
	// 4. ��ü ���� ���
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
			System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
			
		} catch(Exception e) {
			System.out.println("allData() ����");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		}
	}
	
	// 5. �� ȣ���� �Է¹޾� ���� �˻�
	public void search(){
		conn = ConnectionProvider.getConnection();
		populationDto = new PopulationDto();
		sc = new Scanner(System.in);
		setDongHo(populationDto);

		try{
			sql = "select * from population where dong=? and ho=?"; 	// �˻�
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, populationDto.getDong());
			pstmt.setInt(2, populationDto.getHo());
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				this.populationDto = setDb(populationDto);
				System.out.println(populationDto.toString());
			}else{
				System.out.println("�Է��Ͻ� ��,ȣ�� ������ �������� �ʽ��ϴ�");
			}	
		}catch(SQLException e){
			System.out.println("��ȣ���˻� ����");
			e.printStackTrace();
		}finally{
			JdbcUtil.close(conn);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		}
	}
	
}
