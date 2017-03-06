package ch02.quiz_control;

import java.util.Scanner;

/**
 * @Data : 2016. 6. 30.
 * @Author : 강사
 * @Description : 제어문 실습문제 1번 풀이
 *                    문제 1)  숫자 하나를 입력 받아 그 수가 1이면 “남성”, 2이면 “여성” 이라는 글자를 출력하는 
 *								프로그램을 작성하세요. (switch ~ case문)
 */

public class Quiz01 {
	public static void main(String[] args){	
		Scanner sc=new Scanner(System.in);
		System.out.print("성별을 입력하세요:");
		int su=sc.nextInt();
		
		if(su==1){
			System.out.println("남자");
		}else if(su==2){
			System.out.println("여자");
		}	
		
		sc.close();
	}
}
