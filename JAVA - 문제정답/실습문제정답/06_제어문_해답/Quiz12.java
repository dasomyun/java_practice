package ch02.quiz_control;

import java.util.Scanner;

/**
 * @Data : 2016. 7. 1.
 * @Author : 강사
 * @Description :  제어문 실습문제 12번 풀이
 * 						문제 12) 10개의 정수를 입력 받아서 양수와 음수의 개수를 구하는 
 *                                프로그램을 작성하세요. (for문)
 */

public class Quiz12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int plusCount=0, minusCount=0;
		
		for(int i=0;i<10;i++){
			System.out.print("수를 입력하세요:");
			int su=sc.nextInt();
			if(su > 0){
				plusCount++;
			}else{
				minusCount++;
			}
		}

		System.out.println("양수개수:" + plusCount);
		System.out.println("음수개수:" + minusCount);
		
		sc.close();
	}
}
