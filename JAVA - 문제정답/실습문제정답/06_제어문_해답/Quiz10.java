package ch02.quiz_control;

import java.util.Scanner;

/**
 * @Data : 2016. 7. 1.
 * @Author : 강사
 * @Description :  제어문 실습문제 10번 풀이
 * 						문제 10) 대출금 월이자 계산 하는 프로그램을 작성하시오. 연리가 기간에 따라 
 *                                 다르다고 가정 한다면, 7년 7.25%, 15년 8.5%, 30년 9.0%이다. (소수 이하는 처리하지 않는다.)
 */

public class Quiz10 {
	public static void main(String[] args) {			
		Scanner sc=new Scanner(System.in);
		
		System.out.print("기간을 입력:");
		int year=sc.nextInt();
		
		System.out.print("대출금입력:");
		long money=sc.nextLong();
		
		int result=0;
		if(year==7){
			result=(int) (money*0.0725)/12;
		}else if(year==15){
			result=(int) (money*0.085)/12;
		}else if(year==30){
			result=(int) (money*0.09)/12;
		}
		
		System.out.println("대출금:" + money + "\t" + "월이자:" + result);
		sc.close();
	}
}
