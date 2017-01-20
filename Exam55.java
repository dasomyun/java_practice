package ch04;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 20.
 * @내용 : local 변수 ( 지역변수 ) : 한 지역에서만 사용되는 변수 
 * 		   static 변수 : 프로그램이 종료될때 까지 사용하는 전역 의미
 */

public class Exam55 {

	public static int value = 50;	// static 변수
	
	public static void main(String[] args) {
		System.out.println("main : " + value);
		aa(10);
		
		int su = 10;
		{
			int x = 88;	// 지역변수
			System.out.println("su : " + su);
			System.out.println( "x : " + x);
		}
		// System.out.println("x : " + x); error
		
	}

	public static void aa ( int su ) {
		System.out.println("aa : " + value);
		
		value = 77;
		System.out.println("aa : " + value);
	}
	
}
