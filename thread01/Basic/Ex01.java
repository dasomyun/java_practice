package thread01.Basic;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 14.
 * @���� : Thread - ���μ����� �������� �ϳ��� ���α׷��� ���Ѵ�.
 * 			��Ƽ �½�ŷ�� �ϳ��� ���α׷����� ���ÿ� ó���ϴ� ���� ���Ѵ�. ( ex. ����Ʈ�¿��� ���ϸ鼭 ���� ����, ���ǵ�� ) 
 * 			
 */

class Alphabet01 extends Thread {	// �ϳ��� ������ , �ν����� , �ڽĽ�����
	
	@Override
	public void run() { 	// call back �޼ҵ�� �ý��ۿ� ȣ�� 
		System.out.println("Alphabet01 \t" + Thread.currentThread().getName() +"\n");
		
		for(char i='A'; i<='z'; i++) {
			System.out.print(i + "\t");
			if(i == 'Z') System.out.println();
		}
	
		System.out.println();
	}
}


class Digit01 extends Thread {		// �ϳ��� ������ , �ν����� , �ڽĽ�����
	
	@Override
	public void run() {
		System.out.println("Digit01 \t" + Thread.currentThread().getName() + "\n");
		
		for(int i=1; i<=100; i++) {
			System.out.print(i + "\t");
			if(i%10==0) System.out.println();
		}
		
		System.out.println();
	}
}


public class Ex01 {

	public static void main(String[] args) {	// �ϳ��� ������ main - �� ������, �θ� ������
		
		/*
		Thread th = Thread.currentThread();  // ���� ������ ���� ? 
		String str = th.getName();
		System.out.println(str);
		*/
		
		System.out.println("���� ������� " + Thread.currentThread().getName());
		
		// ���� ������ 
		Alphabet01 a = new Alphabet01();
		a.setName("���Ĺ� Ŭ����");
		a.start(); 	// callback �Լ� 
		
		Digit01 d = new Digit01();
		d.setName("���� Ŭ����");
		d.start();  // callback �Լ�
		
	}

}
