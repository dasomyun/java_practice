package thread04.Stop;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 15.
 * @���� : �����带 �����ϰ� �����ϴ� ��� : ��쿡 ���� �������� �����带 ��� ������ �ʿ䰡 �ִ�. 
 * 
 - Stop �÷���, interrupt() �Լ� , stop() �Լ� 
 - stop() �Լ� : �����带 ��� ����
				���ڱ� �����ϰ� �Ǹ� ������� �ڿ����� �Ҿ����� ���·� ��������. �׷��� ���� ������� ���� 
 - stop �÷��� : �޼ҵ��� ���� ���Ḧ �����Ѵ�.
 */
// �� �ٷ� �Ⱥ��� ��������

class Print extends Thread {
	public boolean stop; 	// �ʱⰪ : int = 0, float = 0.0, boolean = false
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		
		while(!stop) {
			System.out.println("������");
		
			for(int i=70; i<=80; i++){
				System.out.println(super.getName() + ":" + i);
	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
		
		System.out.println("�ڿ�����");
		System.out.println("��������");

	}
}


public class StopEx {
	public static void main(String[] args) {
		
		Print print = new Print();
		print.setName("Print");
		print.start();
		
		for(int i=0; i<=5; i++) {
			// if(i==3) print.stop();		// ���ڱ� �����ϸ� ������� �ڿ����� �Ҿ����� ���·� ���´�. 
			if(i == 3) print.setStop(true); 	// Stop = true
			
			System.out.println(Thread.currentThread().getName() + ":" + i );

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		
	}
}
