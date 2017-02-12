package api15.Bank;

import java.util.ArrayList;
import java.util.Scanner;

/**����Ŭ����
 * @author : ���ټ� 
 * @date : 2017. 2. 9.
 * @description : ArrayList
 */

public class AccountController {
	private ArrayList<AccountModel> list;  
	private Scanner sc;
	
	public AccountController(){
		list = new ArrayList<AccountModel>();
		sc = new Scanner(System.in);
	}
	
	public void printMenu(){
		System.out.println("Menu-----------");
		System.out.println("1.���¼���: ");
		System.out.println("2.�Ա�: ");
		System.out.println("3.���: ");
		System.out.println("4.�ܾ���ȸ: ");
		System.out.println("5.��ü���: ");
		System.out.println("6.���α׷����� \n");
	}
	
	public void makAccount(){
		AccountModel account = new AccountModel();
		//�Է¹޴��۾�....
		System.out.print("���¹�ȣ :");
		account.setId(sc.nextInt());
		
		System.out.print("�̸� : ");
		account.setName(sc.next());//���� ���� ������� �ʴ´�
		
		System.out.print("�Աݾ� : ");
		long balance = sc.nextLong(); // Ű���忡�� �Է�
		account.setBalance(balance); // DB�� ����
		
		System.out.println(account.toString());
		
		list.add(account);
		
	}
	//�ܾ���ȸ
	public void inquire(){
		System.out.println("���¹�ȣ");
		int id = sc.nextInt(); 
		
		for(int i=0; i<list.size(); i++){
			AccountModel account = list.get(i);//get�޼��� ���ϱ� ����
			
			if(account.getId()==id){
				System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
				
				return; //ã������ ������ ��, ã���� �����ؼ� ���������� ��
			} 
		}
		System.out.println("�ش� ���°� �������� �ʽ��ϴ�");
	}
	
	
	       //�Ա� : ���� ã�� �ܾ׿� �Ա��� �ݾ� �ջ�
			public void deposition(){
				System.out.println("���¹�ȣ : ");
				int id = sc.nextInt();
				
				System.out.println("�Աݾ� : ");
				long money = sc.nextLong();
				
				for(int i=0; i<list.size(); i++){
					AccountModel account = list.get(i);
					
					if(account.getId()==id){
						long balance = account.getBalance() + money;
						account.setBalance(balance);
						System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
						return;
					}				
			}
				
				System.out.println("��ȿ���� ���� �����Դϴ�.");
	}
			
			//��� : �ܾ׺��� ���� ���� ��, �ܾ׺���
			
			public void withdraw(){
				System.out.println("���¹�ȣ: ");
				int id = sc.nextInt();
				
				System.out.println("��ݾ�: ");
				long money = sc.nextLong();
				
				for(int i=0; i<list.size();i++){
					AccountModel account = list.get(i);
					
					if(account.getId()==id){
						if(account.getBalance() < money){
							System.out.println("�ܾ׺���");
							return;
						}
						long balance = account.getBalance()-money;
						account.setBalance(balance);
						System.out.println("��ݿϷ�");
						return;
					}
				}
				
				System.out.println("��ȿ���� ���� ���¹�ȣ �Դϴ�.");
			}
			
			public void disp(){
				for(int i=0; i<list.size();i++){
					AccountModel account = list.get(i);
					System.out.println(account.getId() + "\t" + account.getName() + "\t" +account.getBalance() );
					
				}
			}
			
}