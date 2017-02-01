package ch09;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 1.
 * @내용 : 익명 구현 클래스 
 */
//인터페이스는 자시자신의 객체 생성불가능 // 익명 구현 클래스는 가능 //변수 final 선언 

interface Person {
	public void speak();
	public void sleep();
}

public class Inner08 {
	public static void main(String[] args) {
		Person p = new Person() {

			@Override
			public void speak() {
				System.out.println("말을 합니다");
			}

			@Override
			public void sleep() {
				System.out.println("걸어갑니다");
			}
			
		};
		p.speak();
		p.sleep();
	}

}
