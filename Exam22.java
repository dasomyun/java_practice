package ch02;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 16.
 * @���� : while �� 
 */

public class Exam22 {

	public static void main(String[] args) {
		for (int i=1; i<=10; i++) {
			System.out.print(i + "\t");
		}
		System.out.println("\n");
		
		int x=1;
		while(x<=10) {
			System.out.print(x + "\t");
			x++;
		}
		System.out.println("\n");
		
		int y = 1;
		int sum = 0 ;
		
		while(y<=100) {
			sum+=y;
			y++;
		}
		System.out.println("sum: "+ sum);
		System.out.println("\n");
		
		int i = 1;
		while(i<=5){
			int j = 1;
			while(j<=3){
				System.out.println( i + " , " + j );
				j++;
			}
				i++;
				System.out.println();
		}
		
		
		
		
		
	}

}
