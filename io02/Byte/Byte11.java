package io02.Byte;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 13.
 * @���� : ���� ��Ʈ�� - ���ļ� ���� �ִ�?
 */

public class Byte11 {

	public static void main(String[] args) {
		 
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos  = null;
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		
		try {
			File file = new File("C:\\Temp\\byte\\sub.dat");
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos,1024);
			dos = new DataOutputStream(bos); // bos ���� �����ְ� bos�� fos���� ������ 
			
			dos.writeUTF("ȫ�浿");
			dos.writeDouble(98.8);
			dos.writeInt(10);
			dos.flush();
			System.out.println("��¿Ϸ�");
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis,1024);
			dis = new DataInputStream(bis);
			
			String str = dis.readUTF();
			double value = dis.readDouble();
			int su = dis.readInt();		
			System.out.println(str + "\t" + value + "\t" + su);
			
		} catch (FileNotFoundException e) {
			System.out.println("�ش� ������ �������� �ʽ��ϴ�");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("���� ����½� ����");
			e.printStackTrace();
		} finally {
			try {
				if(dis != null) dis.close();
				if(bis != null) bis.close();
				if(fis != null) fis.close();
				
				if(dos != null) dos.close();
				if(bos != null) bos.close();
				if(fos != null) fos.close();
			} catch(Exception e) {
				System.out.println("close ���� �߻�");
				e.printStackTrace();
			}
		}
		
		
	}

}
