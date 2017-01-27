package ch06;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 25.
 * @내용 : 상속 - 함수 재정의 ( Overriding )
 */

// 부모는 자식을 컨트롤할 수 있다 ( overriding 한 것만 )
// 부동산 제주도땅 생각하기 - 제주도 땅의 집 고칠수 있는거
// 재정의 : 상속을 받되 고쳐쓰는것 

class ParentsD {
	public void aa() {
		
	}
	
	public void bb() {
		
	}
	
	public void cc() {
		
	}
	
	public void dd() {
		
	}
	
	public void disp() {
		System.out.println("hahaha");
	}
	
}

class SonD extends ParentsD {
	public void xx() {
		
	}
	
	public void yy() {
		
	}
	
	public void disp() {
		System.out.println("안녕하세요");
	}
	
}

public class Exam85 {

	public static void main(String[] args) {
		// 자식관점
		SonD s = new SonD();
		s.aa();
		s.bb();
		s.cc();
		s.dd();
		
		s.xx();
		s.yy();
		
		s.disp(); 	// 자식관점의 오버라이딩 ( 재 정의 )
		
		//부모관점
		ParentsD d = new SonD(); 	//upCasting
		d.aa();
		d.bb();
		d.cc();
		d.dd();
		
		//d.xx();	Error 자식 클래스에 있는 메서드는 사용할수 없다.
		//d.yy();	Error 자식 클래스에 있는 메서드는 사용할수 없다.
		
		d.disp(); 	//자식!!
		
	}

}
