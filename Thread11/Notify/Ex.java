package Thread11.Notify;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 15.
 * @���� : Thread - Notify() , wait() , ����ȭ 
 */

public class Ex {

	public static void main(String[] args) {
		
		AutoMachine autoMachine = new AutoMachine();		// ���Ǳ� ���
		
		Producer producer = new Producer(autoMachine);		// ������
		producer.start();
		
		Consumer kim = new Consumer(autoMachine,"KIM");
		kim.start();
		Consumer park = new Consumer(autoMachine,"PARK");
		park.start();
		Consumer cho = new Consumer(autoMachine,"CHO");
		cho.start();
		Consumer lee = new Consumer(autoMachine,"LEE");
		lee.start();
		
		
		
		
	}

}
