package ioQuiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 18.
 * @���� : 22. ���� quiz22.txt ������ ������ �� �� �տ� �� ��ȣ�� �ٿ��� ����ϴ� ���α׷��� �ۼ��ϼ��� (���� ��Ʈ�� ���) 
 */
public class Quiz22 {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			// ���
			fw = new FileWriter("C:\\Users\\dasom\\Documents\\JavaIoPractice\\quiz22.txt");
			bw = new BufferedWriter(fw,1024);
			pw = new PrintWriter(bw);
			
			String[] str = new String[] {"cat" , "�����" , "dog" , "��" , "rabbit", "�䳢" };
			for(int i=0; i<str.length; i++){
				pw.println(str[i]);
			}
			
			pw.flush();
			System.out.println("��¿Ϸ� \n");
			
			
			//�Է�
			fr = new FileReader("C:\\Users\\dasom\\Documents\\JavaIoPractice\\quiz22.txt");
			br = new BufferedReader(fr, 1024);
			
			for(int i=1; i<7; i++){
				String str2= br.readLine();
				if(str2 == null) break;
					System.out.println( i + "\t" + str2);
				}
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) fw.close();
				if(bw != null) bw.close();
				if(pw != null) pw.close();
				if(fr != null) fr.close();
				if(br != null) br.close();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
