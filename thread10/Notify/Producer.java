package thread10.Notify;

public class Producer extends Thread {		// ������

	private DataBox dataBox;
	
	public Producer(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for(int i=0; i<=3; i++) {
			String data = "������" + i;
			dataBox.setData(data);
			
		}
	}
	

	
}
