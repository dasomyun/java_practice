package ch05;
/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 29
 * @���� : 2. � ���� �Է��ؼ� �� ���� 10���� ũ�� 20���� ������ ����ϴ� ���α׷��� �ۼ��ϼ��� (if��)
 */
import java.util.Scanner;

public class Quiz2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("10���� ũ�� 20���� ���� ���� �Է��ϼ��� (�� ���� ���� ��µ��� �ʽ��ϴ� ) : ");
		int i = sc.nextInt();
		
		if(i > 10 && i < 20)
			System.out.println(i);
		
		sc.close();
	}

}
