package ch04;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 20.
 * @���� : �Լ� �ߺ� - Overload(Overloading)
 */

public class Exam53 {

	public static void main(String[] args) {
		output("ȫ�浿");
		output(10);
		output(24.5f);
		output('A');
		output(10, 40);
		output(77);
	}
	
	//���� ����� �ϴ� �Լ��� �̸��� �����ϰ� ���� - overloading
	
	public static void output(String name) {
		System.out.println(name);
	}
	
	public static void output(float su) {
		System.out.println(su);
	}
	
	public static void output(char ch) {
		System.out.println(ch);
	}
	
	public static void output(int su) {
		System.out.println(su);
	}
	
	public static void output(int a, int b){
		System.out.println(a + "\t" + b);
	}
	
	
	

}
