package ch08;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 31.
 * @내용 : 연관관계 (부모클래스) , upcasting //Exam86
 */

/*
 
- 강제 타입 변환 
부모타입을 자식타입으로 변환하는 것을 말한다.
자식 클래스 변수 = (자식클래스) 부모클래스타입(자식 타입이 부모 타입으로 변환된 상태 )
ex. Child child = (Child) parent;

- 객체 타입 확인 (instanceof)
강제 타입 변환은 자식 타입이 부모 타입으로 변환되어 있는 상태에서만 가능
어떤 객체가 어떤 클래스의 인스턴스인지 확인하려면 instanceof 연산자 사용
instanceof 연산자의 좌항은 객체가 오고, ㅇ ㅜ항은 타입이 오는데 좌항의 객체가 우항의 인스턴스 이면 즉 
우항의 타입으로객체가 생성되었다면 true를 산출하고 그렇지 않으면 false를 산출한다

boolean result = 좌항(객체) instanceof 우항(타입)

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
	public void sub(Shape shape) {	//부모클래스가 매개변수면 다 담을 수 있다 	//upcasting shape , 
		shape.draw();
		
		if(shape instanceof Line){  //instanceof : 어떤 객체가 어떤 클래스의 인스턴스인지 확인 //shape가 Line이면 true 그렇지 않으면 false 
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
