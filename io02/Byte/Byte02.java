package io02.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 10.
 * @���� : ���� ����� - ���
 */

public class Byte02 {

	public static void main(String[] args) {
		
		try {
			File file = new File("C:\\Temp\\byte\\a.txt");
			FileInputStream fis = new FileInputStream(file);    // �Է½�Ʈ�� 
			
			/*while(true) {
				int ch = fis.read(); 	//apple (-1) // apple�� ������ ���� -1�ε� -1 �� ������ ������ ������
				if(ch == -1) break;
				System.out.println(ch + "\t" + (char) ch);
			} */
			
			// �ּ��� �Ȱ��� ���� 
			int ch;
			while((ch=fis.read()) !=-1) {
				System.out.println(ch + "\t" + (char) ch);
			}
			
			fis.close();
			
		} catch(FileNotFoundException e) {
			System.out.println("�ش� ������ �������� �ʽ��ϴ�");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("���� ����½� ����");
			e.printStackTrace();
		}
		
	}

}
