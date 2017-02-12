package io01.File;

import java.io.File;
import java.io.IOException;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 10.
 * @���� : File - ���丮 ���� ���� , ���� 
 */

public class FileEx02 {

	public static void main(String[] args) throws IOException {
		
		File dir = new File("C:\\Temp\\Dir");	// ��θ���
		System.out.println("���丮 ���翩�� : " + dir.exists());
		
		if(dir.exists() == false) {
			dir.mkdirs();	// ���丮 ����
			System.out.println("���丮 �������");
		}
		
		File file = new File(dir, "abc.txt");	 
		if(dir.exists() == true) {
			if(file.isFile() == false){
				file.createNewFile(); 	// ������� ��ο� abc.txt ����
				System.out.println("�����մϴ�");
			}
		}
		
		// ���� 
		if(dir.exists() && file.isFile()) {
			file.delete();
			System.out.println("���� ����");
			
			dir.delete();
			System.out.println("���丮 ����");
		}	
		
	}

}
