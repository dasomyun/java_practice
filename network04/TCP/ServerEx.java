package network04.TCP;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			InetSocketAddress isa = new InetSocketAddress(7890);
			serverSocket = new ServerSocket();
			serverSocket.bind(isa);
			
			System.out.println("서버 연결 기다리고있습니다");
			socket = serverSocket.accept();
			
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String msg = br.readLine();
			System.out.println("[" + socket.getInetAddress() + "]" + msg);	
			
		} catch(Exception e) {
			System.out.println("ServerEx ERROR!");
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(isr != null) isr.close();
				if(is != null) is.close();
				if(socket != null) socket.close();
				if(serverSocket != null) serverSocket.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
