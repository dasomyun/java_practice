package ch02;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 16.
 * @내용 : for 문 구구단 
 */

public class Exam19 {

	public static void main(String[] args) {
		
		int dan = 2;
		for(int i = 1; i<=9; i++) {
			System.out.println( dan + "x" + i + "=" + (dan*i) ); 	//(dan*i)에서 괄호를 넣어주지 않으면 문자열로 인식 
		}
		System.out.println( "\n" );
		
		int hap = 0 ;
		for( int i=1; i<=10; i++ ){
			hap = hap + i;
			System.out.print(i);
			
			if(i<=9){
				System.out.print("+");
			}else {
				System.out.print( "=" + hap );
			}
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
