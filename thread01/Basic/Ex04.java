package thread01.Basic;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 14.
 * @내용 : Thread - 타이머
 */

class TimerThread extends Thread{
	
	private JLabel timerLabel;
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	@Override
	public void run() {
	
		int count = 1;
		
		while(true) {
			timerLabel.setText(String.valueOf(count));
			++count;
			
			try{
				Thread.sleep(1000);	
				
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			if(count > 10) System.exit(0);	
		}
		
	}
	
	
	
}


public class Ex04 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("타이머 스레드 예제");
		frame.setSize(250,150);
		
		Container con = frame.getContentPane();
		con.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gthic" , Font.ITALIC,80));
		timerLabel.setText("하하하");
		
		con.add(timerLabel);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TimerThread timer = new TimerThread(timerLabel);
		timer.start();
		
		
		
	}

}
