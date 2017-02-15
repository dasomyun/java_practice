package thread09.Notify;

public class B extends Thread {
	
	private WorkObject workObject;
	
	public B(WorkObject workObject) {
		this.workObject = workObject;
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.fun();
		}
	}
	
}
