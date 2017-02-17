package network07.TCP;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(7890);
			System.out.println("���� ä�� �غ��� ... ");
			
			socket = serverSocket.accept();
			
			// �Է�
			ServerReceiver r = new ServerReceiver(socket);
			r.start();
			
			// ���
			ServerSender s = new ServerSender(socket);
			s.start();
			
		} catch(Exception e) {
			System.out.println("ServerEx error");
			e.printStackTrace();
		} finally {
			try{
				if(serverSocket != null) serverSocket.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
