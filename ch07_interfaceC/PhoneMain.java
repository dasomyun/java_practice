package ch07_interfaceC;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 31.
 * @���� : Phone ���� 
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
		System.out.println("������ : "+ result);
		sp.schedule();

	}

}
