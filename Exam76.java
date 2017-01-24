package ch05;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 24.
 * @내용 : 클래스 - static 변수 
 */


class TestG {
	private int x;
	private int y;
	private static int su;		// static : 공유 해줄 때 사용 
	private static int value;
	
	public TestG() {
		x = 0;
		y = 0;
	}
	
	public TestG (int x, int y, int su, int value) {
		this.x = x;
		this.y = y;
		TestG.su = su;
		TestG.value = value;
	}
	
	public void disp() {
		System.out.println( x + "\t" + y + "\t" +su + "\t" + value );
		
	}
	
	public void sub() {
		int imsi = 55;
		System.out.println("\n" + imsi);	// 지역변수
		System.out.println(x);		// 맴버변수
		System.out.println(su);		// static 변수
		
		aa();	
		bb(); 	//static 함수 호출 가능
	}
	
	public static void fun() {		//static 함수는 static 변수만 외부에서 가져다 쓸 수 있다
		int temp = 88;
		System.out.println("\n\n" + temp);	//지역변수
		// System.out.println(x);		//맴버변수 X   
		System.out.println(su); 	//static 변수
		// sub(); 		//맴버 함수 호출 X
		// aa();
		bb();
	}
	
	public void aa() {
	
	}
	
	public static void bb() {
			
	}
	
	
	
}

public class Exam76 {

	public static void main(String[] args) {
		TestG t = new TestG(10, 20, 30 ,40);
		t.disp();
		t.sub();
	
		TestG.fun();
	}

}
