package ch04;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 20.
 * @내용 : local 변수 ( 지역변수 ) : 한 지역에서만 사용되는 변수 
 * 		   static 변수 : 프로그램이 종료될때 까지 사용하는 전역 의미
 */

public class Exam56 {
	
	public static int count = 0;

	public static void main(String[] args) {
		sub(10);
		sub(20);
		sub(30);

	}
	
	public static void sub(int su) {
		System.out.println("su : " + su);
		System.out.println("count : " + ++count);
	}

}
