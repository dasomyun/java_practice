package ch06;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 25.
 * @���� : ��� - �ϳ��� �迭 ��ü�� ���� 
 */

import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		MyPoint[] array = new MyPoint[10];
		
		for(int i=0; i<array.length; i++) {
			System.out.print("1.��	 2.�簢��   3. ��ü����	  4.���� : ");
			int su = sc.nextInt();
			
			if(su == 1) {
				array[i] = new MyCircle();
				array[i].input();
				
			} else if (su == 2){
				array[i] = new MyRect();
				array[i].input();
				
			} else if (su == 3){
				for(int j=0; j<i; j++){
					array[j].output();
				}
				--i;
				
			} else if (su == 4) {
				sc.close();
				//return ;
				System.exit(0);		// ���α׷� ���� 
			} else {
				System.out.println("�߸� �Է� ����");
				--i;
			}
		}
		
	}

	
	
	
}
