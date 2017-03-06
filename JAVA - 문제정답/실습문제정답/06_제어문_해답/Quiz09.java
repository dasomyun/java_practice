package ch02.quiz_control;

import java.util.Scanner;

/**
 * @Data : 2016. 6. 30.
 * @Author : 강사
 * @Description : 제어문 실습문제 9번 풀이
 *                    문제 9) 키보드로부터 정수3개를 입력 받아서 a, b, c 에 저장한 후 가장 큰 값을 출력하세요.
 */

public class Quiz09 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("input su1:");
		int a=sc.nextInt(); 		 // 6
		
		System.out.print("input su2:");
		int b=sc.nextInt(); 	 	// 4
		
		System.out.print("input su3:");
		int c=sc.nextInt();  		 // 7
		
		int temp=0;
		if(a > b){     			// 6 > 4
			if(a > c){   			// 6 > 7
				temp=a;
			}else{
				temp=c;      		// temp 7
			}
		}else if(b > a){
			if(b > c){
				temp=b;
			}else{
				temp=c;
			}	
		}
		
		System.out.println("a:" + a + "\t" + "b:" + b + "\t" + "c:" + c);
		System.out.println("max:" +temp);
		
		sc.close();
	}

}
