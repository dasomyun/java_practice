package api05.Array;

import java.util.Arrays;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 7.
 * @���� : api - �迭�� equals() Ŭ���� 
 */

public class BEquals {

	public static void main(String[] args) {
		
		char[] a = {'J','A','V','A'};
		char[] b = a;	// �ּҰ� ���� 
		char[] c = Arrays.copyOf(a,a.length);
		
		System.out.println("a: " + Arrays.toString(a));
		System.out.println("b: " + Arrays.toString(b));
		System.out.println("c: " + Arrays.toString(c));
		
		System.out.println("�迭�� �ּҰ� : " + (a == b));	// �ּҰ� �� 
		System.out.println("�迭�� �ּҰ� : " + (a == c));
		System.out.println("���� ������ �� �� : " + (Arrays.equals(a, b))); // ���� ������ �� �� 
		System.out.println("���� ������ �� �� : " + (Arrays.equals(a, c)));
		
		// 2���� �迭 
		int [][] original = {{1,2} , {3,4}};
		int [][] cloned = Arrays.copyOf(original, original.length);		// �����Ͽ� �ٸ� �ּҰ��� ���� 
		
		System.out.println("�迭�� �ּҰ� �� : " + (original == cloned));
		System.out.println("���� �����Ͱ� �� : " + (Arrays.deepEquals(original, cloned)) + "\n"); // 2���� �迭���� ���� �����Ͱ� �񱳽� deepEquals ��� 
		// System.out.println("���� �����Ͱ� �� : " + (Arrays.equals(original, cloned)));
		
		// ���� (��������, ��������)
		int [] scores = {97, 99, 2, 4, 55};
		System.out.println("������ : " + Arrays.toString(scores));
		Arrays.sort(scores);	// ���� �����Ͱ� ���� ���� 
		System.out.println("�������� : " + Arrays.toString(scores)); 
		
		for(int i=(scores.length-1); i>=0; i--) {	// ��������
			System.out.print(scores[i] + "\t");
		}
		
		System.out.println("\n");
		
		String[] names = { "ȫ�浿" , "�ڵ���" , "��μ�" };
		Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));
		
		for(int i=(names.length-1); i>=0; i--) {	// �������� 
			System.out.print(names[i] + "\t");
		}
		
	}

}
