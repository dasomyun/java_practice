package api06.Wrapper;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 7.
 * @���� : Boxing , UnBoxing
 * 			Wrapper�� �⺻Ÿ��(�ڷ���) ���� �����ϴ� ���� ��Ī�Ѵ�. �� �⺻Ÿ���� Ŭ������ �����Ѵ�.
 */

public class ABoxing {

	public static void main(String[] args) {
		
		// �ڽ� (Boxing) : �⺻ �ڷ����� ��ü�� ����� ����
		int su = 100;
		
		Integer obj1 = new Integer(su);
		Integer obj2 = Integer.valueOf(su);
		System.out.println(obj1.toString() + "\t" + obj1);
		System.out.println(obj2.toString() + "\t" + obj2);
		
		// ��ڽ� (UnBoxing) : ��ü�� �⺻�ڷ������� ����� ���� 
		Integer obj3 = new Integer(500);
		int value = obj3.intValue();
		System.out.println("value : " + value);
		
	}

}
