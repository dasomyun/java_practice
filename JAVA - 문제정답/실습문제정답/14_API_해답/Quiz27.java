package api09.Quiz;


/**
 * @Data : 2016. 8. 2.
 * @Author : 강사
 * @Description :  실습문제 27)
 */

import java.util.Scanner;

public class Quiz27 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("수를 입력하세요:");
		String su=sc.next();
		
		System.out.print("수를 입력하세요:");
		String value=sc.next();
		
		System.out.println("sum:" + (Integer.parseInt(su) + Integer.parseInt(value)));
		
		sc.close();
	}
}
