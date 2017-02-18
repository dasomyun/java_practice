package ioQuiz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 18.
 * @���� : 26. ���� �Ʒ��� ���ȭ���� ���ð� ���Ϸ� ����ϼ��� (���� ��Ʈ�� ���)
 */

public class Quiz26 {

	public static void main(String[] args) {

		Scanner sc = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		
		try {
			fw = new FileWriter("C:\\Users\\dasom\\Documents\\JavaIoPractice\\quiz26.txt"); 
			bw = new BufferedWriter(fw,1024);
			pw = new PrintWriter(bw);
			
			sc = new Scanner(System.in);
			System.out.println("�����͸� �Է����ּ��� ");
			
			while(true){
				String data = sc.nextLine();
				if(data.equalsIgnoreCase("Q")) {
					System.out.println("����Ǽ̽��ϴ�");
					break;
				}
				pw.println(data);
			}
			
			
		}catch (Exception e){
			e.printStackTrace();
		} finally {
			try {
				if(sc != null) sc.close();
				if(bw != null) bw.close();
				if(fw != null) fw.close();
				if(pw != null) pw.close();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
