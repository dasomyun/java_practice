package ch02;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 16.
 * @내용 : do while 문
 */

public class Exam23 {

	public static void main(String[] args) {

		int x = 1 ;
		
		do {
			System.out.print(x + "\t");
			x++;
		} while(x<=10);
		
		System.out.println("\n");
		
		int y = 1;
		int sum = 0;
	
		do { 
			sum += y;
			y++;
		} while(y<=10);
		
		System.out.println("sum : " + sum);
		
		
		
		
		
	}

}
