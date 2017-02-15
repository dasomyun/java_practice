package thread05.State;

import java.lang.Thread.State;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 15.
 * @내용 : 스레드 상태 ( 예제 Target 참고 )
 */

public class Ex {

	public static void main(String[] args) {
		
		Target target = new Target(); 	// 1) 스레드 객체가 생성 
		
		while(true) {
			State state = target.getState();
			System.out.println("타겟 스레드 상태 : " + state);
		
			if(state == Thread.State.NEW){
			target.start();					// 2) 실행 대기 상태 
			}
			if(state == Thread.State.TERMINATED){
				break;
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
