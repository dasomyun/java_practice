package ch05;
/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 29
 * @���� : 7. �� ������ �Է� �޾� 10������ ������ ���Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ��� (if��)
 */
import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.println("�� ������ �Է��ϼ��� (1��°) : ");
		int i = sc.nextInt();
		System.out.println("�� ������ �Է��ϼ��� (2��°) : ");
		int j = sc.nextInt();
		System.out.println("�� ������ �Է��ϼ��� (3��°) : ");
		int z = sc.nextInt();
		
		if(i<11) 
			sum += i;
		if (j<11) 
			sum += j;
		if (z<11)
			sum += z;
		
		System.out.println("sum : " + sum);
		sc.close();
	}

}
