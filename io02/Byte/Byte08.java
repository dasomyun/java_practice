package io02.Byte;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 13.
 * @���� : �̹������� , �������� �а� ���� ( 05�� ������ ���� �̿��ϱ� ) *�߿�*
 */

// ���� ���ε� (input, output)�� �� ������ ���� ���� ���
// ������, ��Ƽ�̵�����ϵ� ���� 

public class Byte08 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
				
		try {
	
			fis = new FileInputStream("C:\\Users\\sist\\Desktop\\�޸� ����.xlsx");
			bis = new BufferedInputStream(fis,1024);
			
			fos = new FileOutputStream("C:/Temp/byte/memory.xlsx");
			bos = new BufferedOutputStream(fos, 1024); // fos �� �ᵵ �� 1024�� ����Ʈ 
			
			byte[] data = new byte[65536];
			
			while(true) {
				int count = bis.read(data);
				if(count==-1) break;
				
				bos.write(data);
			}
			
			bos.flush();
			System.out.println("��� �Ϸ�");
			
		} catch(FileNotFoundException e) {
			System.out.println("�ش� ������ �������� �ʽ��ϴ�");
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println("���� ����½� ����");
			e.printStackTrace();
		} finally {
			try {
				if(bos != null) bos.close();
				if(fos != null) fos.close();
				if(bis != null) bis.close();
				if(fis != null) fis.close();
				
			} catch(Exception e) {
				System.out.println("close ���� �߻�");
				e.printStackTrace();
			}
		}
		
	}

}
