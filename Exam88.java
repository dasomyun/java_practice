package ch06;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 25.
 * @내용 : 상속 - 함수 재정의 ( Overriding )
 */

class Shape {
	public void draw() {
		System.out.println("모양을 그립니다");
	}
}

class Line extends Shape {
	public void draw() {
		System.out.println("라인을 그립니다");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("사각형을 그립니다");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("원을 그립니다");
	}
}

public class Exam88 {

	public static void main(String[] args) {
		Shape[] array = new Shape[3];
		array[0] = new Line();
		array[1] = new Rect();
		array[2] = new Circle();
		
		for(int i=0; i<array.length; i++){
			array[i].draw();
		}
	}

}
