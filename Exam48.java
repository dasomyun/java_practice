package ch04;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 19.
 * @���� : �Լ� - Call By Value ~ Return�� �̿��� ��Ģ���� 
 */
import java.util.Scanner;
public class Exam48 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է��ϼ��� : ");
		int value = sc.nextInt();
		
		System.out.println("�ι�° ���� �Է��ϼ��� : ");
		int su = sc.nextInt();
		
		int h = hap(value, su);
		int c = cha(value, su);
		int m = mul(value, su);
		float d = div(value, su);
		
		System.out.println("�� : " + h + "\n�� : " + c + "\n�� : " + m + "\n������ : " + d);
		sc.close();
	}
	
	public static int hap(int value, int su) {
		return value+su;
	}
	
	public static int cha(int value, int su) {
		return value-su;
	}
	
	public static int mul(int value, int su) {
		return value*su;
	}
	
	public static float div(int value, int su){
		return (float)value/su;
	}

}
