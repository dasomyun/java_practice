package ch01;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 11.
 * @내용 : 연산자 우선순위 : 2) 단항연산자
 */

public class Exam02 {
	public static void main(String[] args) {
		boolean a = false ;
		boolean b =!a ;		//!!!!!!!!!a도 가능
		System.out.println( "a : " + a );
		System.out.println( "b : " + b );
		System.out.println( );
		
		int c = ~10;	// 0000 1010 
						// 1111 0101 = 11
		System.out.println( "c : " + c );
		
		int d = ~-15; 	// 1111 0001 이거 계산하는법 : 000자리 계산후 +1
						// 0000 1110
		System.out.println( "d : " + d );
		
		int x = 100 ;
		int y = -200 ;
		System.out.println( x + "\t" + y );
		System.out.println( -x + "\t" + -y );	// 원본데이터에 영향 X
		System.out.println( x + "\t" + y );
		
		
	}

}
