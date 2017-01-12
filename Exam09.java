package ch02;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 12.
 * @내용 : 제어문 - 조건문(if문)
 */

public class Exam09 {

	public static void main(String[] args) {
		int score = 93 ;
		
		if( score >= 90 ) {
			System.out.println( "점수가 90보다 큽니다");
		}
		System.out.println( "java if문 입니다 \n");
		
		int y = 110 ;
		
		if ( y > 0 && y < 100 ) {
			y += 200 ;
			System.out.println(y);
		}
		System.out.println("end-------");
		
		
	}

}
