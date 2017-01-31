package ch06;
/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 31
 * @내용 : 9. 정수 10개를 입력 받아 배열에 저장한 후, 배열을 검색하여 3의 배수만 골라 출력하는 프로그램을 작성하세요 
 */

import java.util.Scanner ;

public class ArrayQuiz9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		
		int[] array = new int[10];
		
		for(int i=0; i<array.length; i++){
			System.out.print("입력 : ");
			array[i] = sc.nextInt();
			
			if(array[i]%3==0) {
				sum+=array[i];
			}
		}
		System.out.println("sum : " + sum );

		sc.close();
	}

}
