package ch03;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 18.
 * @���� : 
 */

import java.util.Scanner;

public class Exam33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� �Է�");
		int count = sc.nextInt();
		
		int[] array = new int[count];
		
		for(int i=0; i<array.length; i++){
			System.out.print("�� �Է�");
			array[i]=sc.nextInt();
		}
		
		for(int i=0; i<array.length; i++)
			if(array[i] > 20 && array[i]<40){
				System.out.println(array[i]);
			}
		
		sc.close();
	}

}
