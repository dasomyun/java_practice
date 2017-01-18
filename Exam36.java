package ch03;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 18.
 * @내용 : 2차원 배열 입,출력
 */

import java.util.Scanner;

public class Exam36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum=0;
		int[][] array = new int[3][2];
		
		//입력
		for(int i=0; i<array.length; i++){
			for(int j=0; j<array[0].length; j++){
				System.out.print("수 입력 : ");
				array[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		//출력
		for(int i=0; i<array.length; i++){
			for(int j=0; j<array[i].length; j++){
				System.out.print(array[i][j] + "\t");
				sum = sum + array[i][j];
			}
			System.out.println();
		}
		System.out.println("sum:" + sum );
		
		sc.close();
		
	}

}
