package ch07_interfaceC;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 31.
 * @���� : �������̽��� ���� ���
 */
// ����� 2�� �� �޾ƾ� �� �� �� Ŭ������ interface�� �ٲ۴� //api Ŭ���� ����
// interface�� ���� ����� �����ϴ� 

interface AA {
	public void sub();
}

class BB {
	public void fun() {
		System.out.println("fun �Լ�");
	}
}

interface Sub{
	public void method ();
}

class CC extends BB implements AA,Sub {

	@Override
	public void sub() {
		System.out.println("sub �Լ�");
	}

	@Override
	public void method() {
		System.out.println("method �Լ�");
	}
	
}


public class Exam94 {

	public static void main(String[] args) {
		CC c = new CC();
		c.sub();
		c.fun();
		c.method();
		
		AA a = new CC();
		a.sub();
		// a.fun();	ERROR!
		
		Sub s = new CC();
		s.method();
		//s.fun(); ERROR!
		
		BB b = new CC();
		//b.fun(); ERROR �������̵� �ȵǼ� 
}

}
