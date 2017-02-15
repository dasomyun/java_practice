package thread09.Notify;

public class A extends Thread {
	
	private WorkObject workObject;
	
	public A(WorkObject workObject) {
		this.workObject = workObject;
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.sub();
		}
	}
	
}
