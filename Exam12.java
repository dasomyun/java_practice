package ch02;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 12.
 * @���� : ���� if ��
 */ 

public class Exam12 {

	public static void main(String[] args) {
		int num = 52 ;
		int value = 24 ;
		
		if ( num > value ) {
			System.out.println( "num > value" );
		} else if ( num == value ) {
			System.out.println( "num == value" );
		} else if (num < value ) {
			System.out.println( "num < value" );
		}
		System.out.println();
		
		String name = "ȫ�浿";
		int kor = 70 ;
		int eng = 88 ;
		int mat = 99 ;
		int tot = kor + eng + mat ;
		float avg = (float) tot / 3 ;
		
		if ( avg >= 90 ) {
			System.out.println("��");
		} else if ( avg >= 80 ) {
			System.out.println("��");
		} else if ( avg >= 70 ) {
			System.out.println("��");
		} else if ( avg >= 60 ) { 
			System.out.println("��");
		} else if ( avg < 60 ) {
			System.out.println("��");
		}
		//if���� �ش� ������ ã�´ٸ� ��� ������ ����������.
		
		String str = "" ;
		
		if ( avg >= 90 ) {
			str = "��";
		} else if ( avg >= 80 ) {
			str = "��";
		} else if ( avg >= 70 ) {
			str = "��";
		} else if ( avg >= 60 ) { 
			str = "��";
		} else if ( avg < 60 ) {
			str = "��";
		}
		System.out.println( "name: " + name + "\t total: " + tot + "\t score: " + str );
	
		
		
		
	}

}
