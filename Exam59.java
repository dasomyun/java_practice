package ch05;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 23.
 * @���� : Ŭ����  
 */

class Person {
	public String name; 
	public int age; 
	public float ki;
	
	public void disp(){ 	//�ɹ� �Լ� , �ɹ� �޼ҵ� function 
		System.out.println(name + "\t" + age + "\t" + ki);
	}
}

public class Exam59 {

	public static void main(String[] args) {
		
		Person a = new Person();
		a.name = "���ټ�";
		a.age = 24;
		a.ki = 166f;
		a.disp();
		
		Person b = new Person();
		b.name = "ȫ�浿";
		b.age = 32;
		b.ki = 177.5f;
		b.disp();
		
		Person c = new Person();
		c.name = "���μ�";
		c.age = 34;
		c.ki = 182.4f;
		c.disp();
	}

}
