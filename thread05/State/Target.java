package thread05.State;

public class Target extends Thread {

	@Override
	public void run() {
		for(long i=0; i<100000000; i++) { }	 // ������� Running
		
		try {
			Thread.sleep(1500);		// �Ͻ�����  timed-Waiting -> ������ Runnable
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(long i=0; i<100000000; i++) { } 	// ������� Running
	}		// ���� ���� terminated
	
	
}
