package thread01.Basic;

import javax.swing.JOptionPane;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 14.
 * @내용 : Thread - 뷰 ( JOptionPane )
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
		
		System.out.println("10초안에 값이 입력되지 않았습니다 그래서 종료");
		System.exit(0);
	}
}

class InputThread extends Thread {

	@Override
	public void run() {
		String input = JOptionPane.showInputDialog("10초안에 값을 입력하세요.");
		
		if(input != null) SubThread.InputCheck = true;
		
		System.out.println("입력하신 값은 : " + input);
		
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
