package api01.System;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 2.
 * @���� : System Ŭ���� : System�� ���õ� Ŭ�����̴�.
 */

public class ASystem {

	public static void main(String[] args) {
		PrintStream ps = System.out;
		ps.println("API �����Դϴ�.");
		ps.println(10);
		ps.println(24.5f);
		System.out.println("�����ϰ� ���\n\n");
		
		System.out.print("���� �Է� : ");
		InputStream is = System.in;
		
		try {
			int su = is.read();
			char ch = (char) su;
			is.read();	//Enter \n \r�� ���� 
			is.read();
			
			System.out.println(ch);
		} catch (IOException e) {
			System.out.println("Error");
		}
		
		Scanner sc = new Scanner(is);
		while(true) {
			System.out.print("�� �Է� : ");
			int su = sc.nextInt();
			
			if(su==5){
				System.out.println("���α׷� ����");
				sc.close();
				//break;
				//return;   �ش��Լ�(main�Լ�) ������ ��������
				System.exit(0); 		//�ý����� �����
			}
			
			System.out.println("su : " + su);
		}
		
		// System.out.println("END----------");
		
	}

}