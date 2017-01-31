package ch07_interfaceB;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 31.
 * @내용 : phone 메인 클래스 
 */

public class PhoneMain {

	public static void main(String[] args) {
		Phone[] phone = new Phone[3];
		phone[0] = new APhone();
		phone[1] = new BPhone();
		phone[2] = new CPhone();
		
		for(int i=0; i<phone.length; i++){
			phone[i].callSend();
			phone[i].canLte();
			phone[i].tvRemote();
			System.out.println("\n");
		}
		
	}

}
