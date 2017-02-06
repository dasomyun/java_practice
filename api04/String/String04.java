package api04.String;

import java.io.IOException;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 6.
 * @���� : api - String Ŭ���� 
 * 				byte[] ---> String ��ȯ
 */

public class String04 {
	public static void main(String[] args) {
		
		// ��Ʈ��ũ ���(����, ä��), ���Ͼ��ε� 
		byte[] bytes = {72, 101, 108, 111, 32, 74, 97, 118, 97};
		String str = new String(bytes);
		System.out.println(str);	//toString()�� ȣ��ȴ�. String �� ���������� �ҷ��ͼ� ������ (?)
		System.out.println(str.toString());
		
		String var = new String(bytes , 6 , 4);		//6�������� 4�� -  74, 97, 118, 97
		System.out.println(var + "\n");
		
		// 1byte char ch = (char) System.in.read();
		//2byte (�⺻�ڷ���) Scanner sc = new Scanner(System.in) 
		
		try {
			System.out.println("ù��° �����Է� : ");
			int ch = System.in.read();//A	 //�ƽ�Ű �ڵ� ��ȯ
			System.in.read();
			System.in.read();
			System.out.println("ch : " + (char) ch + "\t" + ch);
			
			byte[] by = new byte[100];
			System.out.println("�ι��� ���� �迭 �Է� : " );
			int count = System.in.read(by);		//100 byte	//
			System.out.println("count : " + count);		///r/s �޺κп� byte ����
			
			String bystr = new String(by);	//���ڵ� �۾��� ���ش� 
			System.out.println("bystr : " + bystr);
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
