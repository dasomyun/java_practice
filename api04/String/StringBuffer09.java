package api04.String;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 6.
 * @���� : api - StringBuffer  , StringBuilder 
 * 			insert(), setCharAt(), replace(), deleteCharAt(), delete(), reverse()
 */

public class StringBuffer09 {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer(" ** JAVA");
		System.out.println("Str : " + str);
		
		str.insert(3, "GOOD");
		System.out.println("���� ���� : " + str); 	//���� ������ ������
		
		str.setCharAt(1,'#');	
		System.out.println("���� ġȯ : " + str);  //���� ������ ������
		
		str.replace(3, 7, "LOVE");
		System.out.println("���ڿ� ġȯ : " + str);  //���� ������ ������
		
		str.deleteCharAt(1);
		System.out.println("���ڿ� ���� : " + str);
		
		str.delete(7, 11); 	//7�������� 11���� �� �� 7���� ~ 10����
		System.out.println("���ڿ� ���� : " + str);
		
		str.reverse();
		System.out.println("���ڿ� ���� ��� : " + str);
		
		
	}

}
