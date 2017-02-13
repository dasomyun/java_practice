package io02.Byte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 13.
 * @���� : ���� ����� - �̹��� �б� ���� ( 01, 02�� ������ ���ؼ� ���� ) 
 * 						FileInputStream , FileOutputStream
 */

public class Byte05 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// �б�
			fis = new FileInputStream ("C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg");
			
			// ���� 
			fos = new FileOutputStream ("C:\\Temp\\byte\\image.jpg"); 	// �����̶� �ܼ�â�� ���� �� ��� ������ ���� 
		
			
			// �̹����� byte�� ������
			byte[] data = new byte[100];  // �ѹ��� 100 ����Ʈ�� �о�ͼ� 100����Ʈ ��� -> �ӵ��� ������		
			
			while(true) {
				int count = fis.read(data);  // �б�
				if(count == -1) break; 
				
				fos.write(data);  // ����
			}
			
			/*
			while(true) {
				int count = fis.read();	// �ѹ��� 4����Ʈ�� ���� �ִ� 1����Ʈ �о�ͼ� 1����Ʈ ���
				if(count==-1) break;
				
				fos.write(count);
			}
			*/
			
			fos.flush();
			
			System.out.println("���� ��� �Ϸ�!");
			
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� ���߽��ϴ�");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("���� ����½� �����Դϴ�");
			e.printStackTrace();
		} finally {
			
			try {
				if(fos != null) fos.close(); 	// 22���ο��� ���� �ɷ��� ���� ����Ͽ� if�� �ۼ� 
				if(fis != null) fis.close();
			} catch(IOException e) {
				System.out.println("���� close ����");
				e.printStackTrace();
			}	
		}
	
		
	}
}
