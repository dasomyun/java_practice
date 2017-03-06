package ch02.quiz_control;

import java.io.IOException;

/**
 * @Data : 2016. 6. 30.
 * @Author : 강사
 * @Description : 제어문 실습문제 6번 풀이
 *                    문제 6) 키보드로부터 입력한 문자가 M 또는 m이면 man, W 또는 w이면 woman,
 *							    그 외 이면 ???을 화면상에 표시하는 프로그램을 작성하시오. (if문)
 */

public class Quiz06 {
	public static void main(String[] args) throws IOException{		
		System.out.print("문자를 입력하세요:");
		char ch=(char)System.in.read();
		System.in.read();
		System.in.read();
		
		if(ch=='m' || ch=='M'){
			System.out.println("man");
		}else if(ch=='w' || ch=='W'){
			System.out.println("woman");
		}else{
			System.out.println("???");
		}
	}
}
