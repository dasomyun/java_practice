package api15.Bank;

import java.util.Scanner;

/**실행클래스
 * @author : 윤다솜
 * @date : 2017. 2. 9.
 * @description : MVC
 */

public class AccountView {

	public static void main(String[] args) {
		AccountController jbank = new AccountController();
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
		
			jbank.printMenu();
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			
			switch(choice){
			case 1: //계좌개설
				jbank.makAccount();
				break;
			case 2:  //입금
				jbank.deposition();
				break;
			case 3:  //출금
				jbank.withdraw();
				break;
			case 4:  //잔액조회
				jbank.inquire();
				break;
			case 5:  //은행직원(전체출력)
				jbank.disp();
				break;
			case 6:
				System.out.println("종료합니다");
				sc.close();
				System.exit(0);//완전종료
			default:
				System.out.println("잘못선택하셨습니다");
			
			}
		}
		
		
	}
}
