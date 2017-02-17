package network02.TCP;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 2. 16.
 * @���� : cmd�� client server ��û, ����
 */

public class ServerEx {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			//Ŭ���̾�Ʈ ���� �غ�
			InetSocketAddress isa = new InetSocketAddress(77);
			
			// ServerSocket - accept()
			serverSocket = new ServerSocket();
			serverSocket.bind(isa); 	// ��Ʈ�� ���������
			System.out.println("������ ������ ��ٸ��� �ֽ��ϴ�");
			
			//Socket
			socket = serverSocket.accept(); // �����¿� Ŭ���̾�Ʈ ���� ���� ���� 
			System.out.println("Ŭ���̾�Ʈ IP �ּ� : " + socket.getInetAddress());
		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
				if(serverSocket != null) serverSocket.close();
 			} catch(Exception e) {
 				e.printStackTrace();
 			}
		}
		
	}

}
