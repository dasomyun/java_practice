package ch05;
/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 29
 * @���� : 3. �ΰ��� ���� �Է� �޾Ƽ� �� ���� ū ���� ����ϴ� ���α׷��� �ۼ��ϼ��� (if��)
 */

import java.util.Scanner; 

public class Quiz3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ΰ��� ���� �Է��ϼ��� ( ū ���� ��µ˴ϴ� ) : ");
		int i = sc.nextInt();
	
		System.out.print("�ΰ��� ���� �Է��ϼ��� ( ū ���� ��µ˴ϴ� ) : ");
		int j = sc.nextInt();
	
		if(i>j) 
			System.out.println(i);
		else 
			System.out.println(j);
		
		sc.close();
	}

	
}
