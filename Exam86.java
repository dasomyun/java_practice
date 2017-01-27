package ch06;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 25.
 * @���� : ��� - �Լ� ������ ( Overriding )
 */

class ParentsE {
	protected int x , y;

	public ParentsE() {
		x = 0;
		y = 0;
	}
	
	public ParentsE(int x, int y){ 
		this.x = x;
		this.y = y;
	}
	
	public void yonsan() { 
		System.out.println("hap : " + (x+y));
	}
}

class SonE extends ParentsE{
	public SonE() {
		
	}
	
	public SonE(int x, int y) {
		super(x,y);
	}
	
	public void yonsan() {
		System.out.println("���� : " + (x-y));
	}
	
}

public class Exam86 {

	public static void main(String[] args) {
		ParentsE e = new ParentsE(10, 20);
		
		SonE s = new SonE(77, 88);
		
		s.yonsan();
		
		ParentsE f= new SonE(100, 200);	//upCasting
		f. yonsan();
		
		//SonE o = (SonE) new paremtsE(55, 66); error //����� ����ȯ �ʿ� 
		//�� ������ ����ȯ�� �� ��ü�� �ٽ� ��������� ����ȯ ���� 
		//SonE o = new ParentsF(55, 66);
		
		// SonE o (SonE) f;
	}

}
