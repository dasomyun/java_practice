package ch02;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 16.
 * @���� : continue ��, break ��
 */

public class Exam26 {

	public static void main(String[] args) {
		
		for(int i=0; i<3; i++){
			for(int j=0; j<5; j++){
				if(j==3) {
					//break;
					continue;
				}
				System.out.println(i + "\t" + j);
			}
		}
		
	

			AA : for(int i=0; i<3; i++){
				for(int j=0; i<5; j++){
					if(j==3) {
						//break AA;  //AA �� ������ ��������
						continue AA; // i++�� �� 
					}
					System.out.println(i + "\t" + j);
				}
			}
			
		
		
		
		
		
		
	}

}
