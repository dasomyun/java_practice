package ch02.quiz_control;

import java.util.Scanner;

/**
 * @Data : 2016. 6. 30.
 * @Author : 강사
 * @Description : 제어문 실습문제 5번 풀이
 *                    문제 5) 몸무게와 키를 입력 받아 그 사람이 다이어트가 필요한지를 결정하는 프로그램을 작성하세요.
 *                             (단, 몸무게>(키-100)*0.9 이면 다이어트가 필요한 것으로 한다.) (if문)
 */

public class Quiz05 {
	public static void main(String[] args){		
		Scanner sc=new Scanner(System.in);
		System.out.print("키를 입력하세요:");
		float ki=sc.nextFloat();
		
		System.out.print("몸무게를 입력하세요:");
		float w=sc.nextFloat();
		
		if(w > (ki-100)*0.9)
			System.out.println("당신은 다이어트가 필요합니다.");
		else 
			System.out.println("당신은 다이어트가 필요하지 않습니다.");
		
		sc.close();
	}
}
