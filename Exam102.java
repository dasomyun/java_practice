package ch08;

import ch07_interfaceA.Audio;
import ch07_interfaceA.RemoteControl;
import ch07_interfaceA.Television;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 1.
 * @내용 : 메소드 안의 업캐스팅 다운캐스팅 ( instanceof )
 */

class Testing {
	private RemoteControl rc;

	public Testing(RemoteControl rc) {
		this.rc = rc;
	}
	
	public void method() {
		
		if(rc instanceof Television){
			System.out.println("티비객체");
			Television tv = (Television) rc;
			tv.setVolum(30);
		} else if(rc instanceof Audio) {
			System.out.println("오디오객체");
			Audio audio = (Audio) rc;
			audio.setVolum(10);
		}
		
	}
}


public class Exam102 {
	public static void main(String[] args) {
		
		Testing tv = new Testing(new Television());
		tv.method();
		Testing audio = new Testing(new Audio());
		audio.method();
	}

}
