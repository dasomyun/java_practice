package ch05;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 24.
 * @���� : Ŭ���� - static ���� 
 */


class TestG {
	private int x;
	private int y;
	private static int su;		// static : ���� ���� �� ��� 
	private static int value;
	
	public TestG() {
		x = 0;
		y = 0;
	}
	
	public TestG (int x, int y, int su, int value) {
		this.x = x;
		this.y = y;
		TestG.su = su;
		TestG.value = value;
	}
	
	public void disp() {
		System.out.println( x + "\t" + y + "\t" +su + "\t" + value );
		
	}
	
	public void sub() {
		int imsi = 55;
		System.out.println("\n" + imsi);	// ��������
		System.out.println(x);		// �ɹ�����
		System.out.println(su);		// static ����
		
		aa();	
		bb(); 	//static �Լ� ȣ�� ����
	}
	
	public static void fun() {		//static �Լ��� static ������ �ܺο��� ������ �� �� �ִ�
		int temp = 88;
		System.out.println("\n\n" + temp);	//��������
		// System.out.println(x);		//�ɹ����� X   
		System.out.println(su); 	//static ����
		// sub(); 		//�ɹ� �Լ� ȣ�� X
		// aa();
		bb();
	}
	
	public void aa() {
	
	}
	
	public static void bb() {
			
	}
	
	
	
}

public class Exam76 {

	public static void main(String[] args) {
		TestG t = new TestG(10, 20, 30 ,40);
		t.disp();
		t.sub();
	
		TestG.fun();
	}

}
