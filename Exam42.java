package ch04;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 19.
 * @���� : �Լ� - Call By Value
 */

public class Exam42 {

	public static void main(String[] args) {
		System.out.println("hahaha");
		
		int su = 10;
		sub(su);
		
		System.out.println("hohoho");
		sub(20);
		
		System.out.println("hihihi");
		sub(30);
		
		System.out.println("end");
	}
	
	public static void sub(int x) {
		System.out.println(x);
	}

}
