package ch02.quiz_control;

import java.util.Scanner;

/**
 * @Data : 2016. 7. 1.
 * @Author : 강사
 * @Description :  제어문 실습문제 14번
 *						실습문제 14) 369게임의 일부를 작성해보자. 1~99까지의 정수를 입력받고 수에 3,6,9중 
 *										하나가 있는 경우에는 “박수짝”, 두 개 있는 경우는 “박수 짝짝”, 하나도 없으면 “박수 없음”을 
 *										출력하는 프로그램을 작성하라. 예를 들면, 13인 경우 “박수짝”, 36인 경우 “박수 짝짝”, 
 *										5인 경우 “박수 없음”을 출력하면 된다.
 */

public class Quiz14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하세요 >>>");
		
		int num=sc.nextInt();
		int first=num/10;
		int second=num%10;
		System.out.println(first + "\t" + second);
		
		switch(first){
		case 3: case 6: case 9:
			if(second==3 || second==6 || second==9){
				System.out.println("박수 짝짝");
			}else{
				System.out.println("박수 짝");
			}
			break;
		default:
			if(second==3 || second==6 || second==9){
				System.out.println("박수짝");
			}else{
				System.out.println("박수없음");
			}	
		}
		
		sc.close();
	}

}
