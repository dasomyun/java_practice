package ch05;
/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 31
 * @���� : 8. ������ �ϳ��� �Է¹޾Ƽ� ��ҹ��ڷ� ��ȯ�ϼ��� 
 */
import java.io.IOException;

public class Quiz8_1 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("������ �ϳ��� �Է� : ");
		char c = (char)System.in.read();
		System.in.read();
		System.in.read();
		
		if(c >= 65 && c < 97) {
			System.out.println((c+=32));
		} else if(c>=97){
			System.out.println((c-=32));
		}
		
		//a=97
		//A=65
	}

}
