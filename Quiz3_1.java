package ch05;
/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 29
 * @내용 : 3. 두개의 수를 입력 받아서 그 수중 큰 수를 출력하는 프로그램을 작성하세요 (if문)
 */

import java.util.Scanner; 

public class Quiz3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 수를 입력하세요 ( 큰 수가 출력됩니다 ) : ");
		int i = sc.nextInt();
	
		System.out.print("두개의 수를 입력하세요 ( 큰 수가 출력됩니다 ) : ");
		int j = sc.nextInt();
	
		if(i>j) 
			System.out.println(i);
		else 
			System.out.println(j);
		
		sc.close();
	}

	
}
