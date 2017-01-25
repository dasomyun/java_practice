package ch06;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 25.
 * @내용 : 상속 예제
 * 			Phone :	전원(켜기,끄기), 벨, 전화(듣기,말하기), 모델명, 색상 
 * 			DMB Phone : 전원(켜기,끄기), 벨, 전화(듣기,말하기), 모델명, 색상, DMB기능(DMB 수신, 종료, 채널)
 */

class CellPhone{
	//필드 - 정적인 것 
	protected String model;
	protected String color;
	
	//메소드 - 동작들 
	//전원기능 
	public void powerOn () {
		System.out.println("전원을 켭니다");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	//벨
	public void bell() {
		System.out.println("벨이 울립니다");
	}
	
	//대화기능
	public void sendVoice(String message) {
		System.out.println("me : " + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("you : " + message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다" + "\t");
	}
	
}

class DMBPhone extends CellPhone {
	private int channel;
	
	public DMBPhone(String model, String color , int channel) {
		super.model = model;
		super.color = color;
		this.channel = channel;
	}
	
	//DMB기능 (DMB (끄기, 켜기), 채널 변경)
	public void turnOnDmb() {
		System.out.println("채널 : " + channel + " 번 채널의 DMB 방송 수신을 시작합니다");
	}
	
	public void changeChannel(int channel){
		this.channel = channel;
		System.out.println("채널 : " + this.channel);
	}
	
	public void turnOffDmb() {
		System.out.println("채널 : " + channel + " 번 채널의 DMB 방송 수신을 종료합니다");	
	}
	
	public void disp() {
		System.out.println("모델 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("채널 : " + channel + "\n");
	}
	
}

public class Exam81 {
	public static void main(String[] args) {
		DMBPhone dmb = new DMBPhone("아이폰" , "골드", 11);
		dmb.disp();
		
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요");
		dmb.receiveVoice("안녕하세요 저는 송중기입니다");
		dmb.sendVoice("대박!! 웬일");
		dmb.hangUp();

		dmb.turnOnDmb();
		dmb.changeChannel(7);
		dmb.turnOffDmb();
		
		dmb.powerOff();

		
	}

}
