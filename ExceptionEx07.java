package ch10.exception;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 2.
 * @���� : ����ó�� - Throwable , Exception
 */

public class ExceptionEx07 {
	public static void main(String[] args) {
		
		try {
			
			int su = Integer.parseInt(args[0]);
			int value = Integer.parseInt(args[1]);
			
			int div = su/value;
			System.out.println("div : " + div);
			
		} catch (Throwable obj) {	// obj�� ������ ���� �������� ���ɴϴ�
			System.out.println("�� �Է��� ��Ȯ�� Ȯ���ϼ��� ");
		}
		
//		} catch (Exception obj) {	 	// �̰͵� ����
//			System.out.println("�� �Է��� ��Ȯ�� Ȯ���ϼ��� ");
//		}
		
		System.out.println("END");
		
	}

}
