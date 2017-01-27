package ch06;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 25.
 * @내용 : 상속 - 하나의 배열 객체로 관리 
 */

import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		MyPoint[] array = new MyPoint[10];
		
		for(int i=0; i<array.length; i++) {
			System.out.print("1.원	 2.사각형   3. 전체보기	  4.종료 : ");
			int su = sc.nextInt();
			
			if(su == 1) {
				array[i] = new MyCircle();
				array[i].input();
				
			} else if (su == 2){
				array[i] = new MyRect();
				array[i].input();
				
			} else if (su == 3){
				for(int j=0; j<i; j++){
					array[j].output();
				}
				--i;
				
			} else if (su == 4) {
				sc.close();
				//return ;
				System.exit(0);		// 프로그램 종료 
			} else {
				System.out.println("잘못 입력 했음");
				--i;
			}
		}
		
	}

	
	
	
}
