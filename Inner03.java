package ch09;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 1.
 * @내용 : 중첩 클래스 - 클래스 내부에 또 다른 클래스 선언
 */

class Animal {
	private int x = 10 ; 
	private Cat cat;
	private Dog dog;
	
	public void setData(Cat cat , Dog dog) {
		this. cat = cat;
		this.dog = dog;
	}
	
	public void print() {
		cat.disp();
		dog.disp();
		System.out.println("x : " + x);
	}
	
	class Cat {
		private String name = "고양이";
	
	
		public void disp() {
			System.out.println(name);
		}
	}
	
	class Dog {
		private String name = "강아지";
		
		public void disp() {
			System.out.println(name);
		}
	}
}

public class Inner03 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.setData(animal.new Cat(), animal.new Dog());
		animal.print();
	}

}
