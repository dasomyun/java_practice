package network03.TCP;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream is = null;
		BufferedInputStream bis = null;
		
		try {
			
			InetSocketAddress isa = new InetSocketAddress(1234);
			serverSocket = new ServerSocket();
			
			serverSocket.bind(isa);
			System.out.println("서버가 연걸을 기다리고 있습니다");	
			
			// accept()를 이용해서 Socket으로 클라이언트와 통신
			socket = serverSocket.accept();
			is = socket.getInputStream();
			bis = new BufferedInputStream(is,512);
			
			byte[] msgByte = new byte[500];
			int count = bis.read(msgByte);
			
			String msg = new String(msgByte, 0, count, "UTF-8");
			System.out.println("[" + socket.getInetAddress() +"] : " + msg);
			
		} catch(Exception e) {
			System.out.println("ServerEx Error");
			e.printStackTrace();
			
		} finally {
			try {
				if(socket != null) socket.close();
				if(is != null) is.close();
				if(bis != null) bis.close();
				if(serverSocket != null) serverSocket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
