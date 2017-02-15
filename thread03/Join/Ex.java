package thread03.Join;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 15.
 * @내용 : Join : 다른 스레드의 종료를 기다림
				계산 작업을 하는 스레드가 모든 계산 작업을 마쳤을 때, 계산 결과값을 받아 주로 사용
 */

public class Ex {
	public static void main(String[] args) {
		
		Sum sum = new Sum();
		sum.start();
		
		// Sum Thread가 종료 할때 까지 메인 스레드는 일시 정지해라 
		try {
			sum.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1부터 100까지의 합 : " + sum.getSum());

	
	}
}
