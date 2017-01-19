package ch04;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 19.
 * @내용 : 함수 - Call By Value
 */

public class Exam43 {

	public static void main(String[] args) {
		sub(2,5);
		//sub("hi". "baboo"); error!!
		System.out.println("hahaha");
		System.out.println();
		
		sub(3,3);
		System.out.println("배고파요");
		System.out.println();
		
		sub(2,10);
		System.out.println("ㅎㅎㅎㅎ");
		System.out.println();
	}
	
	public static void sub(int x, int y){
		for(int i=0; i<x; i++){
			for(int j=0; j<y; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
