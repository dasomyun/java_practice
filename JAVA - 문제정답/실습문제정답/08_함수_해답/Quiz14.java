package ch04.quiz;

import java.util.Scanner;

/**
 * @Data : 2016. 7. 4.
 * @Author : 강사
 * @Description :  함수 실습문제 14
 *                     문제 14) 함수를 이용하여 "나 사랑해?"를 물어보고, '1'을 입력할 경우 "우린 천생연분인가 봐!!"를,
 *                                '2'를 입력할 경우"꺼져!!" 가 출력되게 하시오. (Call By Value)
 */

public class Quiz14 {
	public static void main(String[] agrs){		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("나 사랑해? (1:YES OR 2:NO):");
		int num=sc.nextInt();
		
		choose(num);
		
		sc.close();
	}
	
	public static void choose(int num){
		if(num==1){
			System.out.println("우리는 천생연분인가봐!!");
		}else if(num==2){
			System.out.println("꺼져!!");
		}
	}
}
