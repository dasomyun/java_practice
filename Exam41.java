package ch04;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 19.
 * @���� : �Լ� - Call by Name
 */

import java.util.Scanner;

public class Exam41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �ϳ� �Է��ϼ���(1~3)");
		int x = sc.nextInt();
		
		if( x == 1 ) 
			aa();
		else if( x == 2 )
			bb();
		else if( x == 3 )
			cc();
		else 
			System.out.println("���� ��Ȯ�� �־�!!");
		
		sc.close();
	}

	public static void aa(){
		System.out.println("AA Function �Դϴ�");
	}
	
	public static void bb() {
		System.out.println("BB Function �Դϴ�");
	}
	
	public static void cc(){
		System.out.println("CC Fuction �Դϴ�");
	}
	
}
