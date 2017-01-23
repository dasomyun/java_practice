package ch05;

/**
 * @ÀÛ¼ºÀÚ : À±´Ù¼Ø
 * @³¯Â¥ : 2017. 1. 23.
 * @³»¿ë : Å¬·¡½º  
 */

class Person {
	public String name; 
	public int age; 
	public float ki;
	
	public void disp(){ 	//¸É¹ö ÇÔ¼ö , ¸É¹ö ¸Þ¼Òµå function 
		System.out.println(name + "\t" + age + "\t" + ki);
	}
}

public class Exam59 {

	public static void main(String[] args) {
		
		Person a = new Person();
		a.name = "À±´Ù¼Ø";
		a.age = 24;
		a.ki = 166f;
		a.disp();
		
		Person b = new Person();
		b.name = "È«±æµ¿";
		b.age = 32;
		b.ki = 177.5f;
		b.disp();
		
		Person c = new Person();
		c.name = "Á¶ÀÎ¼º";
		c.age = 34;
		c.ki = 182.4f;
		c.disp();
	}

}
