package ch02;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 16.
 * @���� : for �� 
 */
//0�� ��� ���� ��� 
public class Exam18 {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			System.out.print(i + "\t");
			
			if(i%10==0){
				System.out.println( );
			}
		}
		
		System.out.println("\n");
		
		int hap = 0 ;
		for(int i=1; i<=10; i++){
			hap = hap + i; 	// hap +=i;
		}
		System.out.println( "�� : " + hap + "\n\n");
		
		int sum = 0 ;
		for (int i=100; i<=200; i++) {
			if(i>150 && i<200) {
				sum+=i;		//sum=sum+i;
			}
		}
		
		System.out.println("�� :" + sum);
		
		
		
		
		
		
		
		
		
		
	}

}
