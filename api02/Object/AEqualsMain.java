package api02.Object;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 3.
 * @���� : api - String ( equal )
 */

public class AEqualsMain {
	public static void main(String[] args) {
		// ���� �ּҰ� ����
		String str1 = "apple";	
		String str2 = "apple";
		
		//���� �ٸ� �ּҰ� ����
		String str3 = new String("banana");
		String str4 = new String("banana");
		
		//string�� �����Ͱ��� �ƴ� �ּҰ��� �� (0x100 , 0x200�� ��) 
		if(str1 == str2) 
			System.out.println("T");
		else 
			System.out.println("F");
		
		if(str3 == str4) 
			System.out.println("T");
		else 
			System.out.println("F");
	
		// �ּҰ��� ����Ű�� �ִ� ���� ���� �� 
		if(str1.equals(str2)) 
			System.out.println("T");
		else
			System.out.println("F");
		
		if(str3.equals(str4)) 
			System.out.println("T");
		else
			System.out.println("F");
		
		System.out.println("----------------");
		
		AMember kim = new AMember("abc123");
		AMember park = new AMember("abc123");
		
		if(kim == park) 	//�ּҰ� �� 
			System.out.println("T");
		else 
			System.out.println("F");
		
		if(kim.equals(park))
			System.out.println("T");
		else
			System.out.println("F");

		//kim.equals(park);	
		//this : kim, obj : park
		
		if(kim.equals(park)) 	
			System.out.println("T");
		else 
			System.out.println("F");
		
		if(kim.equals(park))
			System.out.println("T");
		else
			System.out.println("F");

		//AMmeber Ŭ������ �������̵��� �ۼ��ϴ� ������� T�� ���� 
	}
}
