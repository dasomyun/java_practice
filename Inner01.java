package ch09;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 1.
 * @내용 : 중첩 클래스 - 클래스 내부에 또 다른 클래스 선언
 */

// 개념만 잡기 ! 많이 안쓰는게 좋다 복잡해짐 

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
		Test.A a = t.new A();		//외부 객체를 통해서 생성 
		a.x = 77;
		a.disp();
		System.out.println();
		
		Test.B b = t.new B();
		b.y = 20;
		b.print();
		
		
		
		
	}
}
