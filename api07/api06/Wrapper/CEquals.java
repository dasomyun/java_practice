package api06.Wrapper;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 7.
 * @���� : boxing , unBoxing�� equals()
 */

public class CEquals {

	public static void main(String[] args) {
		
		Integer o = 300;
		Integer b = 300;
		System.out.println(o==b);
		System.out.println(o.intValue() == b.intValue());
		System.out.println(o.equals(b) + "\n");
		
		Integer x = 10;
		Integer y = 10;	// y = x
		System.out.println(x == y);	// -128~+127 �̸��� ��� �ּ� ������ �����Ͱ� ���� 
		System.out.println(x.intValue() == y.intValue());
		System.out.println(x.equals(y) + "\n");
		
		
	}

}
