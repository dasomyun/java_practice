package ch06;

import java.awt.event.WindowEvent;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 26.
 * @내용 : api 
 */

import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

class EventHandler implements WindowListener {

	@Override
	public void windowActivated(WindowEvent arg0) {
			//윈도우 활성화 됐을 때
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		//윈도우가 딛힐 때 시스템에서 호출 
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		//윈도우 화면을 닫음
		JOptionPane.showMessageDialog(e.getComponent(), "윈도우 창을 종료합니다", "종료", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		//윈도우 비활성화
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		//윈도우 최소화에서 다시 커졌을 때 
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		//윈도우 최소화버튼 
		System.out.println("나 불렀니?");
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		//윈도우 열렸을 때
		
	}
	
}

public class Exam91 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setLocation(600, 200);
		
		f.addWindowListener(new EventHandler());
		f.setVisible(true);
	}

}
