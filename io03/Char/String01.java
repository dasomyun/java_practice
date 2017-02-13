package io03.Char;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 13.
 * @���� : ä�� - Ű���忡�� ���Ϸ� �ѱ�� ( PrintWriter ) *�߿�*
 */

public class String01 {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null; 	// ������ ���� ��Ʈ�� (PrintStream, PrintWriter) , ������ ���� �� 
		Scanner sc = null;
		
		try {
			fw = new FileWriter("C:\\Temp\\byte\\c.txt");
			bw = new BufferedWriter(fw,1024);
			pw = new PrintWriter(bw);
			
			System.out.println("���ڿ��� �Է��ϼ���");
			sc = new Scanner(System.in);
			
			while(true) {
				
				String msg = sc.nextLine();	 // String�� �ƴ� �� �پ� �о�鿩�� �ϱ� ���� 
				
				if(msg.equalsIgnoreCase("q")) break;
				
				// bw.write(msg + "\r\n");		// �ٹٲ��� �ȵǱ� ������ (�پ���� ������) ���Ͱ�ó�� 
				pw.println(msg);
				pw.flush();		
			}
			
			System.out.println("��µǾ����ϴ�");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pw != null) pw.close();
				if(sc != null) sc.close();
				if(bw != null) bw.close();
				if(fw != null) fw.close();
			} catch(Exception e) {
				System.out.println("close error");
				e.printStackTrace();
			}
		}
		
	}

}
