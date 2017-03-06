package ch02.quiz_for;

/**
 * @Data : 2016. 6. 30.
 * @Author : 좌민혜
 * @Description : 반복문 실습문제 13번 풀이
 *                    문제 13) 1~100까지 계속 더해 나갔을 때, 총합이 500이 넘을 때 반복문에서 빠져 나오세요.
 *								 [출력화면] sum : 528
*/

public class Quiz13 {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1;i<=100;i++){
			sum+=i;
			if(sum > 500) break;
		}
		
		System.out.println("sum:"+sum);
	}
}
