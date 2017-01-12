package ch01;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 12.
 * @내용 : (cast)연산 또는 (자료형) 연산자
 */

public class Exam04 {

	public static void main(String[] args) {
		
		byte a = 10 ;
		short b = a ;
		System.out.println( "b: " + b );
		
		short c = 30 ;
		byte d = (byte) c ; 	//(cast) 연산 또는 (자료형) 연산자
		System.out.println( "d: " + d );
		
		int x = 100 ;
		long y = x ;
		int z = (int) y;
		System.out.println( "z: " + z );
		
		float i = 24.5f;
		double j = i;
		System.out.println( "j: " + j );
		
		double k = 55.5;
		float p = (float) k ;		
		System.out.println( "p: " + p );
		
		int su = 10 ;	
		float r = (float) su / 3 ;		//int와 int 계산은 컴퓨터는 int로 추출 -> 형변환 필요
		System.out.println( "r : " + r );
		
		int kor = 70 ;
		int eng = 80 ;
		int mat = 90 ;
		int total = kor + eng + mat ;
		float avg = (float) total / 3 ;
		System.out.println( "avg : " + avg ) ;
		
	}

}
