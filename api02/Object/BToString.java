package api02.Object;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 3.
 * @���� : api - String ( ToString )
 */

// �� �ҽ� ������ ���� �� String���� �ٲٴ� �� : parseInt
// �� �ҽ� ������ ���� �� String���� �ٲٴ� �� : toString ( �ڷ��� class�� �ٲ�� �� ! )


public class BToString {
	public static void main(String[] args) {
		
		Integer a = new Integer(10);
		String str = a.toString();
		System.out.println("�������� ���ڿ���:" + str);
		
		Float b = new Float(22.5f); //api class
		String bStr = b.toString();
		System.out.println("�Ǽ����� ���ڿ���:" + bStr);
		
		//------------------------------------------------
		
		BSmartPhone phone = new BSmartPhone("����", "�ȵ���̵�");
		String sPhone = phone.toString();
		System.out.println(sPhone);
	}

}
