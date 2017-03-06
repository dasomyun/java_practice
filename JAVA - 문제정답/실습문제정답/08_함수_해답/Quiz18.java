package ch04.quiz;

import java.util.Scanner;

/**
 * @Data : 2016. 7. 4.
 * @Author : 강사
 * @Description :  함수 실습문제 18
 *                     문제 18) 어떤 수 두 개를 입력 받아 max 함수를 생성하고 호출하세요. 
 *                                max 함수는 두 개의 숫자 중 최대값을 찾는 함수 입니다. (Call By Value)
 */

public class Quiz18 {
	public static void main(String[] agrs){	
		Scanner sc=new Scanner(System.in);
		System.out.print("수를 입력하세요:");
		int x=sc.nextInt();
		
		System.out.print("수를 입력하세요:");
		int y=sc.nextInt();
		
		max(x, y);
		
		sc.close();
	}
	
	public static void max(int x, int y){
		if(x > y)
			System.out.println(x + "가 큽니다.");
		else 
			System.out.println(y + "가 큽니다.");
	}
}










