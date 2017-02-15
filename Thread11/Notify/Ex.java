package Thread11.Notify;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 15.
 * @내용 : Thread - Notify() , wait() , 동기화 
 */

public class Ex {

	public static void main(String[] args) {
		
		AutoMachine autoMachine = new AutoMachine();		// 자판기 기계
		
		Producer producer = new Producer(autoMachine);		// 공급자
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
