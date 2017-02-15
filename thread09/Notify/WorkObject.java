package thread09.Notify;

public class WorkObject {
	public synchronized void sub() {		// ������ü 
		System.out.println(Thread.currentThread().getName() + "WorkObject - Sub �۾�����");
		
		notify();
		
		try{
			wait();	// �����ٶ� ���� ��ٸ���. �� ȣ���� �����尡 �Ͻ� �����ȴ�.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void fun() {
		System.out.println(Thread.currentThread().getName() + "WorkObject - fun �۾�����");
		notify();
		
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}