package ch04;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 19.
 * @내용 : 함수 - Call by Name
 */

import java.util.Scanner;

public class Exam41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 하나 입력하세요(1~3)");
		int x = sc.nextInt();
		
		if( x == 1 ) 
			aa();
		else if( x == 2 )
			bb();
		else if( x == 3 )
			cc();
		else 
			System.out.println("숫자 정확히 넣어!!");
		
		sc.close();
	}

	public static void aa(){
		System.out.println("AA Function 입니다");
	}
	
	public static void bb() {
		System.out.println("BB Function 입니다");
	}
	
	public static void cc(){
		System.out.println("CC Fuction 입니다");
	}
	
}
