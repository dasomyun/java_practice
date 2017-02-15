package thread02.Deamon;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 14.
 * @내용 : 독립 스레드 : 부모 스레드와 상관없이 자식 스레드 역할을 다한다.
 * 			종속 스레드 : 부모 스레드가 종료되면 자식 스레드도 종료된다.
 */

class Alphabet03 extends Thread {

	@Override
	public void run() {
		
		// System.out.println(Thread.currentThread().getName());
		System.out.println(super.getName());
		
		char i='A';
		while(i<='Z')
			System.out.println(i);
			
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		
		++i;
	}
	
}

class Digit03 extends Thread {
	
	@Override
	public void run() {
		
		System.out.println(super.getName());
		
		int i = 1;
		while(i <= 50)
			System.out.println(i);
			
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		
		++i;
	}
	
}


public class Ex01 {

	public static void main(String[] args) {
		
		Alphabet03 a = new Alphabet03();
		a.setDaemon(true); // 자동저장 기능 
		a.setName("알파벳 쓰레드");
		a.start();
		
		Digit03 d = new Digit03();
		d.setDaemon(true);
		d.setName("디지털 쓰레드");
		d.start();
		
		System.out.println(Thread.currentThread().getName());
		
		for(int i=65; i<=70; i++){
			System.out.println("*");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
