package ch04.quiz;

import java.util.Scanner;

/**
 * @Data : 2016. 7. 4.
 * @Author : 강사
 * @Description :  함수 실습문제 19
 *                     문제 19) 어떤 수 두 개를 입력 받아 교환하는 함수 생성한다. 
 *                                swap 함수는 두 개의 실제 매개변수를 전달함으로써 호출된다. (Call By Value)
 */

public class Quiz19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("수를 입력하세요:");
		int a=sc.nextInt();
		
		System.out.print("수를 입력하세요:");
		int b=sc.nextInt();
		
		swap(a, b);
		
		sc.close();
	}
	
	public static void swap(int a, int b){
		System.out.println("현재값\t\t" + "a:" + a + "\t" + "b:" + b);
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("교환된값\t" + "a:" + a + "\t" + "b:" + b);
	}
}
