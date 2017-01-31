package ch07_interfaceC;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 31.
 * @내용 : Phone 메인 
 */

public class PhoneMain {
	
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.sendCall();
		sp.receiveCall();
		System.out.println();
		
		sp.sendSMS();
		sp.receiveSMS();
		System.out.println();
		
		sp.play();
		sp.stop();
		
		int result = sp.calculator(10,  20);
		System.out.println("연산결과 : "+ result);
		sp.schedule();

	}

}
