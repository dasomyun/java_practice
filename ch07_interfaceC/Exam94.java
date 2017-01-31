package ch07_interfaceC;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 31.
 * @내용 : 인터페이스의 다중 상속
 */
// 상속을 2개 다 받아야 할 때 한 클래스를 interface로 바꾼다 //api 클래스 사용시
// interface는 다중 상속이 가능하다 

interface AA {
	public void sub();
}

class BB {
	public void fun() {
		System.out.println("fun 함수");
	}
}

interface Sub{
	public void method ();
}

class CC extends BB implements AA,Sub {

	@Override
	public void sub() {
		System.out.println("sub 함수");
	}

	@Override
	public void method() {
		System.out.println("method 함수");
	}
	
}


public class Exam94 {

	public static void main(String[] args) {
		CC c = new CC();
		c.sub();
		c.fun();
		c.method();
		
		AA a = new CC();
		a.sub();
		// a.fun();	ERROR!
		
		Sub s = new CC();
		s.method();
		//s.fun(); ERROR!
		
		BB b = new CC();
		//b.fun(); ERROR 오버라이딩 안되서 
}

}
