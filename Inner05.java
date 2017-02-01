package ch09;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 1.
 * @내용 : 정적 중첩 클래스 - static 키워드를 내부 클래스에 선언한다 
 */

class Apple{
	private int su=10;
	private static int value=20;
	
	static class D{// 클래스 앞에 static을 붙여주면 내부클래스에서 static을 선언할 수 있다
		private int x=77;
		private static int y=88;
		
		public void disp(){
		//	su=10;//static 변수만 가져다 쓴다.  outer 클래스 static 맴버필드, 함수만 사용한다
			value=30;
			System.out.println(x +"\t" + y);
			
		}
	}
}

public class Inner05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple.D d = new Apple.D();
		d.disp();
		
	}

}