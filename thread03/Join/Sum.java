package thread03.Join;

public class Sum extends Thread{

	private long sum;
	
	@Override
	public void run() {
		for(int i=0; i<=100; i++) {
			sum +=i;
		
		try {
			Thread.sleep(10);		// �ƿ� �ȱ����� �ڵ������� ���� �߻��� 
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		}
		System.out.println("1���� 100������ �� : " + this.getSum());
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
