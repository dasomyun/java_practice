package network07.TCP;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerSender extends Thread {
	
	private Socket socket;
	
	public ServerSender(Socket socket){
		this.socket = socket;
	}
	
	@Override
	public void run() {
		BufferedWriter bw = null;
		PrintWriter pw = null;
		Scanner sc = null;
		
		try {
		bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()),512);
		pw = new PrintWriter(bw);
		sc = new Scanner(System.in);
		
		while(true) {
			String outputMsg = sc.nextLine();
			
			if(outputMsg.equalsIgnoreCase("Q")){
				pw.println(outputMsg);
				pw.flush();
				break;
			}
			
			pw.println("¼­¹ö >> " + outputMsg);
			pw.flush();
			
		}
		
		} catch(Exception e) {
			System.out.println("ServerSender Error");
			e.printStackTrace();
		} finally {
			try {
				if(sc != null) sc.close();
				if(pw != null) pw.close();
				if(bw != null) bw.close();
				if(socket != null) socket.close();
			} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	}
}

