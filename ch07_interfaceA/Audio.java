package ch07_interfaceA;
	//대소문자를 섞어쓰지말기 ex) xX, kK , Ss

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 31.
 * @내용 : Audio 클래스 ( RemoteControl 상속 )
 */

public class Audio implements RemoteControl {
	private int volum;

	@Override
	public void trunOn() {
		System.out.println("오디오를 켭니다");
	}

	@Override
	public void trunOff() {
		System.out.println("오디오를 끕니다");
	}

	@Override
	public void setVolum(int volum) {
		if(volum > RemoteControl.MAX_VOLUME) {	//Audio.MAX_VOLUME 도 가능 ( 상속 받았기 떄문 ) 하지만 상속받았으니까 상속한 클래스명을 사용하기 
			this.volum = RemoteControl.MAX_VOLUME;
		} else if (volum < RemoteControl.MIN_VOLUME) {
			this.volum = RemoteControl.MIN_VOLUME;
		} else {
			this.volum = volum;
		}
		
		System.out.println("현재 오디오 볼륨 : " + this.volum);
	}
	
}
