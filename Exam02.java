package ch01;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 11.
 * @���� : ������ �켱���� : 2) ���׿�����
 */

public class Exam02 {
	public static void main(String[] args) {
		boolean a = false ;
		boolean b =!a ;		//!!!!!!!!!a�� ����
		System.out.println( "a : " + a );
		System.out.println( "b : " + b );
		System.out.println( );
		
		int c = ~10;	// 0000 1010 
						// 1111 0101 = 11
		System.out.println( "c : " + c );
		
		int d = ~-15; 	// 1111 0001 �̰� ����ϴ¹� : 000�ڸ� ����� +1
						// 0000 1110
		System.out.println( "d : " + d );
		
		int x = 100 ;
		int y = -200 ;
		System.out.println( x + "\t" + y );
		System.out.println( -x + "\t" + -y );	// ���������Ϳ� ���� X
		System.out.println( x + "\t" + y );
		
		
	}

}
