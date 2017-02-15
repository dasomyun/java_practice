package thread10.Notify;

public class Consumer extends Thread {		// ¼ÒºñÀÚ

	private DataBox dataBox;
	
	public Consumer(DataBox dataBox) {
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for(int i=0; i<=3; i++) {
			dataBox.getData();
		}
	}
	
}
