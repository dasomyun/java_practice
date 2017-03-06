package ch02.quiz_control;

import java.util.Scanner;

/**
 * @Data : 2016. 6. 30.
 * @Author : 강사
 * @Description : 제어문 실습문제 2번 풀이
 *                    문제 2) 어떤 수를 입력해서 그 수가 10보다 크고 20보다 작으면 출력하는 프로그램을 
 *								작성하세요. (if문)
 */

public class Quiz02 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("수를입력하세요:");
		int su=sc.nextInt();
		
		if(su > 10 && su <20){
			System.out.println("su:" + su);
		}
			
		sc.close();
	}
}
