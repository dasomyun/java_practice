package ch05;
/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 29
 * @내용 : 4. 버스 요금이 어른 300원 청년 200원 어린이가 100원이라고 할 때, 
 * 		   입력한 인원 전체의 버스 요금을 화면상에 표시하는 프로그램을 작성하세요 
 * 	           단 어른이 5명 이상이면 어린이는 50원이다.
 */

import java.util.Scanner;

public class Quiz4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("어른 인원을 입력하세요 : ");
		int adult = sc.nextInt();
		System.out.print("청년 인원을 입력하세요 : ");
		int adsol = sc.nextInt();
		System.out.print("어린이 인원을 입력하세요 : ");
		int child = sc.nextInt();
		
		int adultp = adult * 300;
		int adsolp = adsol * 200;
		int childp = child * 100;
		
		if(adult > 4) 
			childp = child * 50;
		
		int sum = adultp + adsolp + childp ;
		
		System.out.println("sum : " + sum);
		
		sc.close();
	}

}
