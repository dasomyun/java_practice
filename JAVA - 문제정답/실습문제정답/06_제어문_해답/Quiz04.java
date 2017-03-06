package ch02.quiz_control;

import java.util.Scanner;

/**
 * @Data : 2016. 6. 30.
 * @Author : 강사
 * @Description : 제어문 실습문제 4번 풀이
 *                    문제 4) 버스요금이 어른 300원 청년이 200원 어린이가 100원이라고 할 때, 
 *							   입력한 인원 전체의 버스 요금을 화면상에 표시하는 프로그램을 작성하세요. 
 *							   (단, 어른이 5명 이상 이면 어린이는 50원이다.) (if문)
 */

public class Quiz04 {
	public static void main(String[] args){		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("어른 인원수:");
		int adult=sc.nextInt();
		
		System.out.print("청년 인원수:");
		int student=sc.nextInt();
		
		System.out.print("어린이 인원수 :");
		int child=sc.nextInt();
		
		int sum=0;
		
		if(adult >=5){
			sum=(adult*300)+(student*200)*(child*50);
		}else{
			sum=(adult*300)+(student*200)*(child*100);
		}
		
		System.out.println("출력결과:" + sum);
		
		sc.close();
	}
}










