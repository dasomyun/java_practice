package thread02.Deamon;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 14.
 * @���� : ���� ������ : �θ� ������� ������� �ڽ� ������ ������ ���Ѵ�.
 * 			���� ������ : �θ� �����尡 ����Ǹ� �ڽ� �����嵵 ����ȴ�.
 */

class Alphabet03 extends Thread {

	@Override
	public void run() {
		
		// System.out.println(Thread.currentThread().getName());
		System.out.println(super.getName());
		
		char i='A';
		while(i<='Z')
			System.out.println(i);
			
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		
		++i;
	}
	
}

class Digit03 extends Thread {
	
	@Override
	public void run() {
		
		System.out.println(super.getName());
		
		int i = 1;
		while(i <= 50)
			System.out.println(i);
			
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		
		++i;
	}
	
}


public class Ex01 {

	public static void main(String[] args) {
		
		Alphabet03 a = new Alphabet03();
		a.setDaemon(true); // �ڵ����� ��� 
		a.setName("���ĺ� ������");
		a.start();
		
		Digit03 d = new Digit03();
		d.setDaemon(true);
		d.setName("������ ������");
		d.start();
		
		System.out.println(Thread.currentThread().getName());
		
		for(int i=65; i<=70; i++){
			System.out.println("*");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
