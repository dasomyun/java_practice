package thread01.Basic;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 14.
 * @내용 : Thread - 프로세서는 실행중인 하나의 프로그램을 말한다.
 * 			멀티 태스킹은 하나의 프로그램에서 동시에 처리하는 것을 말한다. ( ex. 네이트온에서 쳇하면서 파일 전송, 음악듣기 ) 
 * 			
 */

class Alphabet01 extends Thread {	// 하나의 스레드 , 부스레드 , 자식스레드
	
	@Override
	public void run() { 	// call back 메소드는 시스템에 호출 
		System.out.println("Alphabet01 \t" + Thread.currentThread().getName() +"\n");
		
		for(char i='A'; i<='z'; i++) {
			System.out.print(i + "\t");
			if(i == 'Z') System.out.println();
		}
	
		System.out.println();
	}
}


class Digit01 extends Thread {		// 하나의 스레드 , 부스레드 , 자식스레드
	
	@Override
	public void run() {
		System.out.println("Digit01 \t" + Thread.currentThread().getName() + "\n");
		
		for(int i=1; i<=100; i++) {
			System.out.print(i + "\t");
			if(i%10==0) System.out.println();
		}
		
		System.out.println();
	}
}


public class Ex01 {

	public static void main(String[] args) {	// 하나의 스레드 main - 주 스레드, 부모 스레드
		
		/*
		Thread th = Thread.currentThread();  // 현재 쓰레드 뭐니 ? 
		String str = th.getName();
		System.out.println(str);
		*/
		
		System.out.println("현재 쓰레드는 " + Thread.currentThread().getName());
		
		// 단일 스레드 
		Alphabet01 a = new Alphabet01();
		a.setName("알파뱃 클래스");
		a.start(); 	// callback 함수 
		
		Digit01 d = new Digit01();
		d.setName("숫자 클래스");
		d.start();  // callback 함수
		
	}

}
