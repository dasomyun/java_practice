package ch04;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 19.
 * @내용 : 함수 - Call By Name 
 */

public class Exam39 {

	public static void main(String[] args) {
		System.out.println("hahaha");
		sub();
		System.out.println("hohoho");
		sub();
		System.out.println("end------------------");		
	}

	public static void sub() {
		System.out.println("안녕하세요");
	}
	
	

}
