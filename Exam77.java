package ch05;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 24.
 * @내용 : final 변수 , final 함수 , static final 변수 , static final 함수
 */

class TestH{
	public final double PI = 3.141592;		//맴버 final 상수 
	public static final int VALUE = 1;		//static final 상수 
	
	public void setPI(double PI) {
		//this.PI = PI;		error final은 값을 대입할 수 없음
	}	

	public double getPI() {
		return PI;
	}
	
	public void sub() {
		final int SU = 77; 	//지역 final 상수 
		
		System.out.println("PI : " + PI);
		System.out.println("SU : " + SU);
		System.out.println("VALUE : " + VALUE);
		
		aa();
		bb();
		fun();
	}
	
	public static void fun(){	//static 이 붙은것만 사용 
		final int IMSI = 77;
		System.out.println("IMSI : " + IMSI);
		// System.out.println("PI : " + PI); static이 붙은 것만 사용할 수 있음 
		System.out.println("VALUE : " + VALUE);
		// aa();	error static만 사용 가능!!
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
