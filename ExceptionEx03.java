package ch10.exception;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 2.
 * @���� : ����ó�� - ArrayIndexOutOfBoundsException
 */

public class ExceptionEx03 {	// kim park lee�� �־ lee�� �ȹ����� �׸��̴�. ����X 	// kim�� ������ ����O
	
	public static void main(String[] args) {	
		
		try {
			String s = args[0];
			String t = args[1];
			
			System.out.println("ù��° �迭 �� : " + s);
			System.out.println("�ι�° �迭 �� : " + t);
		} catch(ArrayIndexOutOfBoundsException obj) {
			System.out.println("�迭 ���� Ʋ���ϴ�.");
		}
	}
}

// ���� ���� catch �������� �� 