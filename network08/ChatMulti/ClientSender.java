package network08.ChatMulti;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSender extends Thread {
	private Socket socket;
	private String nickName;
	
	public ClientSender(Socket socket , String nickName) {
		this.socket = socket;
		this.nickName = nickName;
	}

	@Override
	public void run() {
		BufferedWriter bw = null;
		PrintWriter pw = null;
		Scanner sc = null;
		
		try {
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 512);
			pw = new PrintWriter(bw);
			sc = new Scanner(System.in);
				
			pw.println(nickName);
			while(true) {
				String outputMsg = sc.nextLine();
				if(outputMsg.equalsIgnoreCase("Q")){
				pw.println(outputMsg);
				pw.flush();
				break;
			}	
			pw.println(outputMsg);
			pw.flush();
		}
		} catch(Exception e) {
			System.out.println("ClientSender error");
			e.printStackTrace();
		} finally {
			try {
				if(sc != null) sc.close();
				if(bw != null) bw.close();
				if(pw != null) pw.close();
				if(socket != null) socket.close();
			} catch(Exception e){
				e.printStackTrace();
			}
		}
				
	}
	
}


