package ch06;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 25.
 * @���� : ��� ����
 * 			TV : ���� ,ä��
 * 			CaptionTV : ���� , ä�� , ĸ��
 */

class TV {
	protected boolean power;	// boolean�� �ʱⰪ : false
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
			System.out.println(channel + "\t ĸ�� �غ� �Ǿ����ϴ�");
		} else 
			System.out.println("power �Ǵ� caption�� �Ѽ���");
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
