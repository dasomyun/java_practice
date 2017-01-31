package ch07_interfaceC;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 31.
 * @내용 : Phone interface의 상속을 받는 class
 */

public interface MobilePhone extends Phone {	//SMS 보내기 
	public void sendSMS();
	public void receiveSMS();
}
