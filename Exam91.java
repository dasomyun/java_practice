package ch06;

import java.awt.event.WindowEvent;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 26.
 * @���� : api 
 */

import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

class EventHandler implements WindowListener {

	@Override
	public void windowActivated(WindowEvent arg0) {
			//������ Ȱ��ȭ ���� ��
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		//�����찡 ���� �� �ý��ۿ��� ȣ�� 
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		//������ ȭ���� ����
		JOptionPane.showMessageDialog(e.getComponent(), "������ â�� �����մϴ�", "����", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		//������ ��Ȱ��ȭ
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		//������ �ּ�ȭ���� �ٽ� Ŀ���� �� 
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		//������ �ּ�ȭ��ư 
		System.out.println("�� �ҷ���?");
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		//������ ������ ��
		
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
