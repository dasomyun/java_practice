package ch01;


//shift + alt + j

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 11.
 * @내용 : 자료형 ( 정수, 실수, 논리형, 문자열, 문자 )
 */

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 화면 입출력
		System.out.println( "하하하" );
		System.out.print( "How are you" );
		System.out.println( "hi" );
		System.out.println();
		
		System.out.println( "정수형(기본) 자료형" );
		
		byte a = 10 ;		//1byte(-128~127)
		short b = 129 ;		//2byte(-32768~32767)
		int c = 1000 ; 		//4byte(-2147483648~2147483647)
		long d = 6580L ; 	//8byte(-2^63~2^63-1)
		
		System.out.println( "a의 값 : " + a );
		System.out.println( "b의 값 : " + b );
		System.out.println( "c의 값 : " + c );
		System.out.println( "d의 값 : " + d );
		System.out.println();
		
		System.out.println( "실수형 자료형" );
		
		float e = 45.4f ;	//4byte
		double f = 120.40 ;	//8byte
		
		System.out.println( "e의 값은 : " + e );
		System.out.println( "f의 값은 : " + f );
		
		System.out.println( "문자형 자료형" );
		char x = 'A' ;	//2byte
		char y = '김' ;	//2byte
		System.out.println( "x의 값은 : " + x );
		System.out.println( "y의 값은 : " + y );
		
		System.out.println( "논리형");
		boolean bb = true ;		//1byte true = 1 , false = 0 
		boolean cc = false ;	//1byte
		System.out.println( bb );
		System.out.println( cc );
		
		System.out.println( "문자열 자료형" );
		String str1 = "안녕하세요" ; //무한참조형
		String str2 = "Hi" ;
		System.out.println( str1 );
		System.out.println( str2 );

		
		
	}

}
