package ch06;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 25.
 * @���� : ��� - ������ ���
 */

class ParentsB {
	protected int x, y;
}

class SonB extends ParentsB {
	private int z;
	
	public SonB(){
		System.out.println("�⺻ ������");
	}
	
	public SonB(int x){
		super.x = x;
		y = 20;
		z = 30;
	}
	
	public SonB(int x, int y, int z) {
		super.x = x;
		super.y = y;
		this.z = z;
	}
	
	public void disp() {
		System.out.println(x + "\t" + y + "\t" + z );
	}
	
}

public class Exam82 {
	public static void main(String[] args) {
		SonB a = new SonB();
		SonB b = new SonB(10);
		SonB c = new SonB(77, 88, 99);
		
		a.disp();
		b.disp();
		c.disp();
		
		
		
		
		
	}

}
