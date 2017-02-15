package thread06.Yield;

public class A extends Thread {
	
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work){		// if( work == true ) 같은 말
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("A 클래스 Run 함수 출력");
			} else {
				Thread.yield(); 	// work가 false 가 되면 다른 스레드에게 실행양보
			}
		}
		System.out.println("A 클래스 종료");

	}
	
}
