package ch07_interfaceC;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 31.
 * @내용 : PDA의 상속을 받는 SmartPhone class
 */

public class SmartPhone extends PDA implements MobilePhone, MP3 {

	@Override
	public void sendCall() {
		System.out.println("전화 걸기");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 받기");
	}

	@Override
	public void play() {
		System.out.println("음악 재생");
	}

	@Override
	public void stop() {
		System.out.println("재생 중지");
	}

	@Override
	public void sendSMS() {
		System.out.println("SMS 보내기");		
	}

	@Override
	public void receiveSMS() {
		System.out.println("SMS 받기");
	}
	
	public void schedule() {
		System.out.println("일정 관리");
	}
	
}
