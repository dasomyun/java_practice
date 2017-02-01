package ch09;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 1.
 * @내용 : 익명 구현 클래스 : 상속이나 인터페이스를 구현해야만 생성할 수 있다.
 * 			클래스를 재 사용할 수 있기 때문에 구현 클래스를 만들어서 사용하는 것이 일반적이다.
 * 			하지만 일회성의 구현 객체를 만들기 위해서 소스파일을 만들고 클래스를 선언하는 것은 비효율적이다.
 *			소스 파일을 만들지 않고도 구현 객체를 만들수 있는 방법을 제공하는데 그것이 익명 구현 클래스 이다  
 */
//클래스명이 없음 
//진짜 많이 씀 

class Ani {
	public void walk() {
		System.out.println("걸어갑니가");
	}
	
	public void run() {
		System.out.println("뛰어갑니다");
	}
}

//class Do extends Ani { }


public class Inner07 {
	public static void main(String[] args) {
		Ani ani = new Ani() {
			public final int su = 10;
			
			@Override
			public void walk() {
				System.out.println("강아지가 걸어갑니다");
			}

			@Override
			public void run() {
				System.out.println(su);
				System.out.println("강아지가 뛰어갑니다");
			}
			
		};
		
		ani.walk();
		ani.run();
		
	}
}



