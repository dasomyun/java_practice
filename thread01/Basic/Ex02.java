package thread01.Basic;

import java.awt.Toolkit;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 14.
 * @���� : Thread - ���� ( Toolkit ) 
 */

// ��5�������� beep �︮�� ���� ���� ���ÿ� ������ ó�� - Thread ��� 
// ��Ȯ�� ��� ���� �������� �𸥴� , ���ÿ� ó���� ���ִ� �� 

class BeepTask extends Thread {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
	
		for(int i=0; i<5; i++) {	// ��5�������� beep �︮�� ���� ���� ���ÿ� ������ ó�� - Thread ��� 
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
			System.out.println("��");
			try {
			Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
