package ch07_interfaceC;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 31.
 * @���� : PDA�� ����� �޴� SmartPhone class
 */

public class SmartPhone extends PDA implements MobilePhone, MP3 {

	@Override
	public void sendCall() {
		System.out.println("��ȭ �ɱ�");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ �ޱ�");
	}

	@Override
	public void play() {
		System.out.println("���� ���");
	}

	@Override
	public void stop() {
		System.out.println("��� ����");
	}

	@Override
	public void sendSMS() {
		System.out.println("SMS ������");		
	}

	@Override
	public void receiveSMS() {
		System.out.println("SMS �ޱ�");
	}
	
	public void schedule() {
		System.out.println("���� ����");
	}
	
}
