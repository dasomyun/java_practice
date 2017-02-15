package thread06.Yield;

public class B extends Thread {
	
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {	
		while(!stop) {
			if(work) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("B Ŭ���� Run �Լ� ���");
				
			} else {
				Thread.yield();
			} 
		}
		
		System.out.println("B Ŭ���� ����");
	}
	
	
}
