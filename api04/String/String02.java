package api04.String;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 6.
 * @���� : api - String Ŭ����
 * 				equals() , toLowerCase() , toUpperCase() , equalsIgnoreCase()
 */

public class String02 {
	public static void main(String[] args) {
		String a = "apple";
		String b = "apple";
		System.out.println("�ּҰ� �� : " + (a==b));	// T 
		System.out.println("������ �� : " + a.equals(b));
		
		String x = new String("hi");
		String y = new String("hi");
		System.out.println("�ּҰ� ��: " + (x==y));	// F
		System.out.println("������ ��: " + x.equals(y));
		System.out.println("\n\n");
		
		String s = new String("banana");
		String t = new String("BANANA");
		System.out.println("��ҹ��� ���� : " + s.equals(t));
		System.out.println("��ҹ��� ���о��� : " + s.equalsIgnoreCase(t));
		
		String original = "java Programing";
		String lower = original.toLowerCase();
		String upper = original.toUpperCase();
		System.out.println("�ҹ��� : " + lower);
		System.out.println("�빮�� : " + upper);
		System.out.println("���� ������ : " + original);
		
		
		
	}

}
