package thread07.Synchronized;

public class Calculator { 		// 공유하는 클래스 

	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	// 한 스레드가 사용시 접근을 금지해야 한다
	// 임의영역 : 단 하나의 스레드만 실행	
	public synchronized void setMemory(int memory) { 	// 메서드 동기화 
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// synchronized(this) { }      임의영역 : 특정부분 동기화
		System.out.println(Thread.currentThread().getName() + ":" + this.toString());
		
	}

	@Override
	public String toString() {
		return "Calculator [memory=" + memory + "]";
	}
	
}
