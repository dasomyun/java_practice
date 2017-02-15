package thread04.Stop;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 15.
 * @내용 : 스레드를 안전하게 종료하는 방법 : interrupt() 함수
 */

class Out extends Thread {

	@Override
	public void run() {
		while(true) {
			if(super.isInterrupted()) break;
			System.out.println("실행중");
		}
		
		System.out.println("자원정리");
		System.out.println("실행종료");
	}
	
}



public class InterruptEx {

	public static void main(String[] args) {
			
		Out out = new Out();
		out.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		out.interrupt(); // 스레드를 종료시키기 위한 함수 == false
		
	}

}
