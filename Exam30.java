package ch02;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 17.
 * @���� : 
 */
import java.util.Scanner;
import java.io.IOException;

public class Exam30 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int dan = 0;// , int i = 0 ;
		char loop = 0;
		
		do {
			System.out.print("���� �Է��ϼ��� : ");
			dan = sc.nextInt();
			for(int i=1; i<=9; i++) {
				System.out.println(dan+ "x" + "="+ (dan*i));
			}
			System.out.println();
			System.out.print("���ҷ�?(Y/y): ");
			loop=(char) System.in.read(); //y
				
		} while(loop =='Y' || loop=='y');

		sc.close(); //
		
	}

}
