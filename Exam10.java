package ch02;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 12.
 * @���� : if ��
 */

public class Exam10 {

	public static void main(String[] args) {
		int num = 52 ; 
		int value = 24 ;
		
		if ( num > value ) {
			System.out.println( "num�� value���� ũ��" );
		}
		if ( num == value ) {
			System.out.println( "num�� value�� ����" );
		}
		if ( num < value ) { 
			System.out.println( "num�� value���� �۴� \n" );
		}
		
		int su = 20 ;
		
		if ( su % 2 == 0 ) {
			System.out.println( "¦�� �Դϴ�" );
		}
		if ( su % 2 != 0 ) {
			System.out.println( "Ȧ�� �Դϴ�" );
		}
		String str = su % 2 == 0 ? "¦�� �Դϴ�" : "Ȧ�� �Դϴ�" ; 
		System.out.println(str);
	}

}
