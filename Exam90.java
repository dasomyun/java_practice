package ch06;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 26.
 * @���� : ��� - �߻�Ŭ���� , �߻� �Լ�
**/

abstract class Animal {
	public String kind;
	
	public void breathe () {
		System.out.println("���� ���ϴ�");
	}
	
	public abstract void sound();
}

class Dog extends Animal {
	public Dog() {
		super.kind="������";
	}
	
	public void sound() {
		System.out.println("�۸�");
	}
}

class Cat extends Animal {
	public Cat() {
		this.kind = "������";
	}
	
	public void sound() {
		System.out.println("�߿�");
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
