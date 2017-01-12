package ch01;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 12.
 * @내용 : 연산자 우선순위
 */

public class Exam03 {

	public static void main(String[] args) {
		int x = 10 ;
		x++ ;	//11 전위형 연산자(하나씩 증가)
		++x ;	//12 후위형 연산자
		System.out.println(x); //12
		
		--x ;	//11 전위형 연산자(하나씩 감소)
		x-- ;	//10 후위형 연산자
		System.out.println(x);
		
		int y = 20 ;
		int z = y++ ;
		System.out.println( y + "\t" + z ); // y = 21; z = 21;
		
		int a = 10;
		int b = 20;
		int c = a++ + ++b;		//우선순위가 높은 연산자 : 전위형연산자(++b) , 산술연산자(+) , 대입연산자(=) , 후위형연산자(a++)
		System.out.println(c);
		System.out.println();
				
		int d = 30;
		System.out.println( "d: " + d++ );

	}

}
