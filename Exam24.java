package ch02;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 16.
 * @내용 : do while 문과 while 문의 차이
 */

public class Exam24 {

	public static void main(String[] args) {

		int x = 10 ;
		while (x>50) {
			System.out.println( "while x: " + x );
		}
		
		do {	// 조건이 만족하지 않아도 최소 한번은 실행된다.
			System.out.println( "do~while x: " + x );
		} while(x>50);
		
		
		
		
		
		
		
		
		
		
		
	}

}
