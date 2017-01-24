package ch05;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 24.
 * @내용 : 중복 - 생성자 중복  
 * 				- 생성자 명은 같지만 매개변수 타입과 개수가 달라야한다.
 */

class TestA {
	private int x;
	private int y;
	
	public TestA() {
		x=10;
		y=20;
	}
	
	public TestA(int x){
		this.x=x;
		y=55;
	}
	
	public TestA(int x, int y) {
		this.x = x;
		this. y = y;
	}
	
	public void disp() {
		System.out.println(x + "\t" + y);
	}
}

public class Exam70 {

	public static void main(String[] args) {
		TestA a = new TestA();
		a.disp();
		
		TestA b = new TestA();
		b.disp();
		
		TestA c = new TestA(777, 888);
		c.disp();
		
		TestA d = new TestA(66);
		d.disp();
	}

}
