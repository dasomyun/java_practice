package ch06;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 25.
 * @내용 : 상속 - 생성자 상속
 */

class ParentsC{
	protected int x, y;
	
	public ParentsC(){
		System.out.println("부모 기본 생성자");
	}
	
	public ParentsC(int x) {
		this.x = x;
		y = 20;
	}
	
	public ParentsC(int x, int y) {
		this.x = x;
		this.y = y; 
	}
}


class SonC extends ParentsC {
	private int z;
	
	public SonC() {
		super(10);	//나는 디폴트 생성자가 아닌 매개변수가 int형인 생성자를 쓰겠다 , 생성자 : 상속받은 건 super 내꺼는 this
		System.out.println("자식 기본 생성자");
	}
	
	public SonC(int x) {
		super(x);		//ParentsC(int x) 실행
		this.z = 30;
	}
	
	public SonC(int x, int y, int z) {
		super(x,y);		//ParentsC(int x, int y) 실행
		this.z = z;
	}
	
	public void disp() {
		System.out.println(x + "\t" + y + "\t" + z );
	}
}



public class Exam83 {	// 생성자는 부모 클래스 생성자를 생성한 후 부모 생성자 실행한다.
	public static void main(String[] args) {
		SonC son = new SonC();
		son.disp();
		
		SonC a = new SonC(10);
		a.disp();
		
		SonC c = new SonC(77, 88, 99);
		c.disp();
	}

}
