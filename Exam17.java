package ch02;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 16.
 * @���� : for �� 
 */
//while���� record ó���Ҷ�, db�Ҷ� ���� ���ȴ�.
//for���� ��ġ�ݺ�, while���� record�ݺ��� ��� 
public class Exam17 {

	public static void main(String[] args) {
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("\n");
		
		for(int i = 1; i <= 5; i++ ) {
			System.out.println("�ȳ��ϼ���");
		}
		
		System.out.println("\n");
		
		for(int j=5;j>=1;j--){
			System.out.println("�����~");
		}
		
		System.out.println("\n");
		
		for(int k =1; k<=10; k++){
			System.out.print( k + "\t");
		}
		
		System.out.println("\n");
		
		for(int r = 10; r>=1; r-- ){
			System.out.print(r + "\t");
		}
	}

}
