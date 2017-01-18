package ch03;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 18.
 * @내용 : 
 */

import java.util.Scanner;

public class Exam33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열수 입력");
		int count = sc.nextInt();
		
		int[] array = new int[count];
		
		for(int i=0; i<array.length; i++){
			System.out.print("수 입력");
			array[i]=sc.nextInt();
		}
		
		for(int i=0; i<array.length; i++)
			if(array[i] > 20 && array[i]<40){
				System.out.println(array[i]);
			}
		
		sc.close();
	}

}
