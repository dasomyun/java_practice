package ch05;
/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 29
 * @���� : 4. ���� ����� � 300�� û�� 200�� ��̰� 100���̶�� �� ��, 
 * 		   �Է��� �ο� ��ü�� ���� ����� ȭ��� ǥ���ϴ� ���α׷��� �ۼ��ϼ��� 
 * 	           �� ��� 5�� �̻��̸� ��̴� 50���̴�.
 */

import java.util.Scanner;

public class Quiz4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("� �ο��� �Է��ϼ��� : ");
		int adult = sc.nextInt();
		System.out.print("û�� �ο��� �Է��ϼ��� : ");
		int adsol = sc.nextInt();
		System.out.print("��� �ο��� �Է��ϼ��� : ");
		int child = sc.nextInt();
		
		int adultp = adult * 300;
		int adsolp = adsol * 200;
		int childp = child * 100;
		
		if(adult > 4) 
			childp = child * 50;
		
		int sum = adultp + adsolp + childp ;
		
		System.out.println("sum : " + sum);
		
		sc.close();
	}

}
