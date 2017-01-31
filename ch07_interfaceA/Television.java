package ch07_interfaceA;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 31.
 * @���� : Television Ŭ���� ( RemoteControl ��� )
 */

public class Television implements RemoteControl {	// ���� Ŭ���� 
	private int volum;

	@Override
	public void trunOn() {
		System.out.println("tv�� �մϴ�");
		
	}

	@Override
	public void trunOff() {
		System.out.println("tv�� ���ϴ�");
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
		System.out.println("���� TV ���� : " + this.volum);
		
	}
	
}
