package ch08;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 31.
 * @���� :  ����� �������� 
 */

class Hap {
	private Mul mul;
	private int x = 10;
	private int y = 20;
	
	public void setMul(Mul mul) {
		this.mul = mul;
	}
	
	public void output() {
		System.out.println("�� : " + (x + y));

	}
}

class Mul {
	private Hap hap;
	private int a = 30;
	private int b = 40;
	
	public void setHap(Hap hap) {
		this.hap = hap;
	}
	
	public void print() {
		System.out.println("�� : " + (a * b));
	}
}


public class Exam100 {
	public static void main(String[] args) {
		Hap hap = new Hap();
		Mul mul = new Mul();
		
		hap.setMul(mul);
		mul.setHap(hap);
		
		mul.print();
		hap.output();
	}

}
