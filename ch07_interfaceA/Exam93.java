package ch07_interfaceA;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 31.
 * @내용 : interface 
 */

interface XX {	//반드시 구현 클래스가 있어야 함 
	public int su = 20;		//static final 이라고 쓰지 않아도 내부적으로 바뀜 // 변수선언은 많이 사용이 안함 ( 치환이 안되기 때문 )
	public void disp();		//abstract disp(); 라고 쓰지 않아도 내부적으로 바뀜
}

interface Test extends XX {}	//su, disp()

class Exam { }

// interface Imsi implements Exam{}		ERROR! interface는 클래스를 상속받지 않음

class YY implements XX {	// 구현 클래스
	public void disp() {
		System.out.println("HI");
	}
	
	public void output() {
		System.out.println("SU : " + su);
		//su = 77 ;  	ERROR! FINAL 변수는 치환이 안됨
	}
	
}



public class Exam93 {

	public static void main(String[] args) {
		YY y = new YY();
		y.disp();
		y.output();
		System.out.println(YY.su + "\n");	//su가 static이기 때문에 클래스명.변수명
		
		XX x = new YY();
		x.disp();
		
	}

}
