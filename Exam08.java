package ch01;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 12.
 * @���� : 
 */

public class Exam08 {

	public static void main(String[] args) {
		int a = 10 ;
		System.out.println( a == 10 ? "T" : "F");
		
		int b = 20 ;
		int c = 30 ;
		int d = b != c ? b : c ;
		System.out.println( "d" + d );
		
		int i = 100 ;
		System.out.println( i += 2 );	//i=i+2 102
		System.out.println( i -= 2 );	//100
		System.out.println( i *= 2 );	//200
		System.out.println( i /= 2 ); 	//100
		System.out.println( );
		
		int x = 10 , y = 20 , z = 30 ;
		System.out.println( x + "\t" + y + "\t" + z );
		
		//��� --------------------------------------
		// ���ڿ� + ���ڿ� = ���ڿ�
		// ���ڿ� + ������ ���� = ���ڿ�
		
		int su = 20 ;
		int value = 30 ;
		System.out.println(su);	//20
		System.out.println( "su : " + su ); // su : 20
		System.out.println( "su : " + su + "\t value : " + value ); 	// ���ڿ�+����������+���ڿ�+���������� = ���ڿ�
		System.out.println( su + " " + value );							// �� ���� ���� �ƴ� ���� ������ ����ϰ� ���� �� �� ��� ���. ��ǻ�ʹ� ���� 2���� ������ ������ ���ڿ��� ���̿� �־��ָ� ���ڿ��� �ٲ�
		System.out.println( "��� : " +  su + value );
		System.out.println( "��� : " + ( su + value ));
		System.out.println(su + value + "=" + 20 + 30 + "�Դϴ�");
		System.out.println(true);
	
	}
}
