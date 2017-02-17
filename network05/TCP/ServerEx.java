package network05.TCP;

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

		ServerSocket serverSocket = null;
		Socket socket = null;
		
		//입력
		BufferedReader br = null;
		
		//출력
		BufferedWriter bw = null;
		PrintWriter pw = null;
		Scanner sc = null;
		
		try {
			serverSocket = new ServerSocket(2323);
			System.out.println("서버가 연결을 기다리고 있습니다");
		
		//입력
			socket = serverSocket.accept();
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()), 512);
			String msg = br.readLine();
			System.out.println("[" + socket.getInetAddress() + "] : " + msg + "\n\n");
			
		//출력
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()),512);
			pw = new PrintWriter(bw);
			sc = new Scanner(System.in);
			
			System.out.print("답변 문자 : ");
			String reply = sc.nextLine();
			
			pw.println(reply);
			pw.flush();
			
		} catch(Exception e) {
			System.out.println("ServerEx Error!");
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(pw != null) pw.close();
				if(sc != null) sc.close();
				if(socket != null) socket.close();
				if(serverSocket != null) serverSocket.close();

			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
