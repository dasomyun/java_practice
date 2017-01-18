package ch03;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 18.
 * @내용 : 행이 다른 배열 
 */

import java.util.Scanner;

public class Exam38 {

	public static void main(String[] args) {
		int[][] su = new int [][] { {1,2,3},
								{1,2},
								{1,2,3,4} };
								
		for(int i=0; i<su.length; i++){
			for(int j=0; j<su[i].length; j++){
				System.out.print(su[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
		
		int [][] array = new int[3][];
		array[0] = new int [3];
		array[1] = new int [2];
		array[2] = new int [4];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<array.length; i++){
			for(int j=0; j<array[i].length; j++){
				System.out.print("수 : ");
				array[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		for(int i=0; i<array.length; i++){
			for(int j=0; j<array[i].length; j++){
				System.out.print(array[i][j] + "\t");
			}
			System.out.println("\n");
		}
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
