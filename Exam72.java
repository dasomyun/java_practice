package ch05;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 24.
 * @���� : ������ ȣ�� ( this )
 */

class TestC{
	private int x , y , z ;
	private int a ;
	
	public TestC() {
		x = 100;
		y = 200;
		z = 300;
		a = 400;
	}
	
	public TestC(int x) {
//		this.x = x;
//		y = 200;
//		z = 300;
//		a = 400;
		
		this();	//������ ȣ�� , �Լ��� �����ڵ� this�� �� ù��° �ٿ� �ۼ��ؾ� �Ѵ�.
		this.x = x;
	}
	
	public TestC(int x, int y) {
//		this.x = x;
//		this.y = y;
//		z = 300;
//		a = 400;
		
//		this();
//		this.x = x;
//		this.y = y;
		

		this(x);
		this.y = y;
	}
	
	public void disp() {
		System.out.println( x + "\t" + y + "\t" + z );
		System.out.println( a + "\n\n" );
	}
	
}

public class Exam72 {

	public static void main(String[] args) {
		TestC c = new TestC();
		c.disp();
		
		TestC t = new TestC(77);
		t.disp();
		
		TestC e = new TestC(2, 3);
		e.disp();
	}

}
