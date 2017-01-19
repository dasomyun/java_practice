package ch04;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 19.
 * @내용 : 함수 - Call By Value
 */

public class Exam40 {

	public static void main(String[] args) {
		
		for(int i=0; i<=5; i++){
			fun();
		}
		
		System.out.println("end");
	}
	
	public static void fun(){
		System.out.println("안녕하세요");
	}

}
