package network08.ChatMulti;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketException;

public class ClientReceiver extends Thread {
	
	private Socket socket;
	
	public ClientReceiver(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()),512);
			
			while(true) {
				String inputMsg = br.readLine();
				if(inputMsg.equalsIgnoreCase("Q")) break;				
				System.out.println(inputMsg);
			}
			
		} catch (SocketException | NullPointerException e){
			System.out.println("채팅이 종료되었습니다");
		} catch(Exception e) {
			System.out.println("ClientReader Error");
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
