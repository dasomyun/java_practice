package ch02;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 17.
 * @���� : 1byte �Է¹�� (A, a, &)
 */

import java.io.IOException;

public class Exam29 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("���� �Է� : ");
		char x = (char)System.in.read();//ASCII�ڵ� ������ ��ȯ���ִϱ� CHAR�� ����ȭ �ؾ��Ѵ�. �����(RUNTIME)�� ���� �������� 
		System.in.read(); //\r - ���� ó��( ���ʹ� \r+\n ����)
		System.in.read(); //\n ó��
		System.out.println("x: "+ x);
		
		System.out.print("�� ���� �Է� : ");;
		char y = (char) System.in.read();
		System.in.read();//���Ͱ� ó��
		System.in.read();//���Ͱ� ó��
		System.out.println("y : " + y );
		
		System.out.print("�Ƕ� ���� �Է� : ");
		char z = (char)System.in.read();
		System.in.read();
		System.in.read();
		System.out.println("z: " + z);
	}

}
