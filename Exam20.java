package ch02;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 16.
 * @���� : ���� for��
 */

public class Exam20 {

	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) {
			for(int j=1;j<=5; j++){
				System.out.println( i + "\t" + j );
			}
			System.out.println();
		}
		
	
		for(char i='A'; i<='Z'; i++) {		//ASCII �ڵ� ���� A=65, Z=90 ���� ���
			for(char j=i; j<='Z'; j++) {
				System.out.print(j);	
			}
			System.out.println();
		}

	}

}
