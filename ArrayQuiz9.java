package ch06;
/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 31
 * @���� : 9. ���� 10���� �Է� �޾� �迭�� ������ ��, �迭�� �˻��Ͽ� 3�� ����� ��� ����ϴ� ���α׷��� �ۼ��ϼ��� 
 */

import java.util.Scanner ;

public class ArrayQuiz9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		
		int[] array = new int[10];
		
		for(int i=0; i<array.length; i++){
			System.out.print("�Է� : ");
			array[i] = sc.nextInt();
			
			if(array[i]%3==0) {
				sum+=array[i];
			}
		}
		System.out.println("sum : " + sum );

		sc.close();
	}

}
