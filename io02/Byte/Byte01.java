package io02.Byte;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 10.
 * @���� : byte ��� - ����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ�� 
 * 			����Ʈ ��� : (���� ���ε忡 ���� ����) �׸�, ��Ƽ�̵��, ���� �� ��� ������ �����͸� ���� �� �ִ�.
			���� ��� : (ä�ý� ���� ����) 
			*���� �������� , �Է�*
 */

public class Byte01 {

	public static void main(String[] args) {
		
		try {
			File file = new File("C:\\Temp\\byte\\a.txt");  // ������ ��  // a.txt �ڵ� ����  
			FileOutputStream fos = new FileOutputStream(file);
			
			byte[] data = new byte[] {'a' , 'p' , 'p' , 'l' , 'e'};
			for(int i=0; i<data.length; i++) {
				// System.out.println(data[i]);
				// ���� ��������
				fos.write(data[i]);
			}
			
			fos.flush();	// ���ۿ� �ܷ��ϴ� �����͸� ������ ��������.
			fos.close();	// �ڿ� �ݳ��ϰ� ��� ��Ʈ���� �ݾƾ� ������ �ս��� ���� �ݵ�� �ݾƾ� �� !
			
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� ���߽��ϴ�");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("���� ����½� ���� �߻�");
			e.printStackTrace();
		}
		

		
		
		
	}
}
