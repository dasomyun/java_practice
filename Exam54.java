package ch04;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 20.
 * @���� : �Լ� �ߺ� - overloading
 */

public class Exam54 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = hap(a , b);
		
		float x = 55.5f;
		float y = 57.4f;
		float z = hap(x , y);
		
		System.out.println( c + "\t" + z);
	}
	
	public static int hap(int a, int b){
		return a+b;
	}
	
	public static float hap(float x, float y) {
		return x+y;
	}
	
	

}
