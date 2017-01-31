package ch06;
/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 31
 * @내용 : 10. 일 월 화 수 목 금 토 로 초기화된 문자열 배열 day를 선언하고 사용자로부터 정수를 입력받아 7(배열 day 크기)로
 * 			나눈 나머지를 인덱스로 하여 배열 day에 저장된 문자를 출력하라
 */

import java.util.Scanner ;

public class ArrayQuiz10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] day = new char[] {'일','월','화','수','목','금','토'};
		System.out.print("정수를 입력하세요 >> ");
		int i = sc.nextInt();
		
		System.out.println(day[i%7]);
		sc.close();
	}

}
