package ch04;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 19.
 * @���� : �Լ� - Call by Value Return
 */

public class Exam47 {

	public static void main(String[] args) {
		int x = sub();
		System.out.println(x);
		
		float y = fun();
		System.out.println(y);
		
		String name = str();
		System.out.println(name);
		
		int hap = sum(10, 20);
		System.out.println(hap);
	}
	
	public static int sub(){
		return 10;
	}
	
	public static float fun() {
		return 24.5f;	//float ���� f�� ���̱�!!!!!!!!!!!!!!!!!!!!!!!!!!!
	}
	
	public static String str() {
		String name = "���ټ�";
		return name;
	}
	
	public static int sum(int x, int y){
		return x+y;
	}

}
