package ch04;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 19.
 * @���� : �Լ� - Call By Value 
 */

import java.util.Scanner;

public class Exam45 {

	public static void main(String[] args) {	//�� ���� �ٱ��� �� ��Ʈ�� 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է� : ");
		String name =sc.next();
		
		System.out.print("�ֹι�ȣ �Է�(�������) : ");
		String juminBunho=sc.next(); 	//123456-1234567
		
		System.out.print("�ּ��Է� :");
		String address = sc.next();
		
		output(name, juminBunho, address);
		
		sc.close();
	}
	
	public static void output(String n, String j, String a){
		System.out.println("�̸� : " + n);
		System.out.println("�ֹι�ȣ : " + j);
		System.out.println("�ּ� : " + a);
		
		
	}
	

}
