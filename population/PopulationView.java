package population;
import java.util.Scanner;
import dbUnit.DriverProvider;
import population.PopulationDao;
import population.PopulationDaoReport;
import population.PopulationDaoSearch;

public class PopulationView {
	
	public static void line(){
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	public static void main(String[] args) {
		
		DriverProvider.getDriver();
		PopulationDao pd = new PopulationDao();
		PopulationDaoSearch pds = new PopulationDaoSearch();
		PopulationDaoReport pdr = new PopulationDaoReport();
		Scanner sc = new Scanner(System.in);

		line();//���м� : �ߺ��Ǿ �޼ҵ�� ��
		System.out.println("�ؽֿ����Ʈ ���ֹ� �α��� ���� �����Դϴ�.���Ͻô� ���⸦ �����Ͽ� ����Ͻñ� �ٶ��ϴ�.��");
		System.out.println("1.�ο��� �Է� : ��,ȣ���� �Է��ϰ� ���ɴ�� ������ �ο����� �Է��մϴ�");
		System.out.println("2.����");
		System.out.println("3.����: ");
		System.out.println("4.��ü���: �ֿ����Ʈ ��ü �ο����� �����ݴϴ�.");
		System.out.println("5.�˻�: ��,ȣ���� �Է��ϸ� �����ϰ� �ִ� ���ɴ��� �ο����� �����ݴϴ�.");
		System.out.println("6.������� �˻�: ��,��,���ɴ븦 �˻��Ͽ� ���� ��踦 �����ݴϴ�.");
		System.out.println("7.����: �ֿ����Ʈ�� ���ο�, ��������, ������ ���� �����ݴϴ�. ");
		System.out.println("8.����: ���α׷��� ���� �����մϴ�.");
		System.out.println("\n�ѻ������ ������ �е��� �����ͷ� �����ֽñ� �ٶ��ϴ�.");
		System.out.println("��02-3482-4632, �ּ�:����Ư���� ������ ������� 132(���ﵿ) �ѵ���ǰ���� 8�� �ֿ뱳������");
		line();
		
		while(true) {
			System.out.println("1.�ο��� �Է� | 2.���� | 3.���� | 4.��ü��� | 5.�˻� | 6.������� �˻� | 7.���� | 8.���� ");
			System.out.print(">>");
			int choice = sc.nextInt();
			
			if(choice==1){//1.�ο��� �Է�
				line();
				System.out.println("�ؽֿ����Ʈ �ְŹ� �α��� ���縦 �����մϴ�. �Ʒ��� ������ ����� �о�� �� ����Ͻñ� �ٶ��ϴ�.��");
				System.out.println("�絿�� �Է��ϼ���. ��ȣ�� �Է��ϼ���. �鿬�ɴ� ���� ���� �ο����� ������� �Է��ϼ���");
				System.out.println("���ο��� �Է��� �߸����� ��� 2.������ �����Ͽ� �����Ͻñ� �ٶ��ϴ�.");
				line();
				pd.insert();
			}else if(choice==2){//2.����
				line();
				System.out.println("���ο��� ������ �����մϴ�. �Ʒ��� ������ ����� �о�� �� ����Ͻñ� �ٶ��ϴ�.��");
				System.out.println("������� ���� �Է��ϼ���. ������� ȣ�� �Է��ϼ���. ������� ���ɴ븦 �����ϼ���. ������� ������ �����ϼ���. ������� �ο����� �Է��ϼ���");
				line();
				pd.update();
			}else if(choice==3){//3.����
				line();
				System.out.println("���ο��� ������ �����մϴ�. �Ʒ��� ������ ����� �о�� �� ����Ͻñ� �ٶ��ϴ�.��");
				System.out.println("������� ���� �Է��ϼ���. ������� ȣ�� �Է��ϼ���.");
				line();
				pd.delete();
			}else if(choice==4){//4.��ü���
				line();
				System.out.println("�ؽֿ����Ʈ ��ü�� ���ɴ뺰 ��,�� �ο����� �� �ο����� �����ݴϴ١�");
				line();
				pd.showAllData();
			}else if(choice==5){//5.��ȣ���� �ο��� �˻�
				line();
				System.out.println("�ص�,ȣ���� �Է��ϸ� ���ɴ뺰 ��,�� �ο����� �� �ο����� �����ݴϴ�. �Ʒ��� ������ ����� �о�� �� ����Ͻñ� �ٶ��ϴ�.��");
				System.out.println("��˻��� ���� �Է��ϼ���. ��˻��� ȣ�� �Է��ϼ���.");
				line();
				pd.search();
			}else if(choice==6){//6.������� �˻�
				line();
				System.out.println("�س�,��,���ɴ� ���� �˻��Ͽ� ���� ��踦 ����մϴ�. �Ʒ��� ������ �о�� �� �˸��� ��ȣ�� �������ּ���.��");
				System.out.println("1. ��/�� �ο��� : ������ �����ο���, �����ο���, ���ο����� �����ݴϴ�.");
				System.out.println("2. ���ɴ뺰 ��/�� �ο��� : ���� �����ϴ� ���ɴ뺰 �ο����� �����ݴϴ�.");
				System.out.println("3. ���ɴ뺰 ��/�� �ο��� �˻� : ���ɴ�� ������ �����Ͽ� ���� �����ϴ� �ο����� �����ݴϴ�.");
				System.out.println("4. ������ ���� ���� ���� : ������ ���� ���� �����ϴ� ������ ��ȣ���� �ο����� �����ݴϴ�.");
				System.out.println("5. 1�� ���� : 1�ΰ����� ���� ȣ���� �����ݴϴ�.");
				System.out.println("6. ���� ��� �α��� : ������ ��� �����ϴ� �α����� �����ݴϴ�.");
				line();
				
				while(true){
					System.out.println("1.��/�� �ο��� | 2.���ɴ뺰 ��/�� �ο��� | 3.���ɴ뺰 ��/�� �ο��� �˻� | 4.������ ���� ���� ���� | 5.1�� ���� | 6.���� ��� �α��� | 7.����� ���� | 8.���ư���");
					System.out.print(">>");
					int select = sc.nextInt();
					if(select ==1){//1.��/�� �ο���
						pds.gender();
					}else if(select==2){//2.���ɴ뺰 ��/�� �ο���
						pds.age();
					}else if(select==3){//3.���ɴ뺰 ��/�� �ο��� �˻�
						pds.selectGender();
					}else if(select==4){//4.������ ���帹�� ����
						pds.most();
					}else if(select==5){//5.1�� ����
						pds.alone();
					}else if(select==6){//6.���� ����α���
						pds.average();
					}else if(select==7){//7.����� ����
						pds.nobody();
					}else if(select==8){
						break;
					}
				}
			}else if(choice==7){//����
				line();
				pdr.report();
				line();
			}else if(choice==8){//���α׷�����
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}else{
				System.out.println("�߸��Է��ϼ̽��ϴ�.�ٽ��Է����ּ���");
				sc.close();
			}
		}
		
	}
}
