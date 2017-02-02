package ch10.exception;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 2.
 * @���� : ����ó�� - ClassCastException
 */

class Animal { }

class Dog extends Animal { }

class Cat extends Animal { }


public class ExceptionEx04 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
		
		
	}
	
//	public static void changeDog(Dog dog) { }
//	public static void changeDog(Cat cat) { }
	
	public static void changeDog(Animal animal) { 	//animal = dog , animal = cat
//	if(animal instanceof Dog) {
//		Dog dog = (Dog) animal;
//	} else if ( animal instanceof Cat) {
//		Cat cat = (Cat) animal;
//	}
//	
	try {
		Dog dog = (Dog) animal;
	}catch(ClassCastException obj) {
		System.out.println("����ȯ ����...�����ڿ��� ���� �ϼ���");
	}
	
	}

}
