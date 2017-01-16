package ch02;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 16.
 * @내용 : switch 문
 */

public class Exam16 {

	public static void main(String[] args) {
		char a = 'B';
		
		switch(a) {
		case 'W':		//if(a=='W' || a =='w')
		case 'w':
			System.out.println("White");
			break;
		case 'B':
		case 'b':
			System.out.println("Blue");
			break;
		case 'Y':
		case 'y':
			System.out.println("Yellow");
			break;
		case 'R':
		case 'r':
			System.out.println("Red");
			break;
		}
		
		System.out.println("\n");
		
		String name = "윤다솜";
		String grade = "BB";
		String memberLevel = "" ; // int a = 0; double b=0.0; 은 되지만 char c=''은 안됨 char c=0으로 초기화
		
		switch(grade) {
		case "AA":
		case "aa":
			memberLevel="정회원";
			break;
		case "BB":
		case "bb":
			memberLevel="준회원";
			break;
		case "CC":
		case "cc":
			memberLevel="손님";
			break;
		}
		
	System.out.println(name + " 회원님은 " + memberLevel + " 입니다.");
	
	// double value = 15.5;
	// switch(value){ } 실수형은 조건식이 될 수 없다.
	
	// int su = 10 ;
	// switch(su > 10){ } error
	
	}

}
