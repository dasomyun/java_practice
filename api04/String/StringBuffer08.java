package api04.String;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 6.
 * @���� : api - StringBuffer  , StringBuilder
 * 			String Ŭ������ ���ؼ� �ӵ��� ������, ���� ������ ó�� ���� 
 */

public class StringBuffer08 {

	public static void main(String[] args) {
		
		String s1 = "��õ��";
		String s2 = "��õ��";
		// ���� ���� ����
		
		String s3 = "���ѹα�";
		System.out.println("s1 : " + s1.hashCode() + "\t" + s1);
		System.out.println("s2 : " + s2.hashCode() + "\t" + s2);
		System.out.println("s3 : " + s3.hashCode() + "\t" + s3);
		
		s1 = s1+s3;
		System.out.println("s1 : " + s1.hashCode() + "\t" + s1);

		System.out.println("\n\n");
		
		StringBuffer a = new StringBuffer("�츮����");
		StringBuffer b = new StringBuffer("���ѹα�");
		System.out.println(a.hashCode() + "\t" + a);
		System.out.println(b.hashCode() + "\t" + b);
		
		a.append(b);
		a.append("��������");
		a.append("�������� �Ⱦ�");
		a.append("�ݿ����� ����");
		
		System.out.println(a.hashCode() + "\t" + a);
		
		
		
	}

}
