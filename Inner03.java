package ch09;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 1.
 * @���� : ��ø Ŭ���� - Ŭ���� ���ο� �� �ٸ� Ŭ���� ����
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
		private String name = "�����";
	
	
		public void disp() {
			System.out.println(name);
		}
	}
	
	class Dog {
		private String name = "������";
		
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
