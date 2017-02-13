package io02.Byte;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 13.
 * @���� : ���� ��Ʈ�� - DataInputStream / DataOutputStream
 */

public class Byte10 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("C:\\Temp\\byte\\sub.dat");
			dis = new DataInputStream(fis);
			
			String str = dis.readUTF();
			double value = dis.readDouble();
			int su = dis.readInt();
			
			System.out.println("str : " + str);
			System.out.println("value : " + value);
			System.out.println("su : " + su);
		
		} catch (FileNotFoundException e) {
			System.out.println("�ش� ������ �������� �ʽ��ϴ�");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("���� ����½� ����");
			e.printStackTrace();
		} finally {
			try {
				if(dis != null) dis.close();
				if(fis != null) fis.close();
			} catch(Exception e) {
				System.out.println("close ���� �߻�");
				e.printStackTrace();
			}
		}
		
	}
}
