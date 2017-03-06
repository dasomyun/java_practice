package ch02.quiz_for;

/**
 * @Data : 2016. 6. 30.
 * @Author : 강사
 * @Description : 반복문 실습문제 11번 풀이
 *                    문제 11) 1~20까지의 정수 중에서 2의 배수 또는 3의 배수가 아닌 수의 총합을 구하시오.
 *								[출력화면] sum:174
 */

public class Quiz11 {
	public static void main(String[] args){
		int sum=0;
		
		for(int i=1;i<=20;i++){
			if(i%2!=0 || i%3!=0) {
				// System.out.println(i);
				sum+=i;
			}
		}
		
		System.out.println("sum:" + sum);
	}
}
