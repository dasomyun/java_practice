package ch02;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 12.
 * @내용 : if else 문 
 */

public class Exam11 {

	public static void main(String[] args) {
		int score = 50 ; 
		
		if ( score >= 50 ) {
			System.out.println( "합격 하셨습니다." );
			System.out.println( "점수는 " + score + "입니다" );
		}
		else {
			System.out.println("불합격 하셨습니다." );
			System.out.println( "점수는 " + score + "입니다." );
		}
		
		System.out.println();
		
		String name = "조인성";
		int age = 27 ;
		if ( age >= 20 && age < 30 ) {
			System.out.println("저는 " + name + "입니다 " + age + "대라서 행복합니다" );
		} else {
			System.out.println( "20대가 아닙니다" );
		
		}
		
	}

}
