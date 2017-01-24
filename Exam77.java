package ch05;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 24.
 * @���� : final ���� , final �Լ� , static final ���� , static final �Լ�
 */

class TestH{
	public final double PI = 3.141592;		//�ɹ� final ��� 
	public static final int VALUE = 1;		//static final ��� 
	
	public void setPI(double PI) {
		//this.PI = PI;		error final�� ���� ������ �� ����
	}	

	public double getPI() {
		return PI;
	}
	
	public void sub() {
		final int SU = 77; 	//���� final ��� 
		
		System.out.println("PI : " + PI);
		System.out.println("SU : " + SU);
		System.out.println("VALUE : " + VALUE);
		
		aa();
		bb();
		fun();
	}
	
	public static void fun(){	//static �� �����͸� ��� 
		final int IMSI = 77;
		System.out.println("IMSI : " + IMSI);
		// System.out.println("PI : " + PI); static�� ���� �͸� ����� �� ���� 
		System.out.println("VALUE : " + VALUE);
		// aa();	error static�� ��� ����!!
		bb();
	}
	
	public final void aa() {	
		
	}
	
	public static final void bb() {
		
	}
}

public class Exam77 {

	
	public static void main(String[] args) {
		TestH t = new TestH();
		System.out.println(t.PI);
		System.out.println(TestH.VALUE);
		
	}

}
