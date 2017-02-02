package ch10.exception;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 2.
 * @내용 : 에러처리 - ClassCastException
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
		System.out.println("형변환 에러...관계자에게 문의 하세요");
	}
	
	}

}
