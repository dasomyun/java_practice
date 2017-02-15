package thread01.Basic;

import javax.swing.JOptionPane;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 14.
 * @���� : Thread - �� ( JOptionPane )
 */

class SubThread extends Thread {

	public static boolean InputCheck = false;
	
	@Override
	public void run() {
		
		for(int i=10; i>0; i--) {
			System.out.print(i + "\t");
			if(InputCheck) return;
			
			try {
				Thread.sleep(1000);	
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("10�ʾȿ� ���� �Էµ��� �ʾҽ��ϴ� �׷��� ����");
		System.exit(0);
	}
}

class InputThread extends Thread {

	@Override
	public void run() {
		String input = JOptionPane.showInputDialog("10�ʾȿ� ���� �Է��ϼ���.");
		
		if(input != null) SubThread.InputCheck = true;
		
		System.out.println("�Է��Ͻ� ���� : " + input);
		
	}
	
}



public class Ex03 {

	public static void main(String[] args) {
		
		InputThread it = new InputThread();
		it.start();
		
		SubThread sub = new SubThread();
		sub.start();
		
	}

}
