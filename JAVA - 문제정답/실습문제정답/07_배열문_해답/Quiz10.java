package ch03.quiz;

import java.util.Scanner;

/**
 * @Data : 2016. 7. 3.
 * @Author : 강사
 * @Description :  배열 실습문제 10번
 * 					    문제 10) '일', '월', '화', '수', '목', '금', '토' 로 초기화된 문자열 배열 day를 선언하고 사용자로부터
 *                                 정수를 입력받아 7(배열 day 크기)로 나눈 나머지를 인텍스로 하여 배열 day에 저장된 문자를 출력하라.
 */

public class Quiz10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] day=new char[] {'일', '월', '화', '수', '목', '금', '토'};
	
		System.out.print("정수를 입력하세요 >> ");
		int su=sc.nextInt();
		
		for(int i=0;i<day.length;i++){
			System.out.println(su%day.length);
			if(su%day.length==i){   		// 15%7=1, 26%7=5
				System.out.println(day[i]);
			}
		}
		sc.close();
	}
}
