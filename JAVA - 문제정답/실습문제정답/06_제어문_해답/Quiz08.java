package ch02.quiz_control;

import java.io.IOException;

/**
 * @Data : 2016. 6. 30.
 * @Author : 강사
 * @Description : 제어문 실습문제 8번 풀이
 *                    문제 8) 영문자 하나를 입력 받아서 대소문자로 변환하세요. 
 */

public class Quiz08 {
	public static void main(String[] args) throws IOException{		
		System.out.print("영문대,소문자 하나만 입력하세요.");
		char ch=(char) System.in.read();
		System.in.read();
		System.in.read();
		
		if(ch >= 'A' && ch <='Z'){
			System.out.println("대문자 소문자변환:" + (ch+=32));
		}else if(ch >='a' && ch <='z'){
			System.out.println("소문자 대문자변환:" + (ch-=32));
		}
	}
}
