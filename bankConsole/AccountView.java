package bankConsole;

import java.util.Scanner;

import dbUnit.DriverProvider;

public class AccountView {
	public static void main(String[] args) {
		
		DriverProvider.getDriver();
		AccountDao jbank = new AccountDao();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			jbank.printMenu();
			System.out.print("선택 : ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				jbank.makeAccount();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.out.println("종료합니다");
				sc.close();
				System.exit(0);
			default:
				System.out.println("잘못입력하셨습니다");
				
			}
		}
		
	}
}
