package ch02;
import java.util.Scanner;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 17.
 * @���� : 2byte �Է� ����� String ���·� �޾Ƽ� 
 * 		   ������ �´� �ڷ������� ��ȯ�Ѵ�.
 */

public class Exam28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� : ");
		
		String a = sc.next();
		System.out.println("��: " + a); //���ڿ�!!!�� �о�ͼ� ���ڿ�!!!�� �Ѹ�
										//Ű����� char, string ����
		System.out.print("�������Է� : ");
		int x=sc.nextInt(); 	//���� �Ҷ� ���������� �ޱ�
		++x;
		System.out.println("x : " + x);// ���ڿ��� ���
		//�Է��� ���ڿ� �� �Է¹ް� ������ ��ȯ�� 
		
		
		System.out.print("�Ǽ��� �Է� : ");
		float y=sc.nextFloat();
		System.out.println("y : " + y );
		
		//� ���� �Է��� �޾Ƽ� 10���� ũ�� ����Ͻÿ�
		System.out.print("� �� �Է�");
		int su = sc.nextInt();
		if( su > 10 ){
			System.out.println(su + " 10���� Ů�ϴ�");
		}
			
		sc.close();
		
		
		
		
		
		
		
		
		
		
	}

}
