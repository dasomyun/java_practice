package ch02;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 12.
 * @���� : if else �� 
 */

public class Exam11 {

	public static void main(String[] args) {
		int score = 50 ; 
		
		if ( score >= 50 ) {
			System.out.println( "�հ� �ϼ̽��ϴ�." );
			System.out.println( "������ " + score + "�Դϴ�" );
		}
		else {
			System.out.println("���հ� �ϼ̽��ϴ�." );
			System.out.println( "������ " + score + "�Դϴ�." );
		}
		
		System.out.println();
		
		String name = "���μ�";
		int age = 27 ;
		if ( age >= 20 && age < 30 ) {
			System.out.println("���� " + name + "�Դϴ� " + age + "��� �ູ�մϴ�" );
		} else {
			System.out.println( "20�밡 �ƴմϴ�" );
		
		}
		
	}

}
