package ch06;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 25.
 * @���� : ��� - �Լ� ������ ( Overriding )
 */

// �θ�� �ڽ��� ��Ʈ���� �� �ִ� ( overriding �� �͸� )
// �ε��� ���ֵ��� �����ϱ� - ���ֵ� ���� �� ��ĥ�� �ִ°�
// ������ : ����� �޵� ���ľ��°� 

class ParentsD {
	public void aa() {
		
	}
	
	public void bb() {
		
	}
	
	public void cc() {
		
	}
	
	public void dd() {
		
	}
	
	public void disp() {
		System.out.println("hahaha");
	}
	
}

class SonD extends ParentsD {
	public void xx() {
		
	}
	
	public void yy() {
		
	}
	
	public void disp() {
		System.out.println("�ȳ��ϼ���");
	}
	
}

public class Exam85 {

	public static void main(String[] args) {
		// �ڽİ���
		SonD s = new SonD();
		s.aa();
		s.bb();
		s.cc();
		s.dd();
		
		s.xx();
		s.yy();
		
		s.disp(); 	// �ڽİ����� �������̵� ( �� ���� )
		
		//�θ����
		ParentsD d = new SonD(); 	//upCasting
		d.aa();
		d.bb();
		d.cc();
		d.dd();
		
		//d.xx();	Error �ڽ� Ŭ������ �ִ� �޼���� ����Ҽ� ����.
		//d.yy();	Error �ڽ� Ŭ������ �ִ� �޼���� ����Ҽ� ����.
		
		d.disp(); 	//�ڽ�!!
		
	}

}
