package ch07_interfaceB;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 31.
 * @���� : Phone interface�� ��ӹ޴� CPhone Ŭ����
 */

public class CPhone implements Phone {

	@Override
	public void callSend() {
		System.out.println("�����մϴ�");
		
	}

	@Override
	public void canLte() {
		System.out.println("LTE �����մϴ�");
		
	}

	@Override
	public void tvRemote() {
		System.out.println("������ ��ž��");
		
	}
	

}
