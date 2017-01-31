package ch07_interfaceA;
	//��ҹ��ڸ� ��������� ex) xX, kK , Ss

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 31.
 * @���� : Audio Ŭ���� ( RemoteControl ��� )
 */

public class Audio implements RemoteControl {
	private int volum;

	@Override
	public void trunOn() {
		System.out.println("������� �մϴ�");
	}

	@Override
	public void trunOff() {
		System.out.println("������� ���ϴ�");
	}

	@Override
	public void setVolum(int volum) {
		if(volum > RemoteControl.MAX_VOLUME) {	//Audio.MAX_VOLUME �� ���� ( ��� �޾ұ� ���� ) ������ ��ӹ޾����ϱ� ����� Ŭ�������� ����ϱ� 
			this.volum = RemoteControl.MAX_VOLUME;
		} else if (volum < RemoteControl.MIN_VOLUME) {
			this.volum = RemoteControl.MIN_VOLUME;
		} else {
			this.volum = volum;
		}
		
		System.out.println("���� ����� ���� : " + this.volum);
	}
	
}
