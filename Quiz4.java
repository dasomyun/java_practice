package practice;
/* ���� : �� ���� java�� ������ ���� ���ٱ��� p347
 * �� 13-1[�迭�� �޼ҵ�]
 * int�� 1���� �迭�� �Ű������� ���޹޾Ƽ� �迭�� ����� �ִ밪, 
 * �׸��� �ּҰ��� ���ؼ� ��ȯ�ϴ� �޼ҵ带 ������ ���·� ���� ��������.
 * public static int minValue(int[] arr) {...}
 * public static int maxValue(int[] arr) {...}
 */

import java.util.Scanner;

public class Quiz4 {

public static int minValue(int[] arr) {	//�ּҰ� ��ȯ
	int min=arr[0];
	
	for(int i=0; i<arr.length; i++){
		if(arr[i]<arr[0])
			min=arr[i];
	}
	return min;
}

public static int maxValue(int[] arr) {	//�ִ밪 ��ȯ
	int max=arr[0];
	
	for(int i=0; i<arr.length; i++){
		if(arr[i]>arr[0])
			max=arr[i];
	}
	return max;

}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max;
		int min;
		
		int[] arr = new int[5];	//�迭 ����
		for(int i=0; i<arr.length; i++){	//�Է¹���
			System.out.println("�迭�� �������� �Է��ϼ��� :(5������) ����" + (i+1) + "��°");
			arr[i] = sc.nextInt();
		}
		min = minValue(arr);
		max = maxValue(arr);
		
		System.out.println("�ּҰ� : " +min + "\t�ִ밪 : " + max);
		
		sc.close();
	}

}
