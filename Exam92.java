package ch06;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 26.
 * @내용 : 상속 - final 함수 
 */

class ParentsJ{
	protected int value;
	
	public void abc() {
		System.out.println("지하식당 미트볼");
	}
	
	public static void xyz() {
		
	}
	
	//public abstract void ijk();
	
	public final void aa() {
		System.out.println("순대국");
	}
	
	public static final void bb() {
		
	}
}

class SunJ extends ParentsJ {
	public void abc() {
		super.aa();
	}
	
	//public void aa(){ }	final 재정의가 안됨 
}

public class Exam92 {
	public static void main(String[] args) {
		
	}

}
