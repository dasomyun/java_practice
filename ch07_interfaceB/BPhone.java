package ch07_interfaceB;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 31.
 * @���� : Phone interface�� ��ӹ޴� BPhone Ŭ����
 */

public class BPhone implements Phone {

	@Override
	public void callSend() {
		System.out.println("�����մϴ�");
		
	}

	@Override
	public void canLte() {
		System.out.println("LTE �Ұ����մϴ� 3G�Դϴ�");
		
	}

	@Override
	public void tvRemote() {
		System.out.println("������ ž��");
		
	}
	

}
