package thread10.Notify;

public class Producer extends Thread {		// 공급자

	private DataBox dataBox;
	
	public Producer(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for(int i=0; i<=3; i++) {
			String data = "데이터" + i;
			dataBox.setData(data);
			
		}
	}
	

	
}
