package thread10.Notify;

public class DataBox {			// 공유 클래스 

	private String data;		// true

	public synchronized void setData(String data) {
		
		if(this.data != null) {		
			try {
				wait();		// setData()를 일시정지 상태로 만듬 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.data = data;
		System.out.println("생산한 데이터 : " + data);
		notify();
	}

	public synchronized String getData() {
		
		if(data == null) {
			try {
				wait();		// getData()를 일시정지 상태로 만듬 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		String value = data;
		System.out.println("소비한 데이터 : " + value);
		data = null;
		notify();	// 일시 정지 상태에 있는 setData()를 실행 대기 상태로 만듬
		
		return value;
		
	}

}
