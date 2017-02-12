package io02.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 10.
 * @���� : ���� ����� - �Է� String
 */

public class Byte04 {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("C:\\Temp\\byte\\a.txt");
			FileInputStream fis = new FileInputStream(file);
			
			byte[] msg = new byte[65536];
			// System.out.println(new String(msg));
			int count = fis.read(msg);
			System.out.println(new String(msg , 0 , count));	// �� ����� �ְ� ( �̰� �� ���� ) 
															
			byte[] data = new byte[2];							// �� ����� �ִ� ( �ӵ��� ���� �� ���� )
			while(true) {							 	
				int cnt = fis.read(data);
				if(cnt == -1) break;
				System.out.println(new String(data));
			}
			
			fis.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("�ش� ���� �������� ����");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("���� ����½� ���� ");
			e.printStackTrace();
		}
		
	}

}
