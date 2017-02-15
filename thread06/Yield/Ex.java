package thread06.Yield;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 15.
 * @���� : yield() : �ٸ� �����忡�� ���� �纸�ϰ� �ڽ��� ���� ��� ���·� ���� �޼ҵ�
 *
 */

public class Ex {

	public static void main(String[] args) throws InterruptedException {
		
		A a = new A ();
		B b = new B ();
		
		a.start();
		b.start();
		Thread.sleep(3000);
		System.out.println("\n");
		
		a.work = false;		// B �� ����ȴ�
		Thread.sleep(3000);
		System.out.println("\n");

		a.work = true; 		// �̷��� ������� �ʰ� notify ��� 
		b.work = false;		// A �� ����ȴ�
		Thread.sleep(3000); 	
		System.out.println("\n");
		
		a.stop = true;
		b.stop = true;
		
	}

}
