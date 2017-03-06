package api09.Quiz;


/**
 * @Data : 2016. 8. 2.
 * @Author : 강사
 * @Description :  실습문제 26)  toString(), equals() 오버라이딩
 */

import java.util.Scanner;

public class Quiz26 {
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		int answer=(int) (Math.random() * 10) + 1;
		System.out.println("answer:" + answer);
		
		int input=0;
		do{
			System.out.print("\n 1과 10사이의 값을 입력하세요:");
			input=sc.nextInt();
			
			if(answer > input){
				System.out.println("더 큰수를 입력하세요.");
			}else if(answer < input){
				System.out.println("더 작은수를 입력하세요.");
			}else{
				System.out.println("맞췄습니다." + "[입력값:" + input  + ", 랜덤값:" + answer + "]");
				break;
			}
			
		}while(true);

		sc.close();
	}
}
