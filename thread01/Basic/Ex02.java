package thread01.Basic;

import java.awt.Toolkit;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 14.
 * @내용 : Thread - 사운드 ( Toolkit ) 
 */

// 띵5번찍히고 beep 울리게 하지 말고 동시에 나오게 처리 - Thread 사용 
// 정확히 어떤게 먼저 나오는지 모른다 , 동시에 처리만 해주는 것 

class BeepTask extends Thread {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
	
		for(int i=0; i<5; i++) {	// 띵5번찍히고 beep 울리게 하지 말고 동시에 나오게 처리 - Thread 사용 
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

public class Ex02 {

	public static void main(String[] args) {
		
		BeepTask bt = new BeepTask();
		bt.start();
		
		for(int i=0; i<5; i++) {	
			System.out.println("띵");
			try {
			Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
