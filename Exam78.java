package ch06;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 25.
 * @���� : ��� (����)
 */

class ParentsA {	
	private int g;
	public char z;
	protected int x,y;
	
	protected void sub() {
		System.out.println("�ȳ��ϼ���");
	}
}

class SonA extends ParentsA {	// ����� ������ ���ſ� ���� , this ó�� ��� ���� , private �� ����� ���������ڴ� ��� �Ұ��� 
	private int a, b;
	
	public void setData(int x, int y, char z, int a, int b){
		super.x = x;
		super.y = y;
		super.z = z;
		this.a = a;
		this.b = b;
	}
	
	public void disp() {
		// System.out.println(g); error  (private ����)
		System.out.println(z);
		
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);	//this ���� super �ֿ��ϱ� 
		
		System.out.println(y);
		System.out.println(this.y);	// this ����
		System.out.println(super.y);	//super ���� 
		
		System.out.println(a);	//a�� super �Ұ��� ( a��SonA���� ����Ʊ� ���� )
		System.out.println(this.a);
	}
}

public class Exam78 {
	public static void main(String[] args) {
		ParentsA p = new ParentsA();
		p.sub();
		
		SonA s = new SonA();
		s.setData(10, 20, '#' , 77, 88);
		s.disp();
	}

}
