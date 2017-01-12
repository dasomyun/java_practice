package ch01;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 12.
 * @내용 : 비교 연산자
 */

public class Exam06 {

	public static void main(String[] args) {
		int a = 10 ;
		int b = 20 ;
		boolean c = a > b ;		// 10 > 20
		boolean d = a < b ;
		boolean e = a >= b ;
		boolean f = a <= b ;
		System.out.println( "c: " + c );
		System.out.println( "d: " + d );
		System.out.println( "e: " + e );
		System.out.println( "f: " + f );
		
		int x = 100 ;
		int y = 200 ;
		boolean z = x == y ;
		boolean zz = x != y ;
		System.out.println( "z: " + z );
		System.out.println( "zz: " + zz );
		
	}

}
