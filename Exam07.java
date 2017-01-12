package ch01;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 12.
 * @내용 : 
 */

public class Exam07 {

	public static void main(String[] args) {
	byte a = 10 ;
	byte b = 2 ; 
	//0000 1010
	//0000 0010
	
	System.out.println( "a&b : " + (a&b) );	//0000 0010  2
	System.out.println( "a|b : " + (a|b) ); 	//0000 1010 10
	System.out.println( "a^b: " + (a^b) ); 	//0000 1000 8
	
	int x = 15;
	boolean y = x > 10 && x < 20 ;	//이런 연산을 볼 때, 우선순위를 따져보기 
	boolean z = x == 10 || x == 15 ;
	System.out.println(y);
	System.out.println(z);
		
		
		
		
		
		
	}

}
