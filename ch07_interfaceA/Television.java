package ch07_interfaceA;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 31.
 * @내용 : Television 클래스 ( RemoteControl 상속 )
 */

public class Television implements RemoteControl {	// 구현 클래스 
	private int volum;

	@Override
	public void trunOn() {
		System.out.println("tv를 켭니다");
		
	}

	@Override
	public void trunOff() {
		System.out.println("tv를 끕니다");
	}

	@Override
	public void setVolum(int volum) {
		
		if(volum > RemoteControl.MAX_VOLUME){
			this.volum = RemoteControl.MAX_VOLUME;
		} else if (volum < RemoteControl.MIN_VOLUME) {
			this.volum = RemoteControl.MIN_VOLUME;
		} else {
			this.volum = volum;
		}
		System.out.println("현재 TV 볼륨 : " + this.volum);
		
	}
	
}
