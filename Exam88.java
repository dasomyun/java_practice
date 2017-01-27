package ch06;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 25.
 * @���� : ��� - �Լ� ������ ( Overriding )
 */

class Shape {
	public void draw() {
		System.out.println("����� �׸��ϴ�");
	}
}

class Line extends Shape {
	public void draw() {
		System.out.println("������ �׸��ϴ�");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("�簢���� �׸��ϴ�");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("���� �׸��ϴ�");
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
