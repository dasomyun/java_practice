package thread03.Join;

public class Sum extends Thread{

	private long sum;
	
	@Override
	public void run() {
		for(int i=0; i<=100; i++) {
			sum +=i;
		
		try {
			Thread.sleep(10);		// 아예 안깨어날까봐 자동적으로 예외 발생함 
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		}
		System.out.println("1부터 100까지의 합 : " + this.getSum());
	}

	public void abc() {
		for(int i=1; i<=100; i++) {
			sum = sum+i;	// sum+=i;		
		}	
	}
	
	public long getSum() {
		return sum;
	}

}
