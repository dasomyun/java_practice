package ch08;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 31.
 * @���� : �������� (�θ�Ŭ����) , upcasting //Exam86
 */

/*
 
- ���� Ÿ�� ��ȯ 
�θ�Ÿ���� �ڽ�Ÿ������ ��ȯ�ϴ� ���� ���Ѵ�.
�ڽ� Ŭ���� ���� = (�ڽ�Ŭ����) �θ�Ŭ����Ÿ��(�ڽ� Ÿ���� �θ� Ÿ������ ��ȯ�� ���� )
ex. Child child = (Child) parent;

- ��ü Ÿ�� Ȯ�� (instanceof)
���� Ÿ�� ��ȯ�� �ڽ� Ÿ���� �θ� Ÿ������ ��ȯ�Ǿ� �ִ� ���¿����� ����
� ��ü�� � Ŭ������ �ν��Ͻ����� Ȯ���Ϸ��� instanceof ������ ���
instanceof �������� ������ ��ü�� ����, �� ������ Ÿ���� ���µ� ������ ��ü�� ������ �ν��Ͻ� �̸� �� 
������ Ÿ�����ΰ�ü�� �����Ǿ��ٸ� true�� �����ϰ� �׷��� ������ false�� �����Ѵ�

boolean result = ����(��ü) instanceof ����(Ÿ��)

ex. if(parent instanceof Child) {
Child child = (child) parent;
}


*/



class Shape{
	public void draw() {
		System.out.println("Shape Class");
	}
}

class Line extends Shape{
	public void draw() {
		System.out.println("Line Class");
	}
	
	public void disp() {
		System.out.println("hahaha");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect Class");
	}
}

class Paint {
	public void sub(Shape shape) {	//�θ�Ŭ������ �Ű������� �� ���� �� �ִ� 	//upcasting shape , 
		shape.draw();
		
		if(shape instanceof Line){  //instanceof : � ��ü�� � Ŭ������ �ν��Ͻ����� Ȯ�� //shape�� Line�̸� true �׷��� ������ false 
			Line line = (Line) shape;	//downcasting
			line.disp();
		}
	}
}

public class Exam101 {
	public static void main(String[] args) {
		Paint p = new Paint();
		p.sub(new Shape());
		p.sub(new Line());
		p.sub(new Rect());
	}

}
