package io03.Char;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 13.
 * @���� : ä�� - ����01 �о����  
 */

public class String02 {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("C:\\Temp\\byte\\c.txt");
			br = new BufferedReader(fr, 1024);
			
			while (true) {
				String str = br.readLine();	// ���� �о���� (����Ű ������ ���� ����)
				if( str == null) break;
				System.out.println(str);
			}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) br.close();
				if (fr != null) fr.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
