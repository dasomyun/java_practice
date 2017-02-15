package thread01.Basic;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 14.
 * @���� : Thread - Thread�� interface Ÿ������ ����ؾ� �� �� : Runnable interface ��� 
 */

class AA {
	public void disp() {
		System.out.println("hahaha");
	}
}

class Alphabet02 extends AA implements Runnable  {

	@Override
	public void run() {
		super.disp();
		
		for(char i='A'; i<='Z'; i++) {
			System.out.print(i +"\t");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
		}
		
	}
	
}

class Digit02 extends Thread   {

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.print(i + "\t");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
		}
	}
	
}


public class Ex05 {

	public static void main(String[] args) {
		
		Alphabet02 al = new Alphabet02();
		Thread th = new Thread(al);
		th.start();
		
		Digit02 di = new Digit02();
		di.start();
		
	}
}
