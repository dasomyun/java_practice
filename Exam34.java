package ch03;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 18.
 * @���� : �迭: �ּҰ� �ִ밪 ���ϱ�, �迭 ���� ���

 */

import java.util.Scanner;

public class Exam34 {
	public static void main(String[] args) {

		int x=0;
		
		int[] array = new int[5];
		System.out.println(array[0]); // �ڵ����� �ʱ�ȭ �ϱ� ������ 0
		
		
		//�ִ밪 �ּҰ�
		Scanner sc = new Scanner(System.in);
		
		//�Է� 15 48 66 77 3 ������ 4����Ʈ �� 20����Ʈ 
		for(int i=0; i<array.length; i++){
			System.out.print("���Է�: ");
			array[i]=sc.nextInt();
		}
		
		//���� (�ִ밪)
		int max = array[0];
		for(int i=0; i<array.length; i++){
			if(max<array[i]){
				max=array[i];
			}
		}
		System.out.println("max: " + max + "\n");
		
		int min = array[0];
		for(int i=0; i<array.length; i++){
			if(min > array[i]){
				min=array[i];
			}
		}
		System.out.println("min: " + min + "\n");
		
		//�迭 ���� ���
		char[] a = new char[] {'A','B','C'};
		char b[] = new char[] {'*', '^', '&'};
		char[] c={'x','y','z'};
		
		char[] i;
		//i={'A','B','C'};	//ERROR
		
		char[] j;
		j= new char[] {'x','y'};
		
		//�迭�� ����: �ѹ� �����ϸ� �߰�����, ����, ���������� �ȵȴ�.
		//�ǹ����� �迭�� ���� ���� �ʴ´�.
		
		sc.close();
	}
}