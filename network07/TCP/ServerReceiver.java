package network07.TCP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketException;

public class ServerReceiver extends Thread {
	private Socket socket;
	
	public ServerReceiver (Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()),512);
			
			while(true) {
				String inputMsg = br.readLine();
				if(inputMsg.equalsIgnoreCase("Q")){
					System.out.println("채팅방을 나가셨습니다");
					break;
				}
				System.out.println(inputMsg);
			}
			
		} catch (NullPointerException | SocketException e) {	// socket close 는 null을 반환 
			System.out.println("채팅이 종료되었습니다");
		} catch (Exception e) {
			System.out.println("ServerReceiver Error");
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(socket != null) socket.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
