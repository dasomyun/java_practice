package ch02;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 16.
 * @���� : break ��, continue �� 
 */

public class Exam25 {

	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {
			if(i==5){
				break;	//if�� �ܵ����δ� break���� ����� �� ����, if���� ������ ���� ����� �� ������ ����������.
			}
			System.out.println(i);
		}
		System.out.println("\n");
		
		for(int i=1; i<=10; i++){
			if(i==5) {
				continue;
			}
			System.out.println(i);	//���� ������ ����
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
