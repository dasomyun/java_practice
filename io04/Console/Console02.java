package io04.Console;

import java.io.BufferedOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 13.
 * @���� : console ����� 
 */

public class Console02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�");
		String str = sc.next(); 	// apple
		
		char ch = str.charAt(2);
		System.out.println("ch : " + ch);
		
		sc.close();
		
		BufferedOutputStream bos = new BufferedOutputStream(System.out);  // System.out : �ܼ�  
		PrintStream ps = new PrintStream(bos);		// ������Ʈ��(����)�� ����� �ʿ�� ����.
		ps.println("��������");
		
	}

}
