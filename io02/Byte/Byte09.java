package io02.Byte;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 13.
 * @���� : ���� ��Ʈ�� - DataInputStream / DataOutputStream
 * 						����Ʈ ��Ʈ������ �ڹ��� �⺻ ������ Ÿ���� �����
 * 						(�̷��� �ֱ��� ������) 
 */

public class Byte09 {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("C:\\Temp\\byte\\sub.dat");
			dos = new DataOutputStream(fos);
			
			dos.writeUTF("ȫ�浿");
			dos.writeDouble(95.3);
			dos.writeInt(10);
			
			dos.flush();
			System.out.println("��� �Ϸ�");
			
		} catch(FileNotFoundException e) {
			System.out.println("�ش� ������ �������� �ʽ��ϴ�");
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println("���� ����½� ����");
			e.printStackTrace();
		} finally {
			try {
				if(dos != null) dos.close();
				if(fos != null) fos.close();
			} catch (Exception e) {
				System.out.println("close ���� �߻�");
				e.printStackTrace();
			}
		}
		
	}

}
