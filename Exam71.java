package ch05;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 24.
 * @���� : ������
 */

class TestB {
	private int x ;
	private int y ;
	
	public TestB(){ // �����ڰ� �Ű������� �ٸ��� ������ ���Ƿ� ����Ʈ �����ڸ� �������� �Ѵ� 
		x=0;
		y=0;
	}
	
	public TestB (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void disp() {
		System.out.println( x + "\t" + y );
	}
}

public class Exam71 {
	public static void main(String[] args) {
		TestB b = new TestB(10, 20);
		b.disp();
		
		TestB c = new TestB();
		c.disp();
	}

}
