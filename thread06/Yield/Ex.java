package thread06.Yield;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 15.
 * @내용 : yield() : 다른 스레드에게 실행 양보하고 자신은 실행 대기 상태로 가는 메소드
 *
 */

public class Ex {

	public static void main(String[] args) throws InterruptedException {
		
		A a = new A ();
		B b = new B ();
		
		a.start();
		b.start();
		Thread.sleep(3000);
		System.out.println("\n");
		
		a.work = false;		// B 만 실행된다
		Thread.sleep(3000);
		System.out.println("\n");

		a.work = true; 		// 이렇게 사용하지 않고 notify 사용 
		b.work = false;		// A 만 실행된다
		Thread.sleep(3000); 	
		System.out.println("\n");
		
		a.stop = true;
		b.stop = true;
		
	}

}
