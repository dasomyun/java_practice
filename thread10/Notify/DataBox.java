package thread10.Notify;

public class DataBox {			// ���� Ŭ���� 

	private String data;		// true

	public synchronized void setData(String data) {
		
		if(this.data != null) {		
			try {
				wait();		// setData()�� �Ͻ����� ���·� ���� 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.data = data;
		System.out.println("������ ������ : " + data);
		notify();
	}

	public synchronized String getData() {
		
		if(data == null) {
			try {
				wait();		// getData()�� �Ͻ����� ���·� ���� 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		String value = data;
		System.out.println("�Һ��� ������ : " + value);
		data = null;
		notify();	// �Ͻ� ���� ���¿� �ִ� setData()�� ���� ��� ���·� ����
		
		return value;
		
	}

}
