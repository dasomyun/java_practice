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
	// public static Vector<PrintWriter> vec = new Vector<PrintWriter>(); // ��� �����Ͱ� ����־�� �ϹǷ� static ����
	public static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());
	// thread �۾��� ���ٶ� �۾��� ���ִ°� vector������, �ڹ� 1.5���� ���ĺ��� �÷��� ��ü�� ����ȭ ���ִ� �� �żҵ尡 ������� 
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
			sendPrintAll("#" + nickName + "���� �����̽��ϴ�");
			
			while(true) {
				String inputMsg = br.readLine();
				
				if(inputMsg.equalsIgnoreCase("Q")){
					sendPrintAll("#" + nickName + "�� ä�ù��� �������ϴ�");
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
