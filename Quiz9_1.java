package ch05;
/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 31
 * @���� : 9. Ű����κ��� ���� 3���� �Է� �޾Ƽ� a,b,c�� ������ �� ���� ū ���� ����ϼ��� 
 */

import java.util.Scanner;

public class Quiz9_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� 1 : ");
		int a = sc.nextInt();
		
		System.out.print("���� �Է� 2 : ");
		int b = sc.nextInt();
		
		System.out.print("���� �Է� 3 : ");
		int c = sc.nextInt();
		
		if(a>b) {
			if(a>c){
				System.out.println(a);
			} else if(a<c){
				System.out.println(c);
			}
		} else if(a<b){
			if(b>c) {
				System.out.println(b);
			} else if( b<c) {
				System.out.println(c);
			}
		}
		
		sc.close();
	}

}
