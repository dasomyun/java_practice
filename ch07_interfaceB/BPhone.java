package ch07_interfaceB;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 31.
 * @내용 : Phone interface를 상속받는 BPhone 클래스
 */

public class BPhone implements Phone {

	@Override
	public void callSend() {
		System.out.println("가능합니다");
		
	}

	@Override
	public void canLte() {
		System.out.println("LTE 불가능합니다 3G입니다");
		
	}

	@Override
	public void tvRemote() {
		System.out.println("리모컨 탑재");
		
	}
	

}
