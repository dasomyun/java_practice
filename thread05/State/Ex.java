package thread05.State;

import java.lang.Thread.State;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 15.
 * @���� : ������ ���� ( ���� Target ���� )
 */

public class Ex {

	public static void main(String[] args) {
		
		Target target = new Target(); 	// 1) ������ ��ü�� ���� 
		
		while(true) {
			State state = target.getState();
			System.out.println("Ÿ�� ������ ���� : " + state);
		
			if(state == Thread.State.NEW){
			target.start();					// 2) ���� ��� ���� 
			}
			if(state == Thread.State.TERMINATED){
				break;
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
