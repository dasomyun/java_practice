package thread02.Deamon;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 14.
 * @내용 : 병렬성 , 동시성 ( setPriority : 우선순위 )
 */

class Test extends Thread {

	@Override
	public void run() {

		for(int i=0; i<200000; i++) {
			System.out.println(super.getName());
		}
		
	}

}


public class Ex03 {

	public static void main(String[] args) {
		// 쿼드 코어일 경우 4개 이하의 스레드를 실행 할 경우 우선순위에 영향을 미치지 못한다.
		// 최소한 5개 이상의 스레드가 실행되어야 우선순위 영향을 받는다. ( : 클래스가 5개가 되어야 한다 ) 
		
		for(int i=1; i<=5; i++) {
			Test test = new Test();
			test.setName("Testing thread : " + i);
			
			if(i==5){
				// test.setPriority(10);
				test.setPriority(Thread.MIN_PRIORITY); // 10~1
			}
			
			if(i==2) {
				test.setPriority(1);  // 우선순위가 가장 높음 
				// test.setPriority(Thread.MAX_PRIORITY);
			}
			
			if(i==6){
				test.setPriority(5); // 우선순위 중간값
			}
			
			test.start();
		}
		
		
	}

}
