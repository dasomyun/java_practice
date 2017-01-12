package ch02;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 12.
 * @내용 : 학점계산
 */

public class Exam14 {

	public static void main(String[] args) {
		int score = 84 ;
		String grade = "";
		
		if( score >= 90 ) {
			if ( score >= 97) {
				grade = "A+";
			} else if ( score >= 94 && score <= 96 ) {
				grade = "A0";
			} else if (score <= 93) {
				grade = "A-";
			}
		} else if ( score >= 80 ) {
			if ( score >= 87 ) {
				grade = "B+";
			} else if (score >=84 && score <= 86 ) {
				grade = "B0";
			} else if (score <= 83) {
				grade = "B-";
			}
		} else if ( score >= 70 ) {
			if( score >= 77 ) {
				grade = "C+";
			} else if (score >= 74 && score <= 76 ) {
				grade = "C0";
			} else if ( score <=73) {
				grade = "C=";
			}
		} else if ( score >= 60 ) {
			if( score >= 67 ) {
				grade = "D+";
			} else if (score >= 64 && score <= 66 ) {
				grade = "D0";
			} else if ( score <=63) {
				grade = "D=";
			}			
		} else if ( score <60 ) {
			System.out.println("재수강~.~");
		}
		System.out.println( "학점 : " + score + "\t" + grade );
		
	}

}
