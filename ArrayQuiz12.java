package ch06;
/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 31
 * @���� : 12. 5���� ���� �Է� �޾� ū ������� �����ϴ� ���α׷��� ������
 */

import java.util.Scanner;

public class ArrayQuiz12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] su = new int[5];
		
		int a = su[0];
		
		for(int i=0; i<su.length; i++) {
			System.out.print("�� �Է� :");
			if(a <su[i])
				a=su[i];
		}
	
		
		
		sc.close();
	}

}
