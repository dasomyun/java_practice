package ch02.quiz_for;

/**
 * @Data : 2016. 6. 30.
 * @Author : 강사
 * @Description : 반복문 실습문제 12번 풀이
 *                    문제 12) 0.01 ~ 1 까지 0.01씩 증가하여 연속적인 수를 더하는 프로그램을 작성하세요.
*								[출력화면] sum:50.499985
 */

public class Quiz12 {
	public static void main(String[] args) {
		float sum=0.0f;
		
		for(float i=0.01f; i<=1.0f; i=i+0.01f){
			sum +=i;
		}
		
		System.out.println("sum:" + sum);
	}
}
