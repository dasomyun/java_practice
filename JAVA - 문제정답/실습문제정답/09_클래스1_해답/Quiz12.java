package ch05.quiz01;

/**
 * @Data : 2016. 7. 12.
 * @Author : 좌민혜
 * @Description :  클래스1 - 실습문제 12)
 */

class Circle{
	public double radius;
	public double result;
	
	public void getRadius(double r){
		radius=r;
	}
	
	public void findArea(){
		result=radius*radius*3.14159;
	}
	
	public void disp(){
		System.out.println("원의 면적:" + result);
	}
}

 
public class Quiz12 {
	public static void main(String[] args) {
		Circle c=new Circle();
		c.getRadius(4.0);
		c.findArea();
		c.disp();
	}
}
