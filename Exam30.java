package ch02;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 17.
 * @내용 : 
 */
import java.util.Scanner;
import java.io.IOException;

public class Exam30 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int dan = 0;// , int i = 0 ;
		char loop = 0;
		
		do {
			System.out.print("단을 입력하세요 : ");
			dan = sc.nextInt();
			for(int i=1; i<=9; i++) {
				System.out.println(dan+ "x" + "="+ (dan*i));
			}
			System.out.println();
			System.out.print("또할래?(Y/y): ");
			loop=(char) System.in.read(); //y
				
		} while(loop =='Y' || loop=='y');

		sc.close(); //
		
	}

}
