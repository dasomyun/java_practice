package io02.Byte;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.crypto.Data;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 10.
 * @���� : ���� ����� - String ��� 
 */

public class Byte03 {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("C:/Temp/byte/a.txt");
			FileOutputStream fos = new FileOutputStream(file); 
			
			
			String str = "�ȳ��ϼ���";
			byte[] data = str.getBytes(); // �����ؼ� ������
			fos.write(data);
			
			for(int i=0; i<data.length; i++) {
				fos.write((data[i]));
			}
			
			fos.flush();
			fos.close();
			
			System.out.println("���� ����� �Ϸ� �ƽ��ϴ�");
			
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� ���߽��ϴ�");
			e.printStackTrace();
		} catch (IOException e ) {
			System.out.println("���� ����½� ������ �߻��Ͽ����ϴ�");
			e.printStackTrace();
		}
		
	}

}
