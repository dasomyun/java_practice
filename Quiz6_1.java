package ch05;
/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 29
 * @���� :6. Ű����κ��� �Է��� ���ڰ� W �Ǵ� w�̸� woman , M �Ǵ� m�̸� man, 
 * �� �̿��̸� ???�� ȭ��� ǥ���ϴ� ���α׷��� �ۼ��ϼ��� (if��)
 */
import java.io.IOException ; 

public class Quiz6_1 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("�Է� : ");
		char input = (char)System.in.read();
		System.in.read();
		System.in.read();
		
		if(input == 'w' || input == 'W')
			System.out.println("����");
		else if (input == 'm' || input == 'M')
			System.out.println("����");
		else 
			System.out.println("?????");
		
	}

}
