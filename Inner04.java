package ch09;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 1.
 * @내용 : 중첩 클래스 - 클래스 내부에 또 다른 클래스 선언 ( static ) 
 */

class Sub{
	private int su=10;
	private static int volum=20;//static은 static만 가져다 쓴다
	private final int TEMP=50;//----------상수치환 안됨-----------
	private static final int IMSI=70;//-------------------------final 상수
	
	public void aa(){}
	public void bb(){}
	public static final void cc(){}
	public final void dd(){}
	
	class C{ //중첩클래스는 자신의 클래스 안에서 static필드와 메소드를 선언하지 못한다
		//정적중첩클래스는 자신의 클래스 안에서 static 선언 가능
		private int a=10;
		//private static int b=20;  
		private final int C=30;
		private static final int D=40;
		
		public void XX(){}
		//public static void YY(){}
		//public final ZZ(){}
		//public static final void KK(){}
		
		
		public void disp(){
			su=77;
			volum=11;
			System.out.println(TEMP);
			System.out.println(IMSI);
			
			aa();
			bb();
			cc();
			dd();
			
		}
	}
}

public class Inner04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		Sub.C c = sub.new C();
		c.disp();

	}
}

//중첩 클래스는 자신의 클래스 안에 static 필드, 메소드를 선언하지 못한다 