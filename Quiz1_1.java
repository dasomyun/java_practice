package ch05;
/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 29
 * @���� : 1. ���� �ϳ��� �Է¹޾Ƽ� �� ���� 1�̸� ����, 2�̸� ���� �̶�� ���ڸ� ����ϴ� ���α׷��� �ۼ��ϼ��� (switch ~ case��)
 */
import java.util.Scanner;

public class Quiz1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� : (1.���� , 2.����) ");
		int i = sc.nextInt();
		
		switch (i) {
		case 1 : 
			System.out.println("����");
			break;
		case 2 :
			System.out.println("����");
			break;
		}
		
		sc.close();
	}

}
