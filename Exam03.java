package ch01;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 12.
 * @���� : ������ �켱����
 */

public class Exam03 {

	public static void main(String[] args) {
		int x = 10 ;
		x++ ;	//11 ������ ������(�ϳ��� ����)
		++x ;	//12 ������ ������
		System.out.println(x); //12
		
		--x ;	//11 ������ ������(�ϳ��� ����)
		x-- ;	//10 ������ ������
		System.out.println(x);
		
		int y = 20 ;
		int z = y++ ;
		System.out.println( y + "\t" + z ); // y = 21; z = 21;
		
		int a = 10;
		int b = 20;
		int c = a++ + ++b;		//�켱������ ���� ������ : ������������(++b) , ���������(+) , ���Կ�����(=) , ������������(a++)
		System.out.println(c);
		System.out.println();
				
		int d = 30;
		System.out.println( "d: " + d++ );

	}

}
