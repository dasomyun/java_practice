package ch03.quiz;

import java.util.Scanner;

/**
 * @Data : 2016. 7. 3.
 * @Author : 강사
 * @Description :  배열 실습문제 12번
 *                      문제 12) 5개의 수를 입력 받아 큰 순서대로 나열하는 프로그램을 만들어 보자.
 */

public class Quiz12 {
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		int[] su=new int[5];
		
		for(int i=0;i<su.length;i++){
			System.out.print("수 입력:");
			su[i]=sc.nextInt();    					// 10 2 77 88 6
		}
		
		for(int i=0;i<su.length;i++){       
			for(int j=i+1;j<su.length;j++){
				if(su[i] < su[j]){         			// 10<2, 10<77, 77<88
					int temp=su[i];     			//         temp 10  77
					su[i]=su[j];					//         su[i] 77 88
					su[j]=temp;        			//         su[j] 10 
				}
			}
		}
		
		for(int i=0;i<su.length;i++){
			System.out.print(su[i] + "\t");
		}
		
		sc.close();
	}
}
