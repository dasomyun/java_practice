package network08.ChatMulti;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(5959);
			System.out.println("ä���غ���");
			
			while(true) {
				Socket socket = serverSocket.accept();	// ȫ�浿, ���μ�, �̿���
				
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
