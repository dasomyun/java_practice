package ch_input;

import java.io.IOException;
import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		char buho = 0;
		int su = 0;
		int value = 0;
		
		do{
					System.out.print("���� �Է��ϼ���:");
					num = sc.nextInt();
					
					System.out.print("��ȣ�� �Է��ϼ���(+,-,*,/):");
					buho = (char)System.in.read();
					System.in.read();
					System.in.read();
					
					System.out.print("���� �Է��ϼ���:");
					su=sc.nextInt();
			}while(buho !='+' && buho !='-' && buho !='*' && buho !='/');
													
						
			switch(buho){
				case '+':
					value = num+su;
					break;
				case '-':
					value = num-su;
					break;
				case '*':
					value = num*su;
					break;
				case '/':
					value = num/su;
					break;
			}
			
			System.out.println(num + "+" + su +"=" + value);
		
		sc.close();
	}
}
