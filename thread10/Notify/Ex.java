package thread10.Notify;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 15.
 * @���� : Thread - Notify() , wait() ��ü �ϳ��� ������ �ϳ� 
 */

public class Ex {

	public static void main(String[] args) {
		
		DataBox dataBox = new DataBox();
		
		Producer producer = new Producer(dataBox);
		producer.start();
		
		Consumer consumer = new Consumer(dataBox);
		consumer.start();
		
	}

}
