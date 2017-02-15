package thread09.Notify;

public class WorkObject {
	public synchronized void sub() {		// 공유객체 
		System.out.println(Thread.currentThread().getName() + "WorkObject - Sub 작업실행");
		
		notify();
		
		try{
			wait();	// 깨워줄때 까지 기다린다. 즉 호출한 스레드가 일시 정지된다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void fun() {
		System.out.println(Thread.currentThread().getName() + "WorkObject - fun 작업실행");
		notify();
		
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}