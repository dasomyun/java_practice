package ch02.quiz_for;

/**
 * @Data : 2016. 6. 30.
 * @Author : 강사
 * @Description : 반복문 실습문제 14번 풀이
 *                    문제 14) 다음과 같이 출력하세요. (for문)
*/

public class Quiz14 {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
