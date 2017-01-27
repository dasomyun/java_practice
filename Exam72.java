package ch05;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 24.
 * @내용 : 생성자 호출 ( this )
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
		
		this();	//생성자 호출 , 함수든 생성자든 this는 맨 첫번째 줄에 작성해야 한다.
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
