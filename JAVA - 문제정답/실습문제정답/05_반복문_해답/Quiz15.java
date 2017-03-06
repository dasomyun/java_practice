package ch02.quiz_for;

/**
 * @Data : 2016. 6. 30.
 * @Author : 강사
 * @Description : 반복문 실습문제 15번 풀이
 *                    문제 15) 두 개의 주사위을 던졌을 때, 눈의 합이 6이 되는 경우 수를 출력하는
 *                               프로그램을 작성하세요. 
*/

public class Quiz15 {
	public static void main(String[] agrs){
		
		for(int i=1;i<=6;i++){
			for(int j=1;j<=6;j++){
				if(i+j==6){
					System.out.println(i + "+" + j + "=" + (i+j));
				}
			}
		}
	}
}
