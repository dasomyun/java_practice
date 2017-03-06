package ch02.quiz_control;

import java.util.Scanner;

/**
 * @Data : 2016. 7. 1.
 * @Author : 강사
 * @Description :  제어문 실습문제 13번 풀이
 *						실습문제 13) 연도를 입력 받아 윤년인지 아닌지를 구별하는 프로그램을 작성해 보자.
 *                                      윤년은 일반적으로 4년에 한번씩 돌아오는데 그 중 100으로 나누어 떨어지는 해는
 *                                      윤년이 아니다. 그러나 100으로 나누어 떨어지는 해 중 400으로 나누어 떨어지는
 *                                      해는 윤년이다
 */

public class Quiz13 {
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		System.out.print("연도를 입력하세요:");
		int year=sc.nextInt();
		
		if((year%4)==0 && (year%100) !=0 || (year%400)==0){
			System.out.println(year + "년도는 윤년입니다.");
		}else{
			System.out.println(year + "년도는 평년입니다.");
		}
		
		if((year%4)==0){
			if((year%100) !=0 || (year%400)==0){
				System.out.println(year + "년도는 윤년입니다.");
			}
		}else{
			System.out.println(year + "년도는 평년입니다.");
		}
		sc.close();
	}
}
