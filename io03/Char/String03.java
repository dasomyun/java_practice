package io03.Char;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 13.
 * @���� : txt�� �о�ͼ� �ֿܼ� ��� , String�� �о�ͼ� ���Ϸ� ������ 
 * 			��Ƽ�̵��, �������� ���� ���� ( String ���ε常 ) 
 */

public class String03 {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
			
		try {
			fr = new FileReader("C:\\Temp\\byte\\news.txt");
			br = new BufferedReader(fr, 1024);
			
			fw = new FileWriter("C:\\Temp\\byte\\news_copy.txt");
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			while(true) {
				String str = br.readLine();
				if(str == null) break;		// String�� ���������ڰ� null
				System.out.println(str);
				
				pw.println(str);
			}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pw != null) pw.close();
				if(bw != null) bw.close();
				if(fw != null) fw.close();
				
				if(fr != null) fr.close();
				if(br != null) br.close();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}	
		
	}

}
