package ch03;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 18.
 * @���� : 2���� �迭 ��,���
 */

import java.util.Scanner;

public class Exam36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum=0;
		int[][] array = new int[3][2];
		
		//�Է�
		for(int i=0; i<array.length; i++){
			for(int j=0; j<array[0].length; j++){
				System.out.print("�� �Է� : ");
				array[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		//���
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
