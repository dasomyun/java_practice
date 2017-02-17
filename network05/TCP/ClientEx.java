package network05.TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {

	public static void main(String[] args) {
		
		Socket socket = null;
		
		//������
		BufferedWriter bw = null;
		PrintWriter pw = null;
		Scanner sc = null;
		
		//�ޱ�
		BufferedReader br = null;
		
		
		try{
			socket = new Socket("211.63.89.103", 2323);
			
		//���
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 512);
			pw = new PrintWriter(bw);
			
			System.out.print("������ ���� : " );
			sc = new Scanner(System.in);
			String msg = sc.nextLine();
			pw.println(msg);
			pw.flush();
			
		//�Է�
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()), 512);
			String reply = br.readLine();
			System.out.println("���� ������ �亯 : " + reply);
			
			
		} catch(Exception e) {
			System.out.println("ClientEx ERROR!");
			e.printStackTrace();
		} finally {
			try {
				if(sc != null) sc.close();
				if(pw != null) pw.close();
				if(bw != null) bw.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
