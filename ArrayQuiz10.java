package ch06;
/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 31
 * @���� : 10. �� �� ȭ �� �� �� �� �� �ʱ�ȭ�� ���ڿ� �迭 day�� �����ϰ� ����ڷκ��� ������ �Է¹޾� 7(�迭 day ũ��)��
 * 			���� �������� �ε����� �Ͽ� �迭 day�� ����� ���ڸ� ����϶�
 */

import java.util.Scanner ;

public class ArrayQuiz10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] day = new char[] {'��','��','ȭ','��','��','��','��'};
		System.out.print("������ �Է��ϼ��� >> ");
		int i = sc.nextInt();
		
		System.out.println(day[i%7]);
		sc.close();
	}

}
