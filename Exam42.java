package ch04;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 19.
 * @내용 : 함수 - Call By Value
 */

public class Exam42 {

	public static void main(String[] args) {
		System.out.println("hahaha");
		
		int su = 10;
		sub(su);
		
		System.out.println("hohoho");
		sub(20);
		
		System.out.println("hihihi");
		sub(30);
		
		System.out.println("end");
	}
	
	public static void sub(int x) {
		System.out.println(x);
	}

}
