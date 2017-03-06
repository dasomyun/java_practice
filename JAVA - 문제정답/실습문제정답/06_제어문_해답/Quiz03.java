package ch02.quiz_control;

import java.util.Scanner;

/**
 * @Data : 2016. 6. 30.
 * @Author : 강사
 * @Description : 제어문 실습문제 3번 풀이
 *                    문제 3) 두 개의 수를 입력 받아서 그 중 큰 수를 출력하는 프로그램을 작성하세요. (if문) 
 */

public class Quiz03 {
	public static void main(String[] args){		
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요:");
		int first=sc.nextInt();
		
		System.out.print("두번째 수를 입력하세요:");
		int second=sc.nextInt();
		
		if(first > second){
			System.out.println("first=" + first);
		}else {
			System.out.println("second=" + second);
		}
		
		sc.close();
	}
}
