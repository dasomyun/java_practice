package ch06;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 25.
 * @내용 : 상속 (기초)
 */

class ParentsA {	
	private int g;
	public char z;
	protected int x,y;
	
	protected void sub() {
		System.out.println("안녕하세요");
	}
}

class SonA extends ParentsA {	// 상속을 받으면 무거워 진다 , this 처럼 사용 가능 , private 로 선언된 접근제한자는 상속 불가능 
	private int a, b;
	
	public void setData(int x, int y, char z, int a, int b){
		super.x = x;
		super.y = y;
		super.z = z;
		this.a = a;
		this.b = b;
	}
	
	public void disp() {
		// System.out.println(g); error  (private 때문)
		System.out.println(z);
		
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);	//this 보단 super 애용하기 
		
		System.out.println(y);
		System.out.println(this.y);	// this 가능
		System.out.println(super.y);	//super 가능 
		
		System.out.println(a);	//a는 super 불가능 ( a는SonA에서 선언됐기 떄문 )
		System.out.println(this.a);
	}
}

public class Exam78 {
	public static void main(String[] args) {
		ParentsA p = new ParentsA();
		p.sub();
		
		SonA s = new SonA();
		s.setData(10, 20, '#' , 77, 88);
		s.disp();
	}

}
