package ch10.exception;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 2.
 * @���� : ����ó�� (finally) - NumberFormatException , ArithmeticException , ArrayIndexOutOfBoundsException
 */

public class ExceptionEx06 {
	public static void main(String[] args) {
		
		try {
			
			int su = Integer.parseInt(args[0]);
			int value = Integer.parseInt(args[1]);
			
			int div = su/value;
			System.out.println("div : " + div);
			
			// ������
			
		} catch (NumberFormatException dbj) {
			System.out.println("���ڸ� �Է��ϼ���");
		} catch (ArithmeticException obj){
			System.out.println("0���� ���� �� �����ϴ�");
		} catch (ArrayIndexOutOfBoundsException obj) {
			System.out.println("�迭���� ���� �߸� �Է��ϼ̽��ϴ�");
		} finally {													// network����� , db , ���� ����½� close ���ִ� �ڸ�
			System.out.println("��� ����ó���� ���½��ϴ�");		// error�� ���� �ʾƵ� ��.��.�� �����
		}
		
		System.out.println("END");
		
	}

}
