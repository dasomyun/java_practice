package ch04;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 20.
 * @���� : final ���
 */

public class Exam57 {

	public static final int VALUE = 88;
	
	public static void main(String[] args) {
		final int SU = 77;
	//	SU = 88;  error
		
		System.out.println(SU);
		System.out.println(VALUE);
		sub();
	}
	
	public static void sub() {
		//System.out.println(SU);	// ERROR
		System.out.println(VALUE);
		//VALUE = 99;
	}
	
	public static void aa() {}
	public void bb(){}
	public final void cc(){}
	public static final void dd(){}

}
