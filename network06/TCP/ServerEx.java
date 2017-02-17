package network06.TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {

	public static void main(String[] args) {

		ServerSocket ss = null;
		Socket soc = null;
		
		// �Է� 
		BufferedReader br = null;
		
		// ���
		BufferedWriter bw = null;
		PrintWriter pw = null;
		Scanner sc = null;
		
		try {
			
			ss = new ServerSocket(1234);
			System.out.println("���� �غ��� �Դϴ�");
			soc = ss.accept();
			
			// �Է�
			br = new BufferedReader(new InputStreamReader(soc.getInputStream()), 512);
			
			// ���
			bw = new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()), 512);
			pw = new PrintWriter(bw);
			sc = new Scanner(System.in);
			
			String inputMsg = null, outputMsg = null;
			
			while(true) {
				inputMsg = br.readLine();
				
				if(inputMsg.equalsIgnoreCase("Q")) break;
				System.out.println(inputMsg);
				
				outputMsg = sc.nextLine();
				pw.println("���� >> " + outputMsg);
				pw.flush();	
			}
			
		} catch(Exception e) {
			System.out.println("ServerEx Error!");
			e.printStackTrace();
			
		} finally {
			try {
				if(br != null) br.close();
				if(pw != null) pw.close();
				if(bw != null) bw.close();
				if(soc != null) soc.close();
				if(ss != null) ss.close();

			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
