package thread06.Yield;

public class A extends Thread {
	
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work){		// if( work == true ) ���� ��
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("A Ŭ���� Run �Լ� ���");
			} else {
				Thread.yield(); 	// work�� false �� �Ǹ� �ٸ� �����忡�� ����纸
			}
		}
		System.out.println("A Ŭ���� ����");

	}
	
}
