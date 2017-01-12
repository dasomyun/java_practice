package ch01;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 12.
 * @내용 : 
 */

public class Exam08 {

	public static void main(String[] args) {
		int a = 10 ;
		System.out.println( a == 10 ? "T" : "F");
		
		int b = 20 ;
		int c = 30 ;
		int d = b != c ? b : c ;
		System.out.println( "d" + d );
		
		int i = 100 ;
		System.out.println( i += 2 );	//i=i+2 102
		System.out.println( i -= 2 );	//100
		System.out.println( i *= 2 );	//200
		System.out.println( i /= 2 ); 	//100
		System.out.println( );
		
		int x = 10 , y = 20 , z = 30 ;
		System.out.println( x + "\t" + y + "\t" + z );
		
		//출력 --------------------------------------
		// 문자열 + 문자열 = 문자열
		// 문자열 + 정수형 변수 = 문자열
		
		int su = 20 ;
		int value = 30 ;
		System.out.println(su);	//20
		System.out.println( "su : " + su ); // su : 20
		System.out.println( "su : " + su + "\t value : " + value ); 	// 문자열+정수형변수+문자열+정수형변수 = 문자열
		System.out.println( su + " " + value );							// 두 수의 합이 아닌 변수 각각을 출력하고 싶을 때 이 방법 사용. 컴퓨터는 정수 2개의 합으로 보지만 문자열을 사이에 넣어주면 문자열로 바뀜
		System.out.println( "결과 : " +  su + value );
		System.out.println( "결과 : " + ( su + value ));
		System.out.println(su + value + "=" + 20 + 30 + "입니다");
		System.out.println(true);
	
	}
}
