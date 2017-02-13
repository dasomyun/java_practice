package io02.Byte;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 13.
 * @���� : ���� ����� - ������Ʈ�� �о���� 
 * 						BufferdOutputStream / BufferedInputStream
 */

public class Byte07 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			
			fis = new FileInputStream("C:\\Temp\\byte\\d.txt");
			bis = new BufferedInputStream(fis, 1024); 	// ���� ����� 1024, ��Ʈ��ũ 512
			
			byte[] data = new byte[50];		// �ѹ��� ���� �� �ִ� ����Ʈ�� �ִ�ġ : 65536
			int count = bis.read(data);
			System.out.println(new String(data , 0 , count)); 	// new String(data)
			
		} catch (FileNotFoundException e) {
			System.out.println("�ش������� �������� �ʽ��ϴ�");
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("����½� ���� �Դϴ�");
			e.printStackTrace();
			
		} finally {
			try {
				if(bis != null) bis.close();
				if(fis != null) fis.close();
			} catch(Exception e) {
				System.out.println("Close ���� �߻�");
				e.printStackTrace();
			}
		}
		
 		
	}

}
