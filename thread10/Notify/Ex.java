package thread10.Notify;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 15.
 * @내용 : Thread - Notify() , wait() 객체 하나당 스레드 하나 
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
