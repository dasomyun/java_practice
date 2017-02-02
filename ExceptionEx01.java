package ch10.exception;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 2.
 * @���� : ����ó��(������ �߻� �� �� �ִ� �κ��� �̸� ó���� �ִ� ��) - ArithmeticException
 * 			���� : try ~ catch (���� ó�� Ŭ����) ~ finally
 */

//�Լ��ȿ� ����ó�� �뷫 2~3�� 

import java.util.Scanner;

public class ExceptionEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x�� �Է��ϼ��� : ");
		int x = sc.nextInt();
		
		System.out.print("y�� �Է��ϼ��� : ");
		int y = sc.nextInt();
		
	try {	
		int div = x/y;
		System.out.println("������ ��� ������ : " + div);
	} catch(ArithmeticException obj) {		//obj�� ���������� ����ִ� // obj�� ��°�� - ��𿡼� ���������� �� �� //Ŭ���̾�Ʈ���Դ� obj�� ������������ alertâ�� ��������
		System.out.println("0���� ���� �� �����ϴ�");
	}
		
		
		sc.close();
	}

}
