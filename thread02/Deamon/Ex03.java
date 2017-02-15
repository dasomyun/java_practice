package thread02.Deamon;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 14.
 * @���� : ���ļ� , ���ü� ( setPriority : �켱���� )
 */

class Test extends Thread {

	@Override
	public void run() {

		for(int i=0; i<200000; i++) {
			System.out.println(super.getName());
		}
		
	}

}


public class Ex03 {

	public static void main(String[] args) {
		// ���� �ھ��� ��� 4�� ������ �����带 ���� �� ��� �켱������ ������ ��ġ�� ���Ѵ�.
		// �ּ��� 5�� �̻��� �����尡 ����Ǿ�� �켱���� ������ �޴´�. ( : Ŭ������ 5���� �Ǿ�� �Ѵ� ) 
		
		for(int i=1; i<=5; i++) {
			Test test = new Test();
			test.setName("Testing thread : " + i);
			
			if(i==5){
				// test.setPriority(10);
				test.setPriority(Thread.MIN_PRIORITY); // 10~1
			}
			
			if(i==2) {
				test.setPriority(1);  // �켱������ ���� ���� 
				// test.setPriority(Thread.MAX_PRIORITY);
			}
			
			if(i==6){
				test.setPriority(5); // �켱���� �߰���
			}
			
			test.start();
		}
		
		
	}

}
