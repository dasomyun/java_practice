package ch09;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 1.
 * @내용 : 지역 중첩 클래스 - 메소드 내에서 선언 
 */


class Banana{
	private int value=10;
	private static int result=20;
	
	public void method(){ // 클래스가 가지고 있는 맴버변수 안에다가 , 외부에서 선언이 안된다
		class E{
			private int su=77;
			//private static int imsi=88;
			
			public E(){}
			
			public void disp(){
				value=1;
				result=2;
				su=3;
				System.out.println("hahaha");
			}
		}
		
		//메소드 내에서만 객체 생성
		E e=new E();
		e.disp();
	}
}
public class Inner06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banana banana = new Banana();
		banana.method();
	}

}
