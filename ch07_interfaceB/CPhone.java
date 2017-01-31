package ch07_interfaceB;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 31.
 * @내용 : Phone interface를 상속받는 CPhone 클래스
 */

public class CPhone implements Phone {

	@Override
	public void callSend() {
		System.out.println("가능합니다");
		
	}

	@Override
	public void canLte() {
		System.out.println("LTE 가능합니다");
		
	}

	@Override
	public void tvRemote() {
		System.out.println("리모컨 미탑재");
		
	}
	

}
