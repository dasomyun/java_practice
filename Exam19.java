package ch02;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 16.
 * @���� : for �� ������ 
 */

public class Exam19 {

	public static void main(String[] args) {
		
		int dan = 2;
		for(int i = 1; i<=9; i++) {
			System.out.println( dan + "x" + i + "=" + (dan*i) ); 	//(dan*i)���� ��ȣ�� �־����� ������ ���ڿ��� �ν� 
		}
		System.out.println( "\n" );
		
		int hap = 0 ;
		for( int i=1; i<=10; i++ ){
			hap = hap + i;
			System.out.print(i);
			
			if(i<=9){
				System.out.print("+");
			}else {
				System.out.print( "=" + hap );
			}
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
