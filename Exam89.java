package ch06;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 26.
 * @내용 : abstract 
 */

abstract class ParentsI {
	protected int su ;
	
	public void msg() {
		System.out.println("오늘 이후 연휴입니다");
	}
	
	public abstract void disp(); 		// 반드시 재정의 필요 ! // abstract 함수를 갖고 있는 클래스는 모두 abstract 키워드를 붙여야 한다 // 틀
	
}

class SonI extends ParentsI {
	public void disp() {
		System.out.println("반드시 재정의");
	}
}

class Daughter extends ParentsI {
	public void disp() {
		System.out.println("딸 클래스에서도 반드시 재정의");
	}
	
	public void msg() {
		
	}
}

public class Exam89 {
	public static void main(String[] args) {
		// ParentsI p = new ParentsI();	//abstract  클래스는 자기 자신의 객체를 만들 수 없음
		
		ParentsI s = new SonI();
		s.disp();
		
		ParentsI d = new Daughter();
		d.disp();
		
		
		
	}

}
