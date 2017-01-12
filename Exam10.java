package ch02;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 12.
 * @내용 : if 문
 */

public class Exam10 {

	public static void main(String[] args) {
		int num = 52 ; 
		int value = 24 ;
		
		if ( num > value ) {
			System.out.println( "num이 value보다 크다" );
		}
		if ( num == value ) {
			System.out.println( "num와 value가 같다" );
		}
		if ( num < value ) { 
			System.out.println( "num가 value보다 작다 \n" );
		}
		
		int su = 20 ;
		
		if ( su % 2 == 0 ) {
			System.out.println( "짝수 입니다" );
		}
		if ( su % 2 != 0 ) {
			System.out.println( "홀수 입니다" );
		}
		String str = su % 2 == 0 ? "짝수 입니다" : "홀수 입니다" ; 
		System.out.println(str);
	}

}
