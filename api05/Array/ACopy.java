package api05.Array;

import java.util.Arrays;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 6.
 * @���� : api = Arrays Ŭ���� : �迭���õ� Ŭ���� 
 */

public class ACopy {

	public static void main(String[] args) {
		char[] a = {'J','A','V','A'};
		char[] b = a;
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(a == b);	 	//���� ���� (�ּҰ��� ���� �ϴ� ��) //�޸𸮰��� ����
		
		// ���� ���� - ��ü���� (�����Ͱ��� ���� �ϴ� �� , ������ ����)
		// �޸� �ս� ����
		char [] c = Arrays.copyOf(a, a.length);
		System.out.println(Arrays.toString(c));
		System.out.println(a == c);
		
		// �κк���	
		char[] d = Arrays.copyOfRange(a,1,3); // 1~2���� ����
		System.out.println(Arrays.toString(d));
		
		
		
	}

}
