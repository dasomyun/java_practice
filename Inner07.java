package ch09;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 1.
 * @���� : �͸� ���� Ŭ���� : ����̳� �������̽��� �����ؾ߸� ������ �� �ִ�.
 * 			Ŭ������ �� ����� �� �ֱ� ������ ���� Ŭ������ ���� ����ϴ� ���� �Ϲ����̴�.
 * 			������ ��ȸ���� ���� ��ü�� ����� ���ؼ� �ҽ������� ����� Ŭ������ �����ϴ� ���� ��ȿ�����̴�.
 *			�ҽ� ������ ������ �ʰ� ���� ��ü�� ����� �ִ� ����� �����ϴµ� �װ��� �͸� ���� Ŭ���� �̴�  
 */
//Ŭ�������� ���� 
//��¥ ���� �� 

class Ani {
	public void walk() {
		System.out.println("�ɾ�ϰ�");
	}
	
	public void run() {
		System.out.println("�پ�ϴ�");
	}
}

//class Do extends Ani { }


public class Inner07 {
	public static void main(String[] args) {
		Ani ani = new Ani() {
			public final int su = 10;
			
			@Override
			public void walk() {
				System.out.println("�������� �ɾ�ϴ�");
			}

			@Override
			public void run() {
				System.out.println(su);
				System.out.println("�������� �پ�ϴ�");
			}
			
		};
		
		ani.walk();
		ani.run();
		
	}
}



