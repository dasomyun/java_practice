package sungConsole;

import java.util.Scanner;

import dbUnit.DriverProvider;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 23.
 * @���� : BD���� - ���� ���� ���α׷� 
 */

public class SungView {

	public static void main(String[] args) {

		DriverProvider.getDriver();
		SungDao sung = new SungDao();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			sung.printMenu();
			System.out.print("����: ");
			int choice = sc.nextInt();
			
			if (choice == 1){
				sung.insert();
			} else if (choice == 2){
				sung.showSungjuk();
			} else if (choice == 3) {
				sung.update();
			} else if (choice == 4) {
				sung.del();
			} else if (choice == 5) {
				sung.showData();
			} else if (choice == 6) {
				sc.close();
				System.out.println("�����մϴ�");
				System.exit(0);
			}
			
		}
		
	}

}
