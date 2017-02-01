package ch09;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 1.
 * @내용 : 중첩 클래스 - 클래스 내부에 또 다른 클래스 선언
 */

class Out {
	private String str = "안녕하세요" ;
	
	public void method() {
		System.out.println("str : " + str);
	}
	
	class In {
		private String str = "HI";
		
		public void method() {
			System.out.println("반가워요");
		}
		
		//밑에서부터 알아두기 . 생각보다 많이 씀 . 안드로이드에서 많이 씀 
		public void disp() {
			System.out.println(this.str);
			this.method();
			
			System.out.println("\n" + Out.this.str);
			Out.this.method();
		}
	}
}

public class Inner02 {

	public static void main(String[] args) {
		Out out = new Out();
		Out.In in = out.new In();
		in.disp();
	}

}
