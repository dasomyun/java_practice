package ch04;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 20.
 * @���� : local ���� ( �������� ) : �� ���������� ���Ǵ� ���� 
 * 		   static ���� : ���α׷��� ����ɶ� ���� ����ϴ� ���� �ǹ�
 */

public class Exam56 {
	
	public static int count = 0;

	public static void main(String[] args) {
		sub(10);
		sub(20);
		sub(30);

	}
	
	public static void sub(int su) {
		System.out.println("su : " + su);
		System.out.println("count : " + ++count);
	}

}
