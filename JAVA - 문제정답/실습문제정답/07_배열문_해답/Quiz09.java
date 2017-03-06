package ch03.quiz;

import java.util.Scanner;

/**
 * @Data : 2016. 7. 3.
 * @Author : 강사
 * @Description :  배열 실습문제 9번
 * 					    문제 9) 정수를 10개 입력 받아 배열에 저장한 후, 배열을 검색하여 3의 배수만 골라 출력하는
 *                               프로그램을 작성하세요.
 */

public class Quiz09 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array=new int[10];
		
		System.out.print("정수 10개 입력 >>" );
		for(int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<array.length;i++){
			if(array[i]%3==0){
				sum+=array[i];
			}
		}
		System.out.println("sum:" + sum);

		sc.close();
	}
}
