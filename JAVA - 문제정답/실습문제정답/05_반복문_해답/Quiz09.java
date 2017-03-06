package ch02.quiz_for;

/**
 * @Data : 2016. 6. 30.
 * @Author : 강사
 * @Description : 반복문 실습문제 9번 풀이
 *                    문제 9) 방정식 2x+4y=10의 모든 해를 구하시오. 단 x와y는 정수이고 각각의 범위는
 *  						   (단 0<=x<=10, 0<=y<=10) 이다. 
*/

public class Quiz09 {
	public static void main(String[] args){
		
		for(int x=0;x<=10;x++){
			for(int y=0;y<=10;y++){
				if(2*x+4*y==10){
					System.out.println("x=" + x + ", y=" + y);
				}
			}
		}
	}
}
