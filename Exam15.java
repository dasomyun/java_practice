package ch02;
		
/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 16.
 * @���� : switch��
 */
		
public class Exam15 {
	public static void main(String[] args) {
		
		int su = 2 ;
		
		switch(su) {
		
		case 1:		//if(su==1)
			System.out.println("hahaha");
			break;
		case 2:
			System.out.println("hohoho");
			break;
		case 3:
			System.out.println("hi");
			break;	//�� ������ ��������
		default:
			System.out.println("how are you?");
			
		}
		//switch case���� ���ǿ� �����ص� ���� ������ ��� ���� (�� ������ ���������� ����) �׷��� break ���!
		//if �������� break���� ����Ҽ� ����
		
		System.out.println("\n");
		
		int value = 5 ;
		
		switch(value + 10){ // 15
		case 10:
			System.out.println("����� 10 �Դϴ�.");
			break;
		case 15:
			System.out.println("����� 15 �Դϴ�.");
			break;
		case 20:
			System.out.println("����� 20 �Դϴ�.");
			break;
		case 25:
			System.out.println("����� 25 �Դϴ�.");
		}
		
		System.out.println("\n");
		
		switch(su%2){		// 10/5 ��:5 ������ 0
		case 0:
			System.out.println("¦��");
			break;
		case 1:
			System.out.println("Ȧ��");
			break;
		}
		
	}

}
