package ch10.exception;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 2.
 * @���� : ����ó�� - InputMismatchException , ArithmeticException
 * 			
 */
//java.lang.object ��Ű���� default�� �־��� �־ import ���ص� �� 

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("x�� �Է��ϼ��� : ");
			int x = sc.nextInt();	
			
			System.out.print("y�� �Է��ϼ��� : ");
			int y = sc.nextInt();
			
			int div = x/y;
			System.out.println("������ ��� ������ : " + div);
			
		} catch (ArithmeticException obj) {		
			System.out.println("0���� ���� �� �����ϴ�");
		} catch (InputMismatchException obj) {
			System.out.println("������ �Է� �Ͻ� �� �ֽ��ϴ�");
		}
				
		sc.close();
	}

}
