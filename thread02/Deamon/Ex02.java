package thread02.Deamon;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 14.
 * @���� : AutoSave ������ ���� �޼��� ( setDaemon )
 * 		
 */

public class Ex02 {

	public static void main(String[] args) {
		AutoSave autoSave = new AutoSave();
		autoSave.setDaemon(true);     // �̰� �Ⱦ��� ��� ���ư� 
		autoSave.start();
		
		try {
			Thread.sleep(5000);       // 5���� ����
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
