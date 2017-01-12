package ch02;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 12.
 * @내용 : 다중 if 문
 */ 

public class Exam12 {

	public static void main(String[] args) {
		int num = 52 ;
		int value = 24 ;
		
		if ( num > value ) {
			System.out.println( "num > value" );
		} else if ( num == value ) {
			System.out.println( "num == value" );
		} else if (num < value ) {
			System.out.println( "num < value" );
		}
		System.out.println();
		
		String name = "홍길동";
		int kor = 70 ;
		int eng = 88 ;
		int mat = 99 ;
		int tot = kor + eng + mat ;
		float avg = (float) tot / 3 ;
		
		if ( avg >= 90 ) {
			System.out.println("수");
		} else if ( avg >= 80 ) {
			System.out.println("우");
		} else if ( avg >= 70 ) {
			System.out.println("미");
		} else if ( avg >= 60 ) { 
			System.out.println("양");
		} else if ( avg < 60 ) {
			System.out.println("가");
		}
		//if문은 해당 조건을 찾는다면 블락 밖으로 빠져나간다.
		
		String str = "" ;
		
		if ( avg >= 90 ) {
			str = "수";
		} else if ( avg >= 80 ) {
			str = "우";
		} else if ( avg >= 70 ) {
			str = "미";
		} else if ( avg >= 60 ) { 
			str = "양";
		} else if ( avg < 60 ) {
			str = "가";
		}
		System.out.println( "name: " + name + "\t total: " + tot + "\t score: " + str );
	
		
		
		
	}

}
