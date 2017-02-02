package ch10.exception;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 2.
 * @���� : �������� : throws exception Ŭ���� 
 */
// ���� ó���� ���ο����� Ŭ�������� ������ ����� �Ѵ� (���ϸ� �����Ϸ����� �����Ǽ� �����Ϸ��� ��������)
import java.io.InputStream;
import java.io.IOException;

class AA {
	public void sub() throws Exception {
		RuntimeException re = new RuntimeException("sub �Լ� ȣ��");
		throw re;
	}
	
	public void fun() {
		System.out.println("Fun �Լ� �Դϴ�");
	}
	
}

public class ExceptionEx09 {

	public static void main(String[] args) {	//throws Exception : �����Ϸ����� ���� 
		AA a = new AA ();
		try {
			a.sub();	
			a.fun();
		} catch (Exception e) {
			System.out.println("�Լ� ����");
		}
		
		System.out.println("\n\n");

		System.out.println("���� �Է� :");
		// InputStream is = System.in;
		try {
		//	int x = is.read();	// ������ ������ ���� 
		//	char ch = (char)x;
		//	System.out.println(x +"\t" + ch);
			
			char ch = (char) System.in.read();
			System.out.println(ch);
			
		} catch (IOException e) {
			System.out.println("���� �Է� ");
		}
	}

}


/*
class AA {
	public void sub() {
		try{
			RuntimeException re = new RuntimeException("sub �Լ� ȣ��");
			throw re;
		} catch (RuntimeException obj) {
			System.out.println("�Լ� ȣ�� �ϸ� �ȵ�!");
		}
	}
	
	public void fun() {
		System.out.println("Fun �Լ� �Դϴ�");
	}
	
}

public class ExceptionEx09 {

	public static void main(String[] args) {
		AA a = new AA ();
		a.sub();
		a.fun();
	}

}
*/
