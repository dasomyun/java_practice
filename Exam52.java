package ch04;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 19.
 * @���� : public static void function
 */

import java.util.Scanner; 

public class Exam52 {

	public static void main(String[] args) {
		Scanner sc = null;
		
		for(int i=0; i<args.length; i++){
			sc = new Scanner(args[i]);
			
			int value = sc.nextInt();
			++value;
			
			System.out.println(value);
		}

		sc.close();
	}

}
