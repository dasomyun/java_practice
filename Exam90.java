package ch06;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 26.
 * @내용 : 상속 - 추상클래스 , 추상 함수
**/

abstract class Animal {
	public String kind;
	
	public void breathe () {
		System.out.println("숨을 쉽니다");
	}
	
	public abstract void sound();
}

class Dog extends Animal {
	public Dog() {
		super.kind="포유류";
	}
	
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}
	
	public void sound() {
		System.out.println("야옹");
	}
	
}

public class Exam90 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		Cat cat = new Cat();
		cat.sound();
			// Animal a = new Animal();
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
	}

}
