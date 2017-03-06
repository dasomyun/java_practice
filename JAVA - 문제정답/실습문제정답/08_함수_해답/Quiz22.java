package ch04.quiz;

import java.util.Scanner;
import java.io.IOException;

/**
 * @Data : 2016. 7. 4.
 * @Author : 강사
 * @Description :  함수 실습문제 21
 *                     문제 21) 계산기(사칙연산) 프로그래밍 작성하세요. 함수는 덧셈, 곱셈, 뺄셈, 
 *                                나눗셈 함수가 존재 합니다. (Call By Value)
 */

public class Quiz22 {
	public static void main(String[] ar)throws IOException{
		Scanner sc=new Scanner(System.in);
		int su, value;
		char buho;
		
		do{
			System.out.print("Input Su:");
			su=sc.nextInt();
			
			System.out.print("Input buho:");
			buho=(char)System.in.read();
			System.in.read();
			System.in.read();
			
			System.out.print("Input Value:");
			value=sc.nextInt();
			
		}while(buho !='+' && buho !='-' && buho !='*' && buho !='/');
		
		if(buho=='+'){
			hap(su, buho, value);
		}else if(buho=='-'){
			cha(su, buho, value);
		}else if(buho=='*'){
			mul(su, buho, value);
		}else if(buho=='/'){
			div(su, buho, value);
		}
		
		sc.close();
	}
	
	public static void hap(int su, char buho, int value){
		System.out.println(su + "" + buho + value + "=" + (su+value));
	}
	
	public static void cha(int su, char buho, int value){
		System.out.println(su + "" + buho + value + "=" + (su-value));
	}

	public static void mul(int su, char buho, int value){
		System.out.println(su + "" + buho + value + "=" + (su*value));
	}
	
	public static void div(int su, char buho, int value){
		if(value==0) value=1;
		System.out.println(su + "" + buho + value + "=" + ((float)su/value));
	}
}