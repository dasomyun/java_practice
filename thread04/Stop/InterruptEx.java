package thread04.Stop;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 15.
 * @���� : �����带 �����ϰ� �����ϴ� ��� : interrupt() �Լ�
 */

class Out extends Thread {

	@Override
	public void run() {
		while(true) {
			if(super.isInterrupted()) break;
			System.out.println("������");
		}
		
		System.out.println("�ڿ�����");
		System.out.println("��������");
	}
	
}



public class InterruptEx {

	public static void main(String[] args) {
			
		Out out = new Out();
		out.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		out.interrupt(); // �����带 �����Ű�� ���� �Լ� == false
		
	}

}
