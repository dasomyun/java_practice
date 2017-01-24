package ch05;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 24.
 * @내용 : 생성자
 */

class TestB {
	private int x ;
	private int y ;
	
	public TestB(){ // 생성자가 매개변수가 다르면 에러가 나므로 디폴트 생성자를 만들어줘야 한다 
		x=0;
		y=0;
	}
	
	public TestB (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void disp() {
		System.out.println( x + "\t" + y );
	}
}

public class Exam71 {
	public static void main(String[] args) {
		TestB b = new TestB(10, 20);
		b.disp();
		
		TestB c = new TestB();
		c.disp();
	}

}
