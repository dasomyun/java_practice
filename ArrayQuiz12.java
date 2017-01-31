package ch06;
/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 31
 * @내용 : 12. 5개의 수를 입력 받아 큰 순서대로 나열하는 프로그램을 만들어보자
 */

import java.util.Scanner;

public class ArrayQuiz12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] su = new int[5];
		
		int a = su[0];
		
		for(int i=0; i<su.length; i++) {
			System.out.print("수 입력 :");
			if(a <su[i])
				a=su[i];
		}
	
		
		
		sc.close();
	}

}
