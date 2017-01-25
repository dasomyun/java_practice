package ch06;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 25.
 * @내용 : 생성자 - 생성자 상속
 */

class Point {
	protected int x, y;
	
	public Point(){
		this.x = 0;
		this.y = 0; 
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println(x + "\t" + y);
	}
	
}

class ColorPoint extends Point {	// x,y
	private String color;
	
	public ColorPoint(int x, int y , String color) {
		super(x,y);
		//super.x = x;
		//super.y = y;
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.println(color);
		super.showPoint();	//super 안써도됌
	}
}

public class Exam84 {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showColorPoint();
		
	}

}
