package ch07_interfaceC;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 31.
 * @���� : Phone interface�� ����� �޴� class
 */

public interface MobilePhone extends Phone {	//SMS ������ 
	public void sendSMS();
	public void receiveSMS();
}
