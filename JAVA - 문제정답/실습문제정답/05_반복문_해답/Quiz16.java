package ch02.quiz_for;

/**
 * @Data : 2016. 6. 30.
 * @Author : 강사
 * @Description : 반복문 실습문제 16번 풀이
 *                    문제 16) 10부터 20까지의 합을 구하여 프로그램을 작성하시오. 
 *								 (for문, while문, do-while문을 이용하여 3가지 프로그램 하시오.)
*/

public class Quiz16 {
	public static void main(String[] args){		
		int fSum=0, wSum=0, dSum=0;
		
		// for문
		for(int i=0;i<=20;i++){
			fSum=fSum+i;
		}
		System.out.println("fSum:" + fSum);
		
		// while
		int j=0;
		while(j<=20){
			wSum=wSum+j;
			j++;
		}
		System.out.println("wSum:" + wSum);
		
		// do ~  while
		int k=0;
		do{
			dSum=dSum+k;
			k++;
		}while(k<=20);
		System.out.println("dSum:" + dSum);
	}
}
