package io02.Byte;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 13.
 * @���� : ���� ����� - ���� ��Ʈ�� : �ٸ� ��Ʈ���� ����Ǿ� �������� ���� ����� �����ϴ� ��Ʈ���̸� ���� ��� ���� ��Ʈ���̶�� �Ѵ�.
 * 						BufferdOutputStream / BufferedInputStream
 * 						����� �ҽ��κ��� �ڽ��� ���� ���� ũ�⸸ŭ �����͸� �а� ���ۿ� �����صд�. 
 */

public class Byte06 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			
			fos = new FileOutputStream("C:\\Temp\\byte\\d.txt");
			bos = new BufferedOutputStream(fos , 1024); 	// 1024����Ʈ�� ��Ѵ� ������ 
			
			String str = "�ڹ� ���θ� ������ �ؾ� �˴ϴ�";
			
			bos.write(str.getBytes());	// IOExcepiton �ʿ� 
			bos.flush();	// ���۸� �����
			
			System.out.println("���� ��� �Ϸ�");
			
		} catch(FileNotFoundException e) {
			System.out.println("�ش�� ������ �������� �ʽ��ϴ�");
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println("���� ����½� ����");
			e.printStackTrace();
		} finally {
			try {
				if(bos != null) bos.close();	// �Ųٷ� �ݾ��ִ°� ���� 
				if(fos != null) fos.close();
			} catch (IOException e) {
				System.out.println("Close ���� �߻�");
				e.printStackTrace();
			}
		}
			
	}
}
