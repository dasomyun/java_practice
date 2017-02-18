package ioQuiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 18.
 * @���� : 24. ���� quiz22.txt ������ �о�� �� , Ű����� �Է� �޾� ������ ���ڿ��� �ִ� ��� ����ϴ� ���α׷��� �ۼ��ϼ��� (���� ��Ʈ�� ���)
 */

public class Quiz24 {

	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;
		Scanner sc = null;
		
		try {
			fr = new FileReader("C:\\Users\\dasom\\Documents\\JavaIoPractice\\quiz22.txt");
			br = new BufferedReader(fr,1024);
			
			sc = new Scanner(System.in);
			System.out.print("���ڸ� �Է� : ");
			String search = sc.next();
			
			while(true) {
				String str3 = br.readLine();
				if(str3 == null) break;
				if(search.equals(str3)){
					System.out.println("������ ���ڿ��� �����մϴ� ["+ search +"]");	
				} 
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
				if(sc != null) sc.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
