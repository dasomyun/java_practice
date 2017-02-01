package ch09;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 1.
 * @���� : ��ø Ŭ���� - Ŭ���� ���ο� �� �ٸ� Ŭ���� ����
 */

// ���丸 ��� ! ���� �Ⱦ��°� ���� �������� 

class Test {	//outer class
	private int su = 10;
	
	class A {	//inner class
		public A(){ }
		public int x;
		public void disp() {
			System.out.println("su : " + su);
			System.out.println("x : " + x);
		}
	}
	
	class B {
		public B() { }
		public int y;
		public void print() {
			System.out.println("su : " + su);
			System.out.println("y : " + y);
		}
	}
}


public class Inner01 {
	public static void main(String[] args) {
		Test t = new Test ();
		Test.A a = t.new A();		//�ܺ� ��ü�� ���ؼ� ���� 
		a.x = 77;
		a.disp();
		System.out.println();
		
		Test.B b = t.new B();
		b.y = 20;
		b.print();
		
		
		
		
	}
}
