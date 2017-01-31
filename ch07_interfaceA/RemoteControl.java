package ch07_interfaceA;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 31.
 * @내용 : 인터페이스 
 */

public interface RemoteControl {
	
	//public static final 상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//public abstract 함수 
	public void trunOn();
	public void trunOff();
	public void setVolum(int volum);
}
