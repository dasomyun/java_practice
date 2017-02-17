package network02.TCP;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @작성자 : 윤다솜
 * @날짜 : 2017. 2. 16.
 * @내용 : cmd로 client server 요청, 수락
 */

public class ServerEx {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			//클라이언트 접속 준비
			InetSocketAddress isa = new InetSocketAddress(77);
			
			// ServerSocket - accept()
			serverSocket = new ServerSocket();
			serverSocket.bind(isa); 	// 포트를 열어놓으면
			System.out.println("서버가 연결을 기다리고 있습니다");
			
			//Socket
			socket = serverSocket.accept(); // 대기상태에 클라이언트 접속 연결 수락 
			System.out.println("클라이언트 IP 주소 : " + socket.getInetAddress());
		
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
