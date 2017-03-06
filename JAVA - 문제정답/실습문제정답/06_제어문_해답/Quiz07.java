package ch02.quiz_control;

import java.util.Scanner;

/**
 * @Data : 2016. 6. 30.
 * @Author : 강사
 * @Description : 제어문 실습문제 7번 풀이
 *                    문제 7) 세 정수를 입력 받아 10이하의 수만을 더하여 출력하는 프로그램을 작성하시오. (if문) 
 */

public class Quiz07 {
	public static void main(String[] args){		
		Scanner sc=new Scanner(System.in);
		System.out.print("수를 입력하세요:");
		int a=sc.nextInt();
		
		System.out.print("수를 입력하세요:");
		int b=sc.nextInt();
		
		System.out.print("수를 입력하세요:");
		int c=sc.nextInt();
		
		int sum=0;
		
		if(a < 10)
			sum+=a;
		
		if(b < 10)
			sum+=b;
		
		if(c <10)
			sum+=c;
		
		System.out.println("sum:" + sum);
		sc.close();
	}
}
