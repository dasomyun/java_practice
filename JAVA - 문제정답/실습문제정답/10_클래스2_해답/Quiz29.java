package ch05.quiz02;

/**
 * @Data : 2016. 7. 12.
 * @Author : 좌민혜
 * @Description :  클래스2- 실습문제 29) 사칙연산
 */

import java.util.Scanner;
import java.io.IOException;

class Yonsan{
	private int su, value;
	private char buho;
	private int resultInt;
	private float resultFloat;
	private Scanner sc;
	
	public void input() throws IOException{
		sc=new Scanner(System.in);
		
		do{
			System.out.print("수를 입력하세요:");
			su=sc.nextInt();
			
			System.out.print("부호를 입력하세요:");
			buho=(char)System.in.read();
			System.in.read();
			System.in.read();
			
			System.out.print("수를 입력하세요:");
			value=sc.nextInt();
		}while(buho !='+' && buho !='-' && buho !='*' && buho !='/' );
	}
	
	public void yonsan(){
		if(buho=='+')
			resultInt=su+value;
		else if(buho =='-')
			resultInt=su-value;
		else if(buho =='*')
			resultInt=su*value;
		else if(buho =='/'){
			if(value==0) value=1;
			resultFloat=(float)su/value;
		}
	}
	
	public void disp(){
		if(buho=='/')
			System.out.println(su + "" + buho + value + "=" + resultFloat);
		else
			System.out.println(su + "" + buho + value + "=" + resultInt);
			
	}
}

public class Quiz29 {
	public static void main(String[] ar)throws IOException{
		Yonsan y=new Yonsan();
		y.input();
		y.yonsan();
		y.disp();
	}
}
