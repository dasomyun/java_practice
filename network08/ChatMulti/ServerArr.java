package network08.ChatMulti;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServerArr extends Thread {
	
	private Socket socket;
	// public static Vector<PrintWriter> vec = new Vector<PrintWriter>(); // 계속 데이터가 살아있어야 하므로 static 선언
	public static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());
	// thread 작업을 해줄때 작업을 해주는게 vector였으나, 자바 1.5버전 이후부터 컬렉션 자체를 동기화 해주는 이 매소드가 만들어짐 
	private PrintWriter pw;
	
	public ServerArr (Socket socket) {
		this.socket = socket;
		this.sendArr();
	}

	public void sendArr() {
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 512);
			PrintWriter pw = new PrintWriter(bw);
			list.add(pw);		
		} catch(Exception e) {
			System.out.println("ServerArr sendArr Function Error");
			e.printStackTrace();
		}
	}
	
	public void sendPrintAll(String str) {
		
		for(int i=0; i<list.size(); i++) {
			PrintWriter pw = list.get(i);
			pw.println(str);
			pw.flush();
		}		
	}
	
	@Override
	public void run() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()),512);
			String nickName = br.readLine();
			sendPrintAll("#" + nickName + "님이 들어오셨습니다");
			
			while(true) {
				String inputMsg = br.readLine();
				
				if(inputMsg.equalsIgnoreCase("Q")){
					sendPrintAll("#" + nickName + "님 채팅방을 나갔습니다");
						list.remove(pw);
						break;
					}
				sendPrintAll(nickName + ">> " + inputMsg);
			}			
			
		} catch (SocketException | NullPointerException e) {
		} catch (Exception e) {
			System.out.println("ServerArr run Function Error");
			e.printStackTrace();
		} 
	}
}
