package ch06;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 25.
 * @���� : ��� - ������ ���
 */

class ParentsC{
	protected int x, y;
	
	public ParentsC(){
		System.out.println("�θ� �⺻ ������");
	}
	
	public ParentsC(int x) {
		this.x = x;
		y = 20;
	}
	
	public ParentsC(int x, int y) {
		this.x = x;
		this.y = y; 
	}
}


class SonC extends ParentsC {
	private int z;
	
	public SonC() {
		super(10);	//���� ����Ʈ �����ڰ� �ƴ� �Ű������� int���� �����ڸ� ���ڴ� , ������ : ��ӹ��� �� super ������ this
		System.out.println("�ڽ� �⺻ ������");
	}
	
	public SonC(int x) {
		super(x);		//ParentsC(int x) ����
		this.z = 30;
	}
	
	public SonC(int x, int y, int z) {
		super(x,y);		//ParentsC(int x, int y) ����
		this.z = z;
	}
	
	public void disp() {
		System.out.println(x + "\t" + y + "\t" + z );
	}
}



public class Exam83 {	// �����ڴ� �θ� Ŭ���� �����ڸ� ������ �� �θ� ������ �����Ѵ�.
	public static void main(String[] args) {
		SonC son = new SonC();
		son.disp();
		
		SonC a = new SonC(10);
		a.disp();
		
		SonC c = new SonC(77, 88, 99);
		c.disp();
	}

}
