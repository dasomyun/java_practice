package ch01;


//shift + alt + j

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 11.
 * @���� : �ڷ��� ( ����, �Ǽ�, ����, ���ڿ�, ���� )
 */

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ȭ�� �����
		System.out.println( "������" );
		System.out.print( "How are you" );
		System.out.println( "hi" );
		System.out.println();
		
		System.out.println( "������(�⺻) �ڷ���" );
		
		byte a = 10 ;		//1byte(-128~127)
		short b = 129 ;		//2byte(-32768~32767)
		int c = 1000 ; 		//4byte(-2147483648~2147483647)
		long d = 6580L ; 	//8byte(-2^63~2^63-1)
		
		System.out.println( "a�� �� : " + a );
		System.out.println( "b�� �� : " + b );
		System.out.println( "c�� �� : " + c );
		System.out.println( "d�� �� : " + d );
		System.out.println();
		
		System.out.println( "�Ǽ��� �ڷ���" );
		
		float e = 45.4f ;	//4byte
		double f = 120.40 ;	//8byte
		
		System.out.println( "e�� ���� : " + e );
		System.out.println( "f�� ���� : " + f );
		
		System.out.println( "������ �ڷ���" );
		char x = 'A' ;	//2byte
		char y = '��' ;	//2byte
		System.out.println( "x�� ���� : " + x );
		System.out.println( "y�� ���� : " + y );
		
		System.out.println( "����");
		boolean bb = true ;		//1byte true = 1 , false = 0 
		boolean cc = false ;	//1byte
		System.out.println( bb );
		System.out.println( cc );
		
		System.out.println( "���ڿ� �ڷ���" );
		String str1 = "�ȳ��ϼ���" ; //����������
		String str2 = "Hi" ;
		System.out.println( str1 );
		System.out.println( str2 );

		
		
	}

}
