package ch03;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 18.
 * @���� : �迭
 */
import java.util.Scanner;

public class Exam32 {

	public static void main(String[] args) {

		//ŵ��� �����͸� �Է¹޴´�, 
		int[] array = new int[5]; // 20byte
		Scanner sc = new Scanner(System.in);
				
		//�Է�
		for(int i = 0; i<array.length ;i++){
			System.out.println("�� �Է� :");
			array[i]=sc.nextInt();
		}
		
		//����
		int hap = 0;
		for(int i=0; i<array.length; i++){
			hap+=array[i];
		}
		
		//���
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]+"\t");
		}
		System.out.println("hap: " + hap);
		
		
		sc.close();
		
	}

}
