package ch05;
/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 31
 * @내용 : 9. 키보드로부터 정수 3개를 입력 받아서 a,b,c에 저장한 후 가장 큰 값을 출력하세요 
 */

import java.util.Scanner;

public class Quiz9_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 1 : ");
		int a = sc.nextInt();
		
		System.out.print("정수 입력 2 : ");
		int b = sc.nextInt();
		
		System.out.print("정수 입력 3 : ");
		int c = sc.nextInt();
		
		if(a>b) {
			if(a>c){
				System.out.println(a);
			} else if(a<c){
				System.out.println(c);
			}
		} else if(a<b){
			if(b>c) {
				System.out.println(b);
			} else if( b<c) {
				System.out.println(c);
			}
		}
		
		sc.close();
	}

}
