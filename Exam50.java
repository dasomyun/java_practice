package ch04;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 19.
 * @���� : �Լ� - Call By Value ( �迭 )
 */
// ���ҽ� ������ �������� ������ ���� String
// ���ҽ� ������ ������ ������ ���� : String
public class Exam50 {

	public static void main(String[] args) {
		String[] str = new String[] {"kim", "park", "lee"};
		sub(str);
		
		String[] array=fun();
		System.out.println(array.length);
	}
	
	public static String[] fun() {
		String[] array = new String[] {"�ȳ��ϼ���", "�ݰ�����"};
		return array;
	}
	
	public static void sub(String[] str){
		System.out.println(str.length);
	}

}
