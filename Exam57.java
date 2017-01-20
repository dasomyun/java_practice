package ch04;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 20.
 * @내용 : final 상수
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
