package ch02.quiz_control;

import java.util.Scanner;

/**
 * @Data : 2016. 7. 1.
 * @Author : 강사
 * @Description :  제어문 실습문제 11번 풀이
 * 						문제 11) 임의의 정수를 입력 받아서 총합과 평균을 구하세요.
 */

public class Quiz11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("몇개의 수를 입력받겠습니까?");
		int suCount=sc.nextInt();
		
		int sum=0;		
		for(int i=0;i<suCount;i++){
			System.out.print("수를 입력하세요:");
			int su=sc.nextInt();
			sum+=su;
		}
		
		float avg=(float) sum/3;
		System.out.println("sum:" + sum + "\t" + "avg:" + avg);
		
		sc.close();
	}
}
