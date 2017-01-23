package ch05;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 23.
 * @내용 : 클래스 - get , set
 */

class Sub {
	
	private int x; 
	private float y;
	private char z;
	private String str;
	
	public void setData(int x, float y, char z, String str) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.str = str;
	}
	
	public void disp() {
		System.out.println("x : " + this.x);
		System.out.println("y : " + this.y);
		System.out.println("z : " + this.z);
		System.out.println("str : " + this.str);
	}

	//--------------------------------------------------------------
	
	public void setX(int x) {
		this.x = x ;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(float y) {
		this.y = y ;
	}
	
	public float getY(){
		return y;
	}
	
	public void setZ(char z) {
		this.z = z ;
	}
	
	public char getZ() {
		return z;
	}
	
	public void setStr(String str) {
		this.str = str ;
	}

	public String getStr() {
		return str;
	}
	
}
	
	
public class Exam65 {
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.setData(77, 88, '*', "Banana");
		sub.disp();
		
		sub.setX(10);
		sub.setY(24.5f);
		sub.setZ('A');
		sub.setStr("Apple");
		sub.disp();
		
		System.out.println(sub.getX());
		System.out.println(sub.getY());
		System.out.println(sub.getZ());
		System.out.println(sub.getStr());
		
	}
}
