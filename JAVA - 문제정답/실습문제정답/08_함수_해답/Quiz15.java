package ch04.quiz;

import java.util.Scanner;

/**
 * @Data : 2016. 7. 4.
 * @Author : 강사
 * @Description :  함수 실습문제 15
 *                     문제 15) 함수를 이용하여 숫자를 입력한 만큼 별을 출력하는 프로그램을 작성하세요. (Call By Value)
 */

public class Quiz15 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("별 수를 입력하세요:");
		int num=sc.nextInt();
		
		subStart(num);
		
		sc.close();
	}
	
	public static void subStart(int num){
		for(int i=1;i<=num;i++){
			System.out.print("*");
		}
	}
}
