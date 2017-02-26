package population;
import java.util.Scanner;
import dbUnit.DriverProvider;

public class PopulationView {
	public static void main(String[] args) {
		
		DriverProvider.getDriver();
		PopulationDao popul = new PopulationDao();
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("���� 1.��ü��� 2.���� 3.����  4.����/�������հ�  5.���ɴ뺰 ��/�� �ο��� 6. ���ɴ뺰 ��/�� �ο��� �˻�  7.������ ���帹�� �ο��� 8.1�ΰ����� 9.���� ����α��� 10.���� 0.����");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				popul.allData(); // ��ü ���
			} else if(choice == 2) {
				popul.delete(); // ȣ�� �α� ����
			} else if(choice == 3) {
				popul.update(); // �α��� ����
			} else if(choice == 4) {
				popul.gender();
			} else if(choice == 0) {
				sc.close();
				System.out.println("�����մϴ�");
				System.exit(0);
			} else if(choice == 5) {
				popul.age();
			} else if(choice == 6) {
				popul.selectGender();
			} else if (choice == 7) {
				popul.most();
			} else if (choice == 8) {
				popul.alone();
			} else if (choice == 9) {
				popul.average();
			} else if (choice == 10) {
				popul.nobody();
			}
 			
		}
		
	}
}
