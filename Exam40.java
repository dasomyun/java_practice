package ch04;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 19.
 * @���� : �Լ� - Call By Value
 */

public class Exam40 {

	public static void main(String[] args) {
		
		for(int i=0; i<=5; i++){
			fun();
		}
		
		System.out.println("end");
	}
	
	public static void fun(){
		System.out.println("�ȳ��ϼ���");
	}

}
