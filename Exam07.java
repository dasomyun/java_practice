package ch01;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 12.
 * @���� : 
 */

public class Exam07 {

	public static void main(String[] args) {
	byte a = 10 ;
	byte b = 2 ; 
	//0000 1010
	//0000 0010
	
	System.out.println( "a&b : " + (a&b) );	//0000 0010  2
	System.out.println( "a|b : " + (a|b) ); 	//0000 1010 10
	System.out.println( "a^b: " + (a^b) ); 	//0000 1000 8
	
	int x = 15;
	boolean y = x > 10 && x < 20 ;	//�̷� ������ �� ��, �켱������ �������� 
	boolean z = x == 10 || x == 15 ;
	System.out.println(y);
	System.out.println(z);
		
		
		
		
		
		
	}

}
