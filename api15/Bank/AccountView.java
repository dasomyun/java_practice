package api15.Bank;

import java.util.Scanner;

/**����Ŭ����
 * @author : ���ټ�
 * @date : 2017. 2. 9.
 * @description : MVC
 */

public class AccountView {

	public static void main(String[] args) {
		AccountController jbank = new AccountController();
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
		
			jbank.printMenu();
			System.out.print("���� : ");
			int choice = sc.nextInt();
			
			switch(choice){
			case 1: //���°���
				jbank.makAccount();
				break;
			case 2:  //�Ա�
				jbank.deposition();
				break;
			case 3:  //���
				jbank.withdraw();
				break;
			case 4:  //�ܾ���ȸ
				jbank.inquire();
				break;
			case 5:  //��������(��ü���)
				jbank.disp();
				break;
			case 6:
				System.out.println("�����մϴ�");
				sc.close();
				System.exit(0);//��������
			default:
				System.out.println("�߸������ϼ̽��ϴ�");
			
			}
		}
		
		
	}
}
