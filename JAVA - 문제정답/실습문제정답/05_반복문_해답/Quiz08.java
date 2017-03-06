package ch02.quiz_for;

/**
 * @Data : 2016. 6. 30.
 * @Author : 강사
 * @Description : 반복문 실습문제 08번 풀이
 *                    문제 8) for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 
 *                              프로그램을  작성하세요. [출력화면] sum:1683
 */

public class Quiz08 {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1;i<=100;i++){
			if(i%3==0){
				sum +=i;
			}
		}
		
		System.out.println("sum:"  + sum);
	}
}