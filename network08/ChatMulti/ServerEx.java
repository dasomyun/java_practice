package network08.ChatMulti;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(5959);
			System.out.println("채팅준비중");
			
			while(true) {
				Socket socket = serverSocket.accept();	// 홍길동, 조인성, 이영자
				
				ServerArr arr = new ServerArr(socket);
				arr.start();
			}
			
		} catch (Exception e) {
			System.out.println("ServerEx error");
			e.printStackTrace();
		} finally {
			try {
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
