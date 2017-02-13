package io04.Console;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 13.
 * @���� : Console �Է� ( InputStream , BufferedInputStream )
 */

public class Console01 {

	public static void main(String[] args) {
		BufferedInputStream bis = null;
		
		try {
			InputStream is = System.in;
			bis = new BufferedInputStream(is); 	// System.in.read();
			
			System.out.print("�����Է� : ");
			char x = (char) is.read();		
			bis.read();		// ���Ͱ� ó�� 
			bis.read();		// ���Ͱ� ó�� 
			System.out.println("x : " + x + "\n\n");
				
			byte[] data = new byte[10]; // korea\r\n 		// byte�� String ���¸� ���� �� ���� 
			System.out.print("�ι�° ���� �Է� : ");
			int count = bis.read(data);  // 7byte
			System.out.println(new String(data,0, count-2) + "\n"); 	// 0, count-2 : ���Ͱ� ó��  // 0~5
			
			byte[] su = new byte[10]; // 22\r\n
			System.out.print("����° ���� �� ���� �Է� : " );
			int cnt = bis.read(su);
			String value = new String(su , 0 , cnt-2);
			int r = Integer.parseInt(value);
			System.out.println(++r);

		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) bis.close();
			} catch(Exception e) {
				System.out.println("close ���� �߻�");
				e.printStackTrace();
			}
		}
		
	}

}
