package ch04;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 20.
 * @���� : local ���� ( �������� ) : �� ���������� ���Ǵ� ���� 
 * 		   static ���� : ���α׷��� ����ɶ� ���� ����ϴ� ���� �ǹ�
 */

public class Exam55 {

	public static int value = 50;	// static ����
	
	public static void main(String[] args) {
		System.out.println("main : " + value);
		aa(10);
		
		int su = 10;
		{
			int x = 88;	// ��������
			System.out.println("su : " + su);
			System.out.println( "x : " + x);
		}
		// System.out.println("x : " + x); error
		
	}

	public static void aa ( int su ) {
		System.out.println("aa : " + value);
		
		value = 77;
		System.out.println("aa : " + value);
	}
	
}
