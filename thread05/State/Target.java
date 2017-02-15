package thread05.State;

public class Target extends Thread {

	@Override
	public void run() {
		for(long i=0; i<100000000; i++) { }	 // 실행상태 Running
		
		try {
			Thread.sleep(1500);		// 일시정지  timed-Waiting -> 실행대기 Runnable
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(long i=0; i<100000000; i++) { } 	// 실행상태 Running
	}		// 실행 종료 terminated
	
	
}
