package ch04;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 19.
 * @���� : �Լ� - Call By Value�� �̿��� ��Ģ���� 
 */
import java.util.Scanner;
public class Exam44 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է��ϼ��� : ");
		int value = sc.nextInt();
		
		System.out.println("�ι�° ���� �Է��ϼ��� : ");
		int su = sc.nextInt();
		
		hap(value, su);
		cha(value, su);
		mul(value, su);
		div(value, su);
		
		sc.close();
	}
	
	public static void hap(int value, int su) {
		System.out.println("�� : " + (value+su));
	}
	
	public static void cha(int value, int su) {
		System.out.println("�� : " + (value-su));
	}
	
	public static void mul(int value, int su) {
		System.out.println("�� : " + (value*su));
	}
	
	public static void div(int value, int su){
		System.out.println("������: " + ((float)value/su));
	}

}
