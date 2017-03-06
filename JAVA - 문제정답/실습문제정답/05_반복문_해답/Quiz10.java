package ch02.quiz_for;

/**
 * @Data : 2016. 6. 30.
 * @Author : 강사
 * @Description : 반복문 실습문제 10번 풀이
 *                    문제 10) for문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성하세요.
 */

public class Quiz10 {
	public static void main(String[] args) {
		for(int i=0;i<=5;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
