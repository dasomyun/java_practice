package ch06;
/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 31
 * @���� : 11. �ο����� �Է� �޾� ����, ����� ���ϴ� ����ǥ�� �ۼ��ϼ���
 */

import java.util.Scanner;

public class ArrayQuiz11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("�ο����� �Է��ϼ��� : ");
		int inwon = sc.nextInt();
		
		String[] name = new String[inwon];
		int[] kor = new int[inwon];
		int[] mat = new int[inwon];
		int[] eng = new int[inwon];
		int[] tot = new int[inwon];
		float[] avg = new float[inwon];
		
		
		for(int i=0; i<inwon; i++) {
			System.out.print("�̸� : ");
			name[i] = sc.next();
			System.out.print("���� : ");
			kor[i] = sc.nextInt();
			System.out.print("���� : ");
			mat[i] = sc.nextInt();
			System.out.print("���� : ");
			eng[i] = sc.nextInt();
			tot[i] = kor[i] + mat[i] + eng[i] ;
			avg[i] = (float)tot[i]/inwon;
		}
		
		System.out.println("�̸�\t����\t����\t����\t���");
		for(int i=0; i<inwon; i++) {
			System.out.println(name[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + tot[i] + "\t" + avg[i]);
		}
		
		sc.close();
	}

}
