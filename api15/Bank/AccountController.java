package api15.Bank;

import java.util.ArrayList;
import java.util.Scanner;

/**구현클래스
 * @author : 윤다솜 
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
		System.out.println("1.계좌설계: ");
		System.out.println("2.입금: ");
		System.out.println("3.출금: ");
		System.out.println("4.잔액조회: ");
		System.out.println("5.전체출력: ");
		System.out.println("6.프로그램종료 \n");
	}
	
	public void makAccount(){
		AccountModel account = new AccountModel();
		//입력받는작업....
		System.out.print("계좌번호 :");
		account.setId(sc.nextInt());
		
		System.out.print("이름 : ");
		account.setName(sc.next());//변수 많이 사용하지 않는다
		
		System.out.print("입금액 : ");
		long balance = sc.nextLong(); // 키보드에서 입력
		account.setBalance(balance); // DB에 들어가감
		
		System.out.println(account.toString());
		
		list.add(account);
		
	}
	//잔액조회
	public void inquire(){
		System.out.println("계좌번호");
		int id = sc.nextInt(); 
		
		for(int i=0; i<list.size(); i++){
			AccountModel account = list.get(i);//get메서지 비교하기 위해
			
			if(account.getId()==id){
				System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
				
				return; //찾았으면 끝내야 함, 찾으면 리턴해서 빠져나가게 함
			} 
		}
		System.out.println("해당 계좌가 존재하지 않습니다");
	}
	
	
	       //입금 : 계좌 찾고 잔액에 입금한 금액 합산
			public void deposition(){
				System.out.println("계좌번호 : ");
				int id = sc.nextInt();
				
				System.out.println("입금액 : ");
				long money = sc.nextLong();
				
				for(int i=0; i<list.size(); i++){
					AccountModel account = list.get(i);
					
					if(account.getId()==id){
						long balance = account.getBalance() + money;
						account.setBalance(balance);
						System.out.println("입금이 완료되었습니다.");
						return;
					}				
			}
				
				System.out.println("유효하지 않은 계좌입니다.");
	}
			
			//출금 : 잔액보다 많이 뽑을 때, 잔액부족
			
			public void withdraw(){
				System.out.println("계좌번호: ");
				int id = sc.nextInt();
				
				System.out.println("출금액: ");
				long money = sc.nextLong();
				
				for(int i=0; i<list.size();i++){
					AccountModel account = list.get(i);
					
					if(account.getId()==id){
						if(account.getBalance() < money){
							System.out.println("잔액부족");
							return;
						}
						long balance = account.getBalance()-money;
						account.setBalance(balance);
						System.out.println("출금완료");
						return;
					}
				}
				
				System.out.println("유효하지 않은 계좌번호 입니다.");
			}
			
			public void disp(){
				for(int i=0; i<list.size();i++){
					AccountModel account = list.get(i);
					System.out.println(account.getId() + "\t" + account.getName() + "\t" +account.getBalance() );
					
				}
			}
			
}