package ch08;

import ch07_interfaceA.Audio;
import ch07_interfaceA.RemoteControl;
import ch07_interfaceA.Television;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 1.
 * @���� : �޼ҵ� ���� ��ĳ���� �ٿ�ĳ���� ( instanceof )
 */

class Testing {
	private RemoteControl rc;

	public Testing(RemoteControl rc) {
		this.rc = rc;
	}
	
	public void method() {
		
		if(rc instanceof Television){
			System.out.println("Ƽ��ü");
			Television tv = (Television) rc;
			tv.setVolum(30);
		} else if(rc instanceof Audio) {
			System.out.println("�������ü");
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
