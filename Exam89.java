package ch06;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 26.
 * @���� : abstract 
 */

abstract class ParentsI {
	protected int su ;
	
	public void msg() {
		System.out.println("���� ���� �����Դϴ�");
	}
	
	public abstract void disp(); 		// �ݵ�� ������ �ʿ� ! // abstract �Լ��� ���� �ִ� Ŭ������ ��� abstract Ű���带 �ٿ��� �Ѵ� // Ʋ
	
}

class SonI extends ParentsI {
	public void disp() {
		System.out.println("�ݵ�� ������");
	}
}

class Daughter extends ParentsI {
	public void disp() {
		System.out.println("�� Ŭ���������� �ݵ�� ������");
	}
	
	public void msg() {
		
	}
}

public class Exam89 {
	public static void main(String[] args) {
		// ParentsI p = new ParentsI();	//abstract  Ŭ������ �ڱ� �ڽ��� ��ü�� ���� �� ����
		
		ParentsI s = new SonI();
		s.disp();
		
		ParentsI d = new Daughter();
		d.disp();
		
		
		
	}

}
