package thread04.Stop;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 15.
 * @내용 : 스레드를 안전하게 종료하는 방법 : 경우에 따라서 실행중인 스레드를 즉시 종료할 필요가 있다. 
 * 
 - Stop 플래그, interrupt() 함수 , stop() 함수 
 - stop() 함수 : 스레드를 즉시 종료
				갑자기 종료하게 되면 사용중인 자원들이 불안전한 상태로 남겨진다. 그래서 현재 사용하지 않음 
 - stop 플래그 : 메소드의 정상 종료를 유도한다.
 */
// 왜 바로 안빠져 나오는지

class Print extends Thread {
	public boolean stop; 	// 초기값 : int = 0, float = 0.0, boolean = false
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		
		while(!stop) {
			System.out.println("실행중");
		
			for(int i=70; i<=80; i++){
				System.out.println(super.getName() + ":" + i);
	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
		
		System.out.println("자원정리");
		System.out.println("실행종료");

	}
}


public class StopEx {
	public static void main(String[] args) {
		
		Print print = new Print();
		print.setName("Print");
		print.start();
		
		for(int i=0; i<=5; i++) {
			// if(i==3) print.stop();		// 갑자기 종료하면 사용중인 자원들이 불안전한 상태로 남는다. 
			if(i == 3) print.setStop(true); 	// Stop = true
			
			System.out.println(Thread.currentThread().getName() + ":" + i );

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		
	}
}
