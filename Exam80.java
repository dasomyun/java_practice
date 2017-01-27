package ch06;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 1. 25.
 * @내용 : 상속 예제
 * 			TV : 전원 ,채널
 * 			CaptionTV : 전원 , 채널 , 캡션
 */

class TV {
	protected boolean power;	// boolean의 초기값 : false
	protected int channel;
	
	public void power(boolean power){
		this.power = power;
	}
	
	public void channelUp (){
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
}

class CaptionTV extends TV {
	private boolean caption;
	
	public CaptionTV(boolean power, int channel, boolean caption){
		super.power = power;
		super.channel = channel;
		this.caption = caption;
	}
	
	public void display() {
		if(power == true && caption == true) {
			System.out.println(channel + "\t 캡션 준비가 되었습니다");
		} else 
			System.out.println("power 또는 caption을 켜세요");
	}
	
}
public class Exam80 {

	public static void main(String[] args) {
		CaptionTV tv = new CaptionTV(true, 11, true);
		tv.channelUp(); 	//channel : 12
		tv.channelDown();	//channel : 11
		tv.display();
		
		CaptionTV a = new CaptionTV(true, 10 , false);
		a.channelUp();
		a.display();
		
	}

}
